/*
    JVM (Java virtual machine)
    It prodies a runtime environment in which Java bytecode can be executed. It can also run those programs which are written in other languages and compiled to Java bytecode

    JRE (Java Runtime Environment)
    It is a set of software tools and libraries + other files which are used for developing and it provides the runtime environment

    JDK (Java Development Kit)
    It helps us to deveop Java applications, it contains JRE + development tools.

    JVM JRE JDK are platform dependent because the configuration of each OS is diferent however Java is platform independent.
*/

class Intro{
    public static void main(String args[]){
        // System.out.println("Hello World");

        // int num1 = 5;
        // int num2 = 10;
        // int result = num1 + num2;

        // float num3 = 10.5f;
        // byte num4 = 22;
        // Boolean val = true;
        // long num5 = 1111111111111L;
        // double num6 = 99999d;
        // System.out.println(num4);


        //-------------------Type conversion

        // int num1 = 5;
        // double num2 = num1; //automatic

        // System.out.println(num2);
        // System.out.println(num1);

        double num1 = 15.5;
        int num2 = (int) num1;
        System.out.println(num2);
        System.out.println(num1);
    }
}

