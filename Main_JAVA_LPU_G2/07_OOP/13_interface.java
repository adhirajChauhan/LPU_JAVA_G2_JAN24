interface Food{
    void eat();
}

class Nonveg implements Food{
    public void eat(){
        System.out.println("Only non veg food");
    }
}

class Veg implements Food{
    public void eat(){
        System.out.println("Only veg food");
    }
}

class Soup implements Food{
    public void eat(){
        System.out.println("Drinkink soup");
    }
}

class Dog{
    void eating(Food obj){
        obj.eat();
    }
}

class LPU{
    public static void main(String args[]){
        Dog d1 = new Dog();
        Veg v1 = new Veg();
        Nonveg n1 = new Nonveg();
        Soup s1 = new Soup();

        d1.eating(s1);
    }
}
