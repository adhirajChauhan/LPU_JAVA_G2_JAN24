abstract class A{
    abstract void print();
    abstract void hello();
}

// class B extends A{
//     void print(){
//         System.out.println("Hello");
//     }
// }
class LPU{
    public static void main(String args[]){
        A obj = new A(){
            void print(){
                System.out.println("Hey");
            }

            void hello(){
                System.out.println("Hello");
            }
        };

        obj.print();
        obj.hello();
    }
}





// Create an abstract class Book with the following properties:
// title (String): Title of the book.
// author (String): Author of the book.
// yearOfPublication (int): Year the book was published.
// Implement abstract methods display() and calculateLateFees(int daysLate).
// Create two subclasses of Book:
// Fiction: Represents fiction books. It should have an additional property genre (String).
// NonFiction: Represents non-fiction books. It should have an additional property topic (String).

// Create a class Library which contains an array or a collection to store books.
// Implement methods for adding books to the library, displaying all books, and calculating late fees for all books in the library.