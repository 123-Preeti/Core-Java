 class loop1 {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 100){
            System.out.println("\t" + i);
            i++;
        }
        do { 
            System.out.println("\t" + i);
            i++;
        } while (i <= 200);
        for(i=0; i <= 100; i++)
        System.out.println("\t"+ i);
    }
}
