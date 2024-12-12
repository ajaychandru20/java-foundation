package com.lao.basicJavaLearnings.StaticKeyword;

public class StaticBlock {

    // java by default call the static block first, and also it will be executed the order wise, then it consider the main static block
    static {
        System.out.println("Print the static first block");
    }
    static {
        System.out.println("Print the static second block");
    }

    public static void main(String[] args) {
        System.out.println("Print the main static block");
    }
    static {
        System.out.println("Print the static fourth block");
    }
    static {
        System.out.println("Print the static third block");
    }
}
