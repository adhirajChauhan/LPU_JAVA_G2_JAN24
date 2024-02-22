// class Animal{
//     void eat(){
//         System.out.println("I can eat");
//     }
// }

// class Dog extends Animal {
//     void bark(){
//         System.out.println("I can bark");
//     }
// }

//Single inheritance
//-----------------------------------------------------------------------

// class Animal{
//     void eat(){
//         System.out.println("i can eat");
//     }
// }

// class Dog extends Animal{
//     void bark(){
//         System.out.println(" i can bark");
//     }
// }

// class babyDog extends Dog{
//     void weep(){
//         System.out.println(" i can weep");
//     }
// }

//Multi Level
//--------------------------------------------------------------------------

// class Animal{
//     void eat(){
//         System.out.println(" i can eat");
//     }
// }

// class Dog extends Animal{
//     void bark(){
//         System.out.println(" i can bark");
//     }
// }

// class Tiger extends Animal{
//     void roar(){
//         System.out.println(" i can roar");
//     }
// }

//Heirarchical 
//--------------------------------------------------------------

// class A{
//     void test(){
//         System.out.println("Hello");
//     }
// }

// class B{
//     void test(){
//         System.out.println("Hey");
//     }
// }

// class C extends A
// {

// }
//Not supported

class LPU{
    public static void main(String args[]){

        // Dog d1 = new Dog();
        // d1.bark();

        // Tiger t1 = new Tiger();
        // t1.roar();

        // Animal a1 = new Animal();
        // a1.eat();
    }
}





// Create a program to manage different types of vehicles in a transportation system. Each vehicle has a unique identification number and a maximum speed. Vehicles can be of different types such as cars, trucks, and bicycles.

// Cars have an additional attribute: the number of passengers it can carry.
// Trucks have an additional attribute: the maximum weight they can carry.
// Bicycles do not have any additional attributes.
// Implement the following functionalities:

// Create a superclass named "Vehicle" with attributes:
// identificationNumber (String)
// maxSpeed (double)
// Create subclasses named "Car", "Truck", and "Bicycle" inheriting from the "Vehicle" superclass.
// For each subclass, implement a constructor that initializes the attributes along with appropriate getters and setters.
// Implement a method in each subclass to display the details of the vehicle.
// In the main class, create instances of each type of vehicle and demonstrate inheritance by calling methods from the superclass and subclasses.