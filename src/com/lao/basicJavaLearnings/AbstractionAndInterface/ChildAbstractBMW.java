package com.lao.basicJavaLearnings.AbstractionAndInterface;

public class ChildAbstractBMW extends AbstractionCarFormula {

    @Override
    public void CarEngineMasterCopy() {
        System.out.println("Master copy for the Car Engine From Main Car Formula: BMW");
    }

    @Override
    public void CarDesignMasterCopy() {
        System.out.println("Master copy for the Car Design From Main Car Formula: BMW");
    }

    public static void main(String[] args) {
        // Formula get it from Main Car file
        AbstractionCarFormula bmwCar = new ChildAbstractBMW();
        bmwCar.CarEngineMasterCopy();
        bmwCar.CarDesignMasterCopy();


    }
}
