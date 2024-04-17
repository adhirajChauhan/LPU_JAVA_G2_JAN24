// class MyGenericClass<T>{
//     T data;

//     MyGenericClass(T data){
//         this.data = data;
//     }

//     T getData(){
//         return this.data;
//     }
// }

// class Test{
//     <T> void print(T data){
//         System.out.println("Data is : " + data);
//     }
// }

class MyGeneric<T extends Number>{
    void print(){
        System.out.println("Hello");
    }
}

class LPU{
    public static void main(String args[]){
        // MyGenericClass obj1 = new MyGenericClass(5);

        // MyGenericClass obj2 = new MyGenericClass("Hello");

        // System.out.println(obj1.getData());

        // Test obj1 = new Test();

        // obj1.print(4.445);

        MyGeneric<Integer> obj1 = new MyGeneric();
    }
}

//Code Reusability -> we can create generic method and use to perform operations indiiferent data types.