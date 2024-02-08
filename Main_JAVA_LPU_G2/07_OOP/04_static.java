class Student{
    public String name;
    public int id;
    public static String uniName;

    public void output(){
        System.out.println("Name : " + name + " ID : " + id + " university : " + uniName);
    }

    public static void myStaticMethod(){
        System.out.println("From static method : " + uniName);
    }

    // public static void myStaticMethod1(Student obj){
    //     System.out.println("From static method : " + obj.name);
    // }
}


class LPU{
    public static void main(String args[]){
        Student s1 = new Student();

        s1.name = "Aanand";
        s1.id = 1;

        Student s2 = new Student();
        s2.name = "Azhar";
        s2.id = 2;

        Student.uniName = "LPU";

        s1.output();
        s2.output();

        Student.myStaticMethod();
    }
}


//Difference between static and instance variables
/*
    - Static variable 
        - Shared by all the instances of the class.
        - Can be accessed directly using class name.
        - Only one copy exists regardless the number of instances of the class.
    
    -Instance Variables
        - Each instance has its own copy.
        - Can be accessed through class instance.
        - Each object will have its own copy of the instance variable.
 */