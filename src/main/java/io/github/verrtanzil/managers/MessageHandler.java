package io.github.verrtanzil.managers;

import io.github.verrtanzil.enums.enumMessages;

public class MessageHandler {
    private enumMessages text;

    public enumMessages Message(final enumMessages text) {
        return this.text = text;
    }

    @Override
    public String toString() {
        return String.valueOf(text);
    }
}
