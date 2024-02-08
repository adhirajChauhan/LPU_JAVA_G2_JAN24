class Student{
    private String myName = "Hello";
    private int rollNumber;
    private int marks;

    public String getMyName() {
        return myName;
    }
    public void setMyName(String abc) {
        this.myName = abc;
    }
    public int getRollNumber() {
        return rollNumber;
    }
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }

}

class LPU{
    public static void main(String args[]){
        Student s1 = new Student();

        System.out.println("Before " + s1.getMyName());

        s1.setMyName("World");

        System.out.println("After " + s1.getMyName());

    }
}