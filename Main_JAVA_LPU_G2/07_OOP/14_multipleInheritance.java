// class A{
//     void show(){
//         System.out.println("From A");
//     }
// }

// class B{
//     void show(){
//         System.out.println("From B");
//     }
// }

interface A{
    // void show();
    void display();
}

interface B{
    void show();
}

class C implements A,B{
    public void show(){
        System.out.println("Showing");
    }

    public void display(){
        System.out.println("Display");
    }
}

class LPU{
    public static void main(String args[]){

        C obj = new C();

        obj.show();
        obj.display();
    }
}