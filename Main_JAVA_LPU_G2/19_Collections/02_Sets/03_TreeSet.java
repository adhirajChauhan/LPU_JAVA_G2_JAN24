import java.util.TreeSet;
import java.util.Iterator;

class LPU{
    public static void main(String args[]){

        TreeSet<Integer> set1 = new TreeSet<>();

        set1.add(2);
        set1.add(4);
        set1.add(5);
        set1.add(6);


        System.out.println(set1);

        // Iterator<Integer> itr = set1.iterator();

        // while(itr.hasNext()){
        //     System.out.println(itr.next());
        // }

        // set1.removeAll(set1);
        // set1.remove(5);

        // System.out.println(set1.first());
        // System.out.println(set1.last());

        // System.out.println(set1.pollFirst());
        // System.out.println(set1.pollLast());

        // System.out.println(set1.higher(3));
        // System.out.println(set1.lower(4));
        // System.out.println(set1.ceiling(3));
        // System.out.println(set1.floor(3));

        // System.out.println(set1.headSet(5));
        // System.out.println(set1.headSet(5, true));


        // System.out.println(set1.tailSet(4));
        // System.out.println(set1.tailSet(4, false));

        // System.out.println(set1.subSet(2, 5));
        System.out.println(set1.subSet(2, true, 5, true));


        // System.out.println(set1);

    }
}