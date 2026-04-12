public class ArrayInsert {
    public static void main(String[] args) {

        int count = 0;

        InsertElementArray o = new InsertElementArray();

        int a[] = new int[10];
//        a[0] = 10;
//        a[1] = 20;
//        a[2] = 30;
//        a[3] = 40;
//        a[5] = 50;

  
        for (int j = 0; j <a.length; j++) {
           o.insert(a, j);
        }


        for(int i = 0; i <a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public void insert(int a[], int val){
        a[count++] = val;
    }

}
