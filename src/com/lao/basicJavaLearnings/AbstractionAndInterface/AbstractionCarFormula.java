package com.lao.basicJavaLearnings.AbstractionAndInterface;

public abstract class AbstractionCarFormula {

//    public void CarEngineMasterCopy(){
//        System.out.println("Master copy for the Car Engine");
//    }
//    public void CarDesignMasterCopy(){
//        System.out.println("Master copy for the Car Design");
//    }

    // here you see we have removed the block code, and change it to abstract
    public abstract void CarEngineMasterCopy();

    public abstract void CarDesignMasterCopy();

    // We can't create an Object in abstract class
//    AbstractionCarFormula abstractionCarFormula = new AbstractionCarFormula();  - 'AbstractionCarFormula' is abstract; cannot be instantiated

    // we call it as partial implementation
    public void CarColorMasterCopy(){
        System.out.println("Master copy for the Car Color");
    }


}
