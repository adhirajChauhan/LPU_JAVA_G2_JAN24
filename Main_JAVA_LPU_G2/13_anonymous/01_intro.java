class Calculate{
    int a;

    public Calculate(int n){
        a = n;
    }

    void area(){
        int area = a * a;
        System.out.println("Area :" + area);
    }

    void perimeter(int b){
        int peri = 4 * b;
        System.out.println("Perimeter : " + peri);
    }
}

class LPU{

    public static void main(String a[]){

        new Calculate(5).area();
        new Calculate(5).perimeter(100);
    }
    
}