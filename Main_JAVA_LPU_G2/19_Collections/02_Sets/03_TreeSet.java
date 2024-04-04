import java.util.TreeSet;
import java.util.Iterator;

class LPU{
    public static void main(String args[]){

        TreeSet<Integer> set1 = new TreeSet<>();

        set1.add(2);
        set1.add(3);
        set1.add(5);

        System.out.println(set1);

        // Iterator<Integer> itr = set1.iterator();

        // while(itr.hasNext()){
        //     System.out.println(itr.next());
        // }

        set1.removeAll(set1);
        System.out.println(set1);

    }
}