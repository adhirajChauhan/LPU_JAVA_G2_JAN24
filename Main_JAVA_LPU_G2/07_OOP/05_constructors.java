class Person{

    public String name;
    public int age;

    //default constructor
    public Person(){
        System.out.println("From Constructor method");
        name = "Hello";
        age = 20;
    }

}

class LPU{
    public static void main(String a[]){

        //Constructors

        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();


        // p1.age = 11;
        // System.out.println(p1.name);
        // System.out.println(p2.name);

    }
}
