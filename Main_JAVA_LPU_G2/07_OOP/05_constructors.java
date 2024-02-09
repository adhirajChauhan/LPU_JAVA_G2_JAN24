class Person{

    public String name;
    public int age;
    public int mob;

    //default constructor
    public Person(){
        System.out.println("In Default constructor");
    }

    public Person(String name, int age){
        System.out.println("In Param constructor 1");
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, int mob){
        System.out.println("In Param constructor 2");
        this.name = name;
        this.age = age;
        this.mob = mob;
    }

    public Person(Person p){
        this.name = p.name;
        this.age = p.age;
        this.mob = p.mob;
    }


}

class LPU{
    public static void main(String a[]){

        //Constructors

        Person p1 = new Person("Hello",11);

        Person p2 = new Person();

        Person p3 = new Person("World", 22, 9999);

        Person p4 = new Person(p3);

        System.out.println(p1.age);
        System.out.println(p2.age);

        System.out.println(p3.name + " : " + p3.age + " : " + p3.mob);

        System.out.println("From p4 : " + p4.name);

    }
}


/*
    - A constructor is a block of code similar to a class.
    - It is called when an instance of a class is created.
    - Every time an object is created using new keyword, at least one constructor is called
    - Java compiler provides a default constructor by default, this constructor is called is there is no constructor is available in the class

    - Rules
    - Constructor name must be same as its class name
    - Constructor should have no erturn type
 */








//  Create a Java program to model a simple car rental system. The system should allow users to rent a car and display the details of rented cars.

// Your task is to implement a Car class with the following specifications:

// The Car class should have private instance variables for color, model, year, and rentalStatus.
// It should have a constructor that initializes color, model, and year when a new Car object is created, and sets rentalStatus to false initially.
// Implement getter methods to retrieve the values of the instance variables.




