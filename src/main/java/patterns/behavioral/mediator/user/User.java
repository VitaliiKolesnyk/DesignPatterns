package patterns.behavioral.mediator.user;

import patterns.behavioral.mediator.chat.Chat;

public abstract class User {
    private Chat chat;
    private String name;
    private boolean isEnabled = true;

    public User(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

   public  abstract void getMessage(String message);

    @Override
    public String toString() {
        return "User{" +
                "chat=" + chat +
                ", name='" + name + '\'' +
                ", isEnabled=" + isEnabled +
                '}';
    }
}
