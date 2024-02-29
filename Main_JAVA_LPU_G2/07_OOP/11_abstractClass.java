abstract class Car{

    Car(){
        System.out.println("Constructor of Car");
    }

    abstract void acceleration();

    void playMusic(){ //concrete methods

    }
}

class Ford extends Car{
    void acceleration(){
        System.out.println("Ford is Speeding up ");
    }
}

class Tata extends Car{
    void acceleration(){
        System.out.println("Tata is Speeding up ");
    }
}

class LPU{
    public static void main(String args[]){
        Car obj = new Ford(); //upcasting
        obj.acceleration();
        obj.playMusic();

        Car objTata = new Tata();
        objTata.acceleration();
    }
}



// -> Absttraction is a process of hiding the implementation detail and showing only functionality to the user.
 
// -> Abstract class must be declared with an abstract keyword
// -> It can have abstract and non-abstract(concrete) methods.
// -> It cannot be instantiated.
// -> If a subclass is extended from abstract class, it must define the abstract methods of the parent class
// -> abstract modifier is not applicable for variables.
// -> abstract method cannot be private
// -> abstract method cannot be static






// Write a Java program to create an abstract class Animal with abstract methods eat() and sleep(). Create subclasses Lion, Tiger, and Deer that extend the Animal class and implement the eat() and sleep() methods differently based on their specific behavior.



//Write a Java program to create a base class Shape with methods draw() and calculateArea(). Create three subclasses: Circle, Square, and Triangle. Override the draw() method in each subclass to draw the respective shape, and override the calculateArea() method to calculate and return the area of each shape.