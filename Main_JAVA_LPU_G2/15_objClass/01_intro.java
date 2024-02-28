class Student{
    int rollNo;
    String Subject;

    public String toString() {
        return "Student [rollNo=" + rollNo + ", Subject=" + Subject + "]";
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + rollNo;
        result = prime * result + ((Subject == null) ? 0 : Subject.hashCode());
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (rollNo != other.rollNo)
            return false;
        if (Subject == null) {
            if (other.Subject != null)
                return false;
        } else if (!Subject.equals(other.Subject))
            return false;
        return true;
    }

    // public String toString(){
    //     return "Hello";
    // }

    // public boolean equals(Student other){
    //     if(this.Subject.equals(other.Subject) && this.rollNo == other.rollNo){
    //         return true;
    //     }
    //     else return false;
    // }

    
    
}

class LPU{
    public static void main(String args[]){
        Student obj1 = new Student();
        obj1.Subject = "JAVA";
        obj1.rollNo = 22;

        Student obj2 = new Student();
        obj2.Subject = "JAVA";
        obj2.rollNo = 22;

        // System.out.println(obj1);
        // System.out.println(obj2);

        // boolean ans = ;
        System.out.println(obj1.equals(obj2));

    }
}
