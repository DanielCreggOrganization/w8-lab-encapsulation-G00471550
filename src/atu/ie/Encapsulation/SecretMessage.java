package atu.ie.Encapsulation;

public class SecretMessage {
     private String message;

    public SecretMessage(String message) {
        this.message = message;
    }

    public void displayMessage() {
        System.out.println("Secret Message: " + message);
    }
}
