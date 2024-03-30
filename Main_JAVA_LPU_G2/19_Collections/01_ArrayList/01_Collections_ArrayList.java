import java.util.ArrayList;

class LPU{
    public static void main(String args[]){

        //ArrayList<Type> arrayList = new ArrayList<>();

        ArrayList<String> arrayListStrings = new ArrayList<>();

        // ArrayList<int> a1 = new ArrayList<>();
        //We cannot use primitive types to create an arrayList
        //So we have to use the corresponding wrapper class

        ArrayList<Integer> arrayListInteger =  new ArrayList<>();

        arrayListStrings.add("Mercury");
        arrayListStrings.add("Venus");
        arrayListStrings.add("Earth");
        arrayListStrings.add("Mars");

        System.out.println(arrayListStrings);

        
    }
}

// We use ArrayList class to implement the functionality of resizable array.
//It can automatically adjust the capacity when we add or remove elements from it. (dynamic arrays).

//Collections Framework -> provides a set of interfaces and classes, it includes other interfaces like Collection interface, Map, Iterator

//Collection interface is the root interface of collections framework
