
// class A implements Runnable{
//     public void run(){

//         for(int i = 0; i <= 50; i++){

//             System.out.println("Task 1");

//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class B implements Runnable{
//     public void run(){

//         for(int i = 0; i <= 50; i++){

//             System.out.println("Task 2");

//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

class LPU {
    public static void main(String args[]) {
        Runnable obj1 = () -> {

            for (int i = 0; i <= 50; i++) {

                System.out.println("Printing From 1");

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        };

        Runnable obj2 = () -> {

            for (int i = 0; i <= 50; i++) {

                System.out.println("From 2");

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
