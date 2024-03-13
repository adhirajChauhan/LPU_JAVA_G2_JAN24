interface A{
    void print();
}

interface B extends A{
    void show();
}

class C implements B{
    public void print(){
        System.out.println("From print");
    }

    public void show(){
        System.out.println("From show");
    }
}

class LPU{
    public static void main(String args[]){
        C obj = new C();

        obj.print();
        obj.show();
    }
}
