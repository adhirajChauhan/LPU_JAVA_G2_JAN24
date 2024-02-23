class A {
    void method1(){
        System.out.println("From B");
    }
}

class B extends A{

}

class LPU{
    public static void main(String args[]){
        //Complile time / early binding
        //Runtime / late binding

        //Upcasting - If the reference variable of Parent class refers to the object of child class.

        // B obj = new B();
        A obj = new B();

        obj.method1();

    }
}
