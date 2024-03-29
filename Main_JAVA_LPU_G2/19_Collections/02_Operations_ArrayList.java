import java.util.ArrayList;

class LPU{
    public static void main(String args[]){
        ArrayList<String> arrList1 = new ArrayList<>();

        arrList1.add("Mercury");
        arrList1.add("Venus");
        arrList1.add("Earth");

        // System.out.println("ArrayList of Strings  : " + arrList1);

        //Iterate through an ArrayList

        for(String str : arrList1){
            System.out.println(str);
        }

        // arrList1.add("Mars");
        // System.out.println("ArrayList of Strings  after : " + arrList1);

        // arrList1.add(1, "Mars");

        //Find size
        // System.out.println(arrList1.size());

        //Getting element
        // System.out.println("Element at 2 is : " + arrList1.get(2));

        //Setting element
        // arrList1.set(1, "Mars");


        // arrList1.remove(1);
        
        // arrList1.removeAll(arrList1);

        // System.out.println("ArrayList of Strings after : " + arrList1);

        ArrayList<String> clonedArrList = (ArrayList<String>)arrList1.clone();
        System.out.println(clonedArrList);
    }
}




//Write a Java program that swaps two element in an ArrayList





// Create a Java program to manage a list of student names using ArrayList. The program should allow users to add new student names, remove existing student names, and display all student names.

// Your program should include the following methods:

// addStudent(String name): This method adds a new student name to the list.
// removeStudent(String name): This method removes a student name from the list.
// displayAllStudents(): This method displays all the student names stored in the list.
// Write a Java program that implements the above methods and demonstrates their functionality.