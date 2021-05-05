package com.silva.PokedexAPI.api.model.message;

public class MessageApi {
    private String message;

    public MessageApi(String message) {
        this.message = message;
    }

    public static MessageApi getMessage(String message) {
        return new MessageApi(message);
    }
}
