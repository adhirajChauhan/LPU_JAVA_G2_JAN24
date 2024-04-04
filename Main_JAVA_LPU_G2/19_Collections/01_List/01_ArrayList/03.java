import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

class LPU{
    public static void main(String args[]){

        //Convert an ArrayList to Array

        // ArrayList<String> list1 = new ArrayList<>();

        // list1.add("Book");
        // list1.add("Table");
        // list1.add("Pen");

        // System.out.println(list1);

        // String arr[] = new String[list1.size()];

        // list1.toArray(arr);

        // for(String item : arr){
            
        //     System.out.println(item);
        // }



        //Convert Array to ArrayList
        String arr[] = {"Book", "Table", "Pen"};

        for(String item : arr){

            System.out.println(item);
        }

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list1);
    }
}




//Write a Java program to shuffle elements in a linked list.

//Write a Java program to extract a portion of a array list.