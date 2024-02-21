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

class Animal{
    void eat(){
        System.out.println(" i can eat");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println(" i can bark");
    }
}

class Tiger extends Animal{
    void roar(){
        System.out.println(" i can roar");
    }
}

//Heirarchical 
//--------------------------------------------------------------


class LPU{
    public static void main(String args[]){

        Dog d1 = new Dog();
        d1.bark();

        Tiger t1 = new Tiger();
        t1.roar();

        Animal a1 = new Animal();
        a1.eat();
    }
}
