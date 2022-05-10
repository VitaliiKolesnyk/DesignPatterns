package patterns.behavioral.mediator;

import patterns.behavioral.mediator.chat.TextChat;
import patterns.behavioral.mediator.user.Admin;
import patterns.behavioral.mediator.user.SimpleUser;
import patterns.behavioral.mediator.user.User;

public class Main {
    public static void main(String[] args) {
        TextChat chat = new TextChat();
        
        User admin = new Admin(chat, "SuperUser");
        User u1 = new SimpleUser(chat, "Jack");
        User u2 = new SimpleUser(chat, "Bob");
        
        chat.setAdmin(admin);
        chat.addUser(u1);
        chat.addUser(u2);
        
        u1.sendMessage("Hello, I am User 1");
        admin.sendMessage("Admin entered chat");
    }
}
