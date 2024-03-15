@FunctionalInterface
interface A{
    int add(int num1, int num2);
}

class LPU{
    public static void main(String args[]){

        // A obj = new A() {
        //     public int add(int num1, int num2){
        //         return num1 + num2;
        //     }
        // };

        A obj = (num1, num2) -> num1 + num2;

        System.out.println(obj.add(2,4));

    }
}









//Write a JAVA program using lambda expression to check if a number is prime