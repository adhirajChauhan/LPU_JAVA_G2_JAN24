class Animal{

}

class Dog extends Animal{

}

class LPU{
    public static void main(String args[]){
        //instanceof

        // String name = "Hello";

        // boolean a = name instanceof String;
        // System.out.println(a);;

        // LPU obj = new LPU();
        // boolean b = obj instanceof LPU;
        // System.out.println(b);

        Dog d1 = new Dog();

        System.out.println(d1 instanceof Animal);

    }
}


//instanceof operator is used to check wheather an object is an instance of a particular class or not.