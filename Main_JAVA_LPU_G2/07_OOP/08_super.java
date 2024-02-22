class A{
    public A(){ //a1
        System.out.println("From A");
    }

    public A(int n){ //a2
        System.out.println("From A int");
    }

    public A(int n1, int n2){
        System.out.println("From A int twice");
    }
}

class B extends A{
    public B(){ //B1
        this(5);
        System.out.println("From B");
    }

    public B(int n){ //B2
        System.out.println("From B int");
    }
}

class LPU{
    public static void main(String args[]){
        
        A a1 = new B();
    }
}
