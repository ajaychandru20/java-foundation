package com.lao.basicJavaLearnings.ErrorHandeling;

public class SingleTryMultipleCatch {

    static String username;

    public static void main(String[] args) {

        try {
            int username_length = username.length();
            System.out.println(username_length);
        } catch (NullPointerException ne) {
            System.out.println(ne + " " + "Mention the name properly!");
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
