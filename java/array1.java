public class array1 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9,0};
        // for(int i = 1; i < arr.length; i++){  //print all numbers
        //     System.out.println(arr[i]);
        // }

        //print even numbers
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
    }
}
