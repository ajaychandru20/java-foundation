package com.lao.basicJavaLearnings;

// In this class, we covered Data type, Objects,  and wrapper class.

public class BankAccount {
    Long accountNumber = 1234567890l;
    String accounterName = "Ajay";
    Integer accountBalance = 100;

    public void printDetails(){
        System.out.println("Your name is: " + accounterName + " , " + "Your bank balance is: " + accountBalance);
    }
    public static void main(String args[]){
        BankAccount bankAccount = new BankAccount();
        bankAccount.printDetails();
    }
}
