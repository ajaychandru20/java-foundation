package com.lao.basicJavaLearnings.AbstractionAndInterface;

public class ChildAbstractTATA extends AbstractionCarFormula {

    @Override
    public void CarEngineMasterCopy() {
        System.out.println("Master copy for the Car Engine From Main Car Formula: TATA");
    }

    @Override
    public void CarDesignMasterCopy() {
        System.out.println("Master copy for the Car Design From Main Car Formula: TATA");
    }

// Class 'ChildAbstractTATA' must either be declared abstract or implement the abstract method 'CarDesignMasterCopy()' from 'AbstractionCarFormula'.
// If we declare the main abstract method but do not use or override the abstract parent void method, the class forces us to declare the child class as abstract.
//    @Override
//    public void CarDesignMasterCopy() {
//        System.out.println("Master copy for the Car Design From Main Car Formula: TATA");
//    }

    public static void main(String[] args) {

        // Formula get it from Main Car file
        AbstractionCarFormula tataCar = new ChildAbstractTATA();
        tataCar.CarEngineMasterCopy();
        tataCar.CarDesignMasterCopy();


    }
}
