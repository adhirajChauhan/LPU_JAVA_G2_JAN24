@FunctionalInterface
interface A{
    void print(int num1, int num2);
}

// class B implements A{
//     public void print(){
//         System.out.println("From print");
//     }
// }

class LPU{
    public static void main(String args[]){
        // A obj = new A()
        // {
        //     public void print(int num){
        //         System.out.println("From main print " + num);
        //     }
        // };

        //void return type and no parameters
        // A obj = () -> {System.out.println("From main print");};

        // A obj = () -> System.out.println("From main print");


        //with parameters

        // A obj = (int num) -> System.out.println("From main print " + num);

        //we can also remove return type of argument
        // A obj = (num) -> System.out.println("From main print " + num);

        //for multiple arguments, we have to write them in paranthesis
        A obj = (num1, num2) -> System.out.println("From main print " + num1 + " : "  + num2);

        //if we have single argument, we can write wiithout paranthesis
        // A obj =  num -> System.out.println("From main print " + num);


            
        



        obj.print(2, 3);
    }
}
