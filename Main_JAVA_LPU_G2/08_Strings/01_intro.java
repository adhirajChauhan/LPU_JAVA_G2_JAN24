class LPU{
    public static void main(String args[]){

        // String name = "Hello";

        // char charArray[] = {'h', 'e', 'l', 'l', 'o'};
        // String obj1 = new String(charArray);

        // System.out.println(obj1);


        // String myName = new String("Hello");

        // System.out.println(myName + " World");

        // System.out.println(myName);

        String s1 = " ";
        String s2 = "World";
        String s3 = "Hello";

        

        // System.out.println(s1 + " : " + s3);
        // System.out.println(s1.charAt(0));
        System.out.println(s1.isEmpty());
    }
}

//In JAVA, strings are an object that represents sequence of char values
// Strings in java are immutable (cannot be changed)
//Whenever we create a string in JAVA, the JVM checks the "String constant Pool" first, if the string already exist in the pool, a reference to the pooled instance is returned, if the string doesn't exist, a new string instance is created in the pool
// This makes JAVA memory efficient, because no new objects are created if it already exists in SCP.
