class A{
    void thisMethodIsHavingAVeryLongName(){
        System.out.println("From A");
    }
}

class B extends A{
    @Override
    void thisMethodIsHavingAVeryLongName(){
        System.out.println("From B");
    }

    @Deprecated
    void oldMethod(){

    }
}

class LPU{
    public static void main(String args[]){
        B obj = new B();

        obj.thisMethodIsHavingAVeryLongName();

        obj.oldMethod();
    }
}
