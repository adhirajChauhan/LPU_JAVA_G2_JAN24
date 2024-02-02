class Add{

    int a = 5;

    public int sum(int num1, int num2){
        int result = num1 + num2;
        System.out.println(a);
        return result;
    }
    
    // public double sum(double num1, double num2){
    //     return num1 + num2;
    // }

    // public int sum(int num1, int num2, int num3){
    //     return num1+num2+num3;
    // }
}

class LPU{
    public static void main(String args[]){
        int n1 = 5;
        int n2 = 10;
        int n5 = 12;

        Add obj1 = new Add(); //obj1 is reference variable
        int output = obj1.sum(n1, n2);
        System.out.println(obj1.a);
        
    }
}
