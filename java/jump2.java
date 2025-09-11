 class jump2 {
    public static void main(String[] args) {
        int j,k;
        abc:
        for(j=0; j<5; j++){
            System.out.println("j =" + j);
            for(k =0; k<5; k++){
            System.out.println("k :"+k);
            if(j ==k){
                break abc;
            }
            }
        }
    }
}
