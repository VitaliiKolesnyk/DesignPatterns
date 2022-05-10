package patterns.behavioral.mediator.chat;


import patterns.behavioral.mediator.user.Admin;
import patterns.behavioral.mediator.user.SimpleUser;
import patterns.behavioral.mediator.user.User;

import java.util.ArrayList;
import java.util.List;

public class TextChat implements Chat {
    private User admin;
    private List<User> users = new ArrayList<>();
    
    public void setAdmin(User admin) {
        if (admin != null && admin instanceof Admin) {
            this.admin = admin;
        } else {
            
        }
    }
    
    public void addUser(User user) {
        if (admin == null) {
            throw new RuntimeException("Admin is missing");
        }
        if (user instanceof SimpleUser) {
            users.add(user);
        } else {
            throw new RuntimeException("Illegal access");
        }
    }

    @Override
    public void sendMessage(String message, User user) {
        if (user instanceof Admin) {
            for (User u : users) {
                u.getMessage(message);
            }
        }
        if (user instanceof SimpleUser) {
            for (User u : users) {
                if (u != user && u.isEnabled()) {
                    u.getMessage(message);
                }
            }
            if (admin.isEnabled()) {
                admin.getMessage(message);
            }
        }
    }
}
