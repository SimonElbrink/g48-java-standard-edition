package se.lexicon.model;

import java.security.SecureRandom;
import java.util.Random;

public class User {

   private final String username;
   private String password;

   private boolean expired;

    // WHO IS THIS? = More fields?

    public User(String username) {
        this.username = username;
        newPassword();
    }

    public User(String username, String password) {
        this(username, password, false);
    }

    public User(String username, String password, boolean expired) {
        this.username = username;
        this.password = password;
        this.expired = expired;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void newPassword(){
        this.password = generateRandomPassword();
    }

    public boolean isExpired() {
        return expired;
    }

    private String generateRandomPassword(){
        String allowedCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int passwordLength = 10;
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new SecureRandom();

        for (int i = 0; i < passwordLength; i++) {
            int randomIndex = random.nextInt(allowedCharacters.length());
            char randomChar = allowedCharacters.charAt(randomIndex);
            stringBuilder.append(randomChar);
        }

        return stringBuilder.toString();
    }

    public String UserInfo(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("User Info:").append("\n");
        stringBuilder.append("username ").append(username).append("\n");
        stringBuilder.append("password ").append(password).append("\n");

        return stringBuilder.toString();
    }


}
