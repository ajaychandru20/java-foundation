package com.lao.basicJavaLearnings.ErrorHandeling;

import java.io.*;

public class TryCatchFinallyExample {

    /**
     * Finally block will run, if the something is fails in try or catch
     * it is mostly used in closing DB, file close like that...
     **/


    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("file.txt");
            char[] buffer = new char[100];
            reader.read(buffer);
            System.out.println("File read successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            /**
             * The only times finally won't be called are:
             *
             * Threads Close or Error
             * If you invoke System.exit()
             * If you invoke Runtime.getRuntime().halt(exitStatus)
             * even It runs after the return type in try block
             * If the JVM crashes first
             * If the JVM reaches an infinite loop (or some other non-interruptable, non-terminating statement) in the try or catch block
             * If the OS forcibly terminates the JVM process; e.g., kill -9 <pid> on UNIX
             * If the host system dies; e.g., power failure, hardware error, OS panic, et cetera
             * If the finally block is going to be executed by a daemon thread and all other non-daemon threads exit before finally is called
             *
             * **/

            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
            System.out.println("Cleanup completed.");
        }
    }
}
