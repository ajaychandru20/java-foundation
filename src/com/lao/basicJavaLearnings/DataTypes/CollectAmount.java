package com.lao.basicJavaLearnings.DataTypes;

//In this class, we learned return type
public class CollectAmount {

    public Integer amountCollected = 100;

    public String setAmountCollected() {

        System.out.println("Amount Collected From Shop: " + amountCollected);
        return "Myson gave the Amount to me";
    }

    public static void main(String[] args) {
        CollectAmount mySon = new CollectAmount();
        String isHeReturn = mySon.setAmountCollected();
        System.out.println(isHeReturn);


    }

}