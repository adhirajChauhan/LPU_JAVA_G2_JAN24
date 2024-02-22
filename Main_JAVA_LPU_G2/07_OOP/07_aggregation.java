class Address{
    String city;
    String state;

    public Address(String city, String state){
        this.city = city;
        this.state = state;
    }
}

class Student{

    String name;
    int id;
    Address address;

    public Student(String name, int id, Address address){
        this.name = name;
        this.id = id;
        this.address = address;
    }

    void display(){
        System.out.println("Name : " + name + " | " + " ID : " + id + " | " 
        + "City : " + address.city + " | " + " State : " + address.state);
    }
}

class LPU{
    public static void main(String args[]){

        Address a1 = new Address("Mohali", "Punjab");

        Student s1 = new Student("John", 1, a1);

        s1.display();
    }
}
