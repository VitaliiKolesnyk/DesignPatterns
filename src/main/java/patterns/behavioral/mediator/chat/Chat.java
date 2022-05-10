package patterns.behavioral.mediator.chat;

import patterns.behavioral.mediator.user.User;

public interface Chat {
    void sendMessage(String message, User user);
}
