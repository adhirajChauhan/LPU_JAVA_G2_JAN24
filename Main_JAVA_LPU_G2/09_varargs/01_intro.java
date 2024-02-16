
class Test{
    public int add(int ... n){ //{2,3,4,5,6,7}
    
        int sum = 0;
        for(int i : n){
            sum += i;
        }

        return sum;
    }
}

class LPU{
    public static void main(String args[]){
        Test obj1 = new Test();

        // System.out.println(obj1.add(2,3,4,5)); 

        System.out.println(args[0]);
    }
}
