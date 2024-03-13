class A{
    void print(){
        System.out.println("From A");
    }

    void output(){
        System.out.println("From Output A");
    }
}

// class B extends A{
//     void print(){
//         System.out.println("From B");
//     }
// }

class LPU{
    public static void main(String args[]){
        A obj = new A(){
            void print(){
                System.out.println("From main");

            }
            
            void output(){
                System.out.println("From output main");
            }
            
        };
        obj.print();
        obj.output();
    }
}
