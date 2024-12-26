package com.lao.basicJavaLearnings.AbstractionAndInterface.Interfaces;

import com.lao.basicJavaLearnings.AbstractionAndInterface.AbstractionCarFormula;

public class CombinationAbstractInterfaceBMW extends AbstractionCarFormula implements UpcomingCarModel, UpcomingMiniProjects {
    @Override
    public void CarEngineMasterCopy() {
        System.out.println("Master copy for the Car Engine From Main Car Formula: BMW");
    }

    @Override
    public void CarDesignMasterCopy() {
        System.out.println("Master copy for the Car Design From Main Car Formula: BMW");
    }

    // Interface Implements methods
    // Interface methods: UpcomingCarModel
    @Override
    public void modelBmwX1() {
        System.out.println("This is the " + bmwX1);
    }

    @Override
    public void modelBmwX2() {
        System.out.println("This is the " + bmwX2);
    }

    @Override
    public void modelBmwX3() {
        System.out.println("This is the " + bmwX3);
    }

    @Override
    public void projectAudio() {
        System.out.println("This is the JBL sound for BaseModel");
    }

    @Override
    public void projectLight() {
        System.out.println("This is the LED Headlight for BaseModel");
    }

    @Override
    public void projectAlloyWeels() {
        System.out.println("This is the Alloy Wheel for BaseModel");
    }

    public void projectAlloyWeels(String material) {
        System.out.println("This is the " + material + " Wheel for BaseModel");

    }

    public static void main(String[] args) {

        // we can't use the same implement interface method are twice, so tha we create new object
        CombinationAbstractInterfaceBMW combinationAbstractInterfaceBMW = new CombinationAbstractInterfaceBMW();
        combinationAbstractInterfaceBMW.projectAlloyWeels("Steel");
        // Formula get it from Main Car file
        AbstractionCarFormula bmwCar = new CombinationAbstractInterfaceBMW();
        bmwCar.CarEngineMasterCopy();
        bmwCar.CarDesignMasterCopy();

        UpcomingCarModel upcomingCarModel = new CombinationAbstractInterfaceBMW();
        upcomingCarModel.modelBmwX1();
        upcomingCarModel.projectAudio();
        upcomingCarModel.projectLight();
        upcomingCarModel.projectAlloyWeels();
        upcomingCarModel.modelBmwX2();
        upcomingCarModel.modelBmwX3();

    }


}
