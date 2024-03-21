class LPU{
    public static void main(String args[]){

        try{
            // int a = 2/0;
            String str = null;
            System.out.println(str.length());
            
            System.out.println("In try block");
        }
        catch(Exception e){
            // System.out.println(e);
            System.out.println("Cannot divide by zero");

        }

        System.out.println("Outside try catch");
        
    }
}

//exception handling -> in this we handle the runtime errors so that the normal flow of the app is not hampered.

//Exception -> Runtime -> indexOutOfBoundException, NullPointerException, ArithmeticException

//try{
    //exception code
//}

//catch{
    //handle
//}

//try block is used to enclose the code that might throw an exception. If an exceptions occurs at any particular statement in try block, rest of the block code will not execute.

//catch is used to handle the exception by declaring the type of exception within the parameter.