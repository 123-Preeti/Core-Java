public class array1 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9,10, 23, 45,81};
        for(int i = 1; i < arr.length; i++){  //print all numbers
            System.out.println(arr[i]);
        }

        // print even numbers
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                System.out.println(arr[i]);
            }
        }

        //print numbers at even index
        for (int i = 0; i < arr.length; i++){
            if(i % 2 ==0){
                System.out.println(arr[i]);
            }
        }

        //print even nos followed by odd nos
        for(int i = 0; i< arr.length; i++){
            if(arr[i] % 2 == 0){
                System.out.println(arr[i]);
            }
        }
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                System.out.println(arr[i]);
            }
        }

        //print 2 digit numbers 
        for(int i =0 ; i<arr.length; i++) {
            if(arr[i] > 9 && arr[i] < 100){
            System.out.println();
            }
        }

        //print square funtion
        for(int i =0 ; i < arr.length; i++){
            System.out.printf("%.2f\n", Math.sqrt(arr[i]));
        }

        // print cube 
        for(int i =0; i< arr.length; i++){
            System.out.printf("%.2f\n",Math.pow(arr[i]),3);
        }


        //sum of even numbers
        double sum = 0;
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                sum = sum + arr[i];
            }
            System.out.println(sum);
        }

        //sum of odd nos
          for(int i = 0 ; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                sum = sum + arr[i];
            }
            System.out.println(sum);
        }

        //sum of 2 digits nos
          for(int i = 0 ; i < arr.length; i++){
            if(arr[i] > 9 && arr[i] < 100){
                sum = sum + arr[i];
            }
            System.out.println(sum);
        }
        
         //sum of positive nos
          for(int i = 0 ; i < arr.length; i++){
            if(arr[i] > 0){
                sum = sum + arr[i];
            }
            System.out.println(sum);
        }

        //product of even programs
            double prod = 1;
            for(int i = 0; i < arr.length ; i++){
                if(arr[i] % 2 == 0){
                    prod = prod * arr[i];
                }
            }

              //product of odd programs
            for(int i = 0; i < arr.length ; i++){
                if(arr[i] % 2 != 0){
                    prod = prod * arr[i];
                }
            }

              //product of 2 digits programs
            for(int i = 0; i < arr.length ; i++){
                if(arr[i] > 9 && arr[i] < 100){
                    prod = prod * arr[i];
                }
            }

               //product of positive programs
            for(int i = 0; i < arr.length ; i++){
                if(arr[i] > 9 ){
                    prod = prod * arr[i];
                }
            }

            //count of even numbers in the array
            int count = 0 ;
            for(int i = 0; i < arr.length; i++){
                if(arr[i]%2 == 0){
                    count++;
                }
                System.out.println(count);
            }

             //count of numbers divisible by 5 in the array
            for(int i = 0; i < arr.length; i++){
                if(arr[i]% 5== 0){
                    count++;
                }
                System.out.println(count);
            }
             //count of 3 digits nos
            for(int i = 0; i < arr.length; i++){
                if(arr[i] > 99 && arr[i] < 1000){
                    count++;
                }
                System.out.println(count);
            }

             //count of numbers nos ending with 5
            for(int i = 0; i < arr.length; i++){
                if(arr[i]% 10 == 5){
                    count++;
                }
                System.out.println(count);
            }

    }

}
