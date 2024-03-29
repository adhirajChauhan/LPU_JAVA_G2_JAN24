class LPU{
    public static void main(String args[]){
        try{
            int a = 30/0;
            System.out.println(a);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("From finally block");
        }
        System.out.println("At the end");
    }
}

//finally block is always executed wheather an exception is handled or not
//for each try block there can be only one finally block