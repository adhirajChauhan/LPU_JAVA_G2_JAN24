class Account{

    private String accName = "Hello";
    private int accBalance = 100;
    private int accNumber = 1234;

    public int getAccBalance(){
        return accBalance;
    }

    public void setAccBalance(int val){
        accBalance = val;
    }

    public String getAccName(){
        return accName;
    }

    public void setAccName(String val){
        this.accName = val;
    }
}

class LPU{
    public static void main(String args[]){
        //Encapsulation

        Account a1 = new Account();

        System.out.println("Old Balance : " + a1.getAccBalance());
        System.out.println("Old Name : " + a1.getAccName());

        a1.setAccBalance(50);
        a1.setAccName("World");

        System.out.println("New Balance : " + a1.getAccBalance());
        System.out.println("New Name : " + a1.getAccName());

    }
}

//Encapsulation is a process of wrapping data members and member functions together in a single unit

