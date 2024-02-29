class A{
    void test1(){
        System.out.println("From A");
    }

    static class B{
        void test2(){
            System.out.println("From B");
        }
    }
}

class LPU{
    public static void main(String args[]){
        A obj = new A();

        // A.B obj1 = obj.new B(); //non static inner class

        A.B obj1 = new A.B(); //static inner class

        // obj.test1();

        obj1.test2();
    }
}