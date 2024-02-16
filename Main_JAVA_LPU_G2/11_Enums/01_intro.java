import java.util.Enumeration;

enum Levels{
    EASY,
    MEDIUM,
    HARD
}



class LPU{
    public static void main(String args[]){


        //enums
        Levels enumType = Levels.EASY;
        
        if(enumType == Levels.EASY){

        }

        switch (enumType) {
            case EASY:
                System.out.println("Easy");
                break;
            case MEDIUM:
                System.out.println("Medium");
                break;
            case HARD:
                System.out.println("Hard");
                break;
            default:
                System.out.println("None");
                break;
        }
    

    }
}
