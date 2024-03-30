import java.util.HashSet;
import java.util.Set;

class LPU{
    public static void main(String args[]){

        Set<Integer> set1 = new HashSet<>();

        set1.add(10);
        set1.add(9);

        System.out.println("Set 1 : " + set1);

        Set<Integer> set2 = new HashSet<>();

        set2.add(10);
        set2.add(3);

        System.out.println("Set 2 : " + set2);

        set2.addAll(set1);
        System.out.println("Union is : " + set2);
    }
}


//Set cannot contain duplicate elements