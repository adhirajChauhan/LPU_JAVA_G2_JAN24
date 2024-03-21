class LPU{
    public static void main(String args[]){
        try{
            // int a = 2/0;
            int a[] = new int[5];
            // a[1] = 2/0;

            System.out.println("Hello World");
            System.out.println("Hello World");
            System.out.println("Hello World");
            System.out.println("Hello World");


            System.out.println(a[10]);

        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

        System.out.println("Outside Try catch");
    }
}

//At one time only one exception occurs and at a time only one catch block is executed