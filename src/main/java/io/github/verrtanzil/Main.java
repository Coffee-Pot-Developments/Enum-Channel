package io.github.verrtanzil;

import io.github.verrtanzil.enums.enumMessages;
import io.github.verrtanzil.managers.MessageHandler;

public class Main {
    public static void main(String[] args) {
        MessageHandler messageHandler = new MessageHandler();
        System.out.print(messageHandler.Message(enumMessages.MESSAGE_TWO));
    }
}
