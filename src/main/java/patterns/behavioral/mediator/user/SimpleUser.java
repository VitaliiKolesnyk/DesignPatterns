package patterns.behavioral.mediator.user;

import patterns.behavioral.mediator.chat.Chat;

public class SimpleUser extends User {

    public SimpleUser(Chat chat, String name) {
        super(chat, name);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("User " + getName() + " receives message " + message);
    }
}
