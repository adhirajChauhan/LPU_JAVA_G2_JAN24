class LPU{
    public static void main(String args[]){
        // for(int i = 0; i < 4; i++){
        //     for(int j = 0; j < 4; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.print("\n");
        // }

        // for(int i = 0; i < 4; i++){
        //     for(int j = 0; j <= i; j++){
        //         System.out.print("* ");   
        //     }
        //     System.out.print("\n");
        // }

        // for(int i = 0; i < 4; i++){
        //     for(int j = 0; j <= i; j++){
        //         System.out.print(j + " ");   
        //     }
        //     System.out.print("\n");
        // }

        for(int i = 1; i <= 5 ; i++){
            for(int j = 0; j < 5 - i + 1; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }


}
