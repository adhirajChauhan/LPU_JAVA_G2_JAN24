class A{
    public void print(){
        System.out.println("From A");
    } 
}

class B extends A{
    public void print(){
        System.out.println("From B");

    }
}

class C extends A {
    public void print(){
        System.out.println("From C");

    }
}
class LPU{
    public static void main(String args[]){
        //poly morphism
        //many  forms

        // int a = 5;
        // int b = 10;
        // System.out.println(a + b);

        // String c = "Hello ";
        // String d = "World";
        // System.out.println(c + d);

        B b1 = new B();
        b1.print();

        C c1 = new C();
        c1.print();

    }
}
