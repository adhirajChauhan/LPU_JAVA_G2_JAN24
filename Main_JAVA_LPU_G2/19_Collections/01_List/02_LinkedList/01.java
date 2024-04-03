import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

class LPU{
    public static void main(String args[]){

        Deque<String> ll1 = new LinkedList<>();

        ll1.add("Mercury");
        ll1.add("Venus");
        ll1.add("Earth");
        ll1.add("Mars");

        System.out.println(ll1);

        ll1.addFirst("Jupiter");
        // ll1.add(1, "Jupiter");

        System.out.println(ll1);


        // System.out.println(ll1.get(1));


        Queue<String> ll2 = new LinkedList<>();

        ll2.add("Hey 1");

        // ll2.ad

    }
}



//LinkedList
// - Implements List, Queue and Deque Interface
// - Stores 3 values (prev add, data and next add)
// - Provides the doubly-linked list implementation
// - Whenever an element is added, prev and next address are changed

//ArrayList
// - Implements List Interface
// - Stores a single value
// - Provides a resizable array implementation
// - Whenever an element is added, all elements after that position are shifted