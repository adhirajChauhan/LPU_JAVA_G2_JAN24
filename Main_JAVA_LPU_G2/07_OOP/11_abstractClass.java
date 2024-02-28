abstract class Car{

    abstract void acceleration();

    void playMusic(){ //concrete methods

    }
}

class Ford extends Car{
    void acceleration(){
        System.out.println("Sppeding up ");
    }
}

class LPU{
    public static void main(){
        Car obj = new Ford(); //upcasting
        obj.acceleration();
        obj.playMusic();
    }
}
