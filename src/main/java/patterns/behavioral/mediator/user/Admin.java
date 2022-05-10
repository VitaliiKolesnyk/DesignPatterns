package patterns.behavioral.mediator.user;

import patterns.behavioral.mediator.chat.Chat;

public class Admin extends User {
    public Admin(Chat chat, String name) {
        super(chat, name);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("Admin " + getName() + " receives message " + message);
    }
}
