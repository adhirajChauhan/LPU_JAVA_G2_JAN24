
class MyCustomException extends Throwable{

    public MyCustomException(String str){
        super(str);
    }
}

class LPU{
    public static void main(String args[]){
        int i = 100;
        int j = 0;

        try{
            j = 10/i;
            
            if(j == 0){
                // throw new ArithmeticException("Output zero is not acceptable");

                //custom exception
                throw new MyCustomException("Output zero is not acceptable");
            }
        }
        catch(MyCustomException e){
            System.out.println("From my custom exception " + e);
        }

        catch(ArithmeticException e){
            j = 10/1;
            System.out.println("Default value is : " + e);
        }

        System.out.println(j);
    }
}
