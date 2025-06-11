class pattern6{
    public static void main(String[] args){
        int n=5;
        for(int i=0;i<n;i++){
            int nums=1;
            for(int j=n;j>i;j--){
                System.out.print(nums);
                nums++;
            }
            System.out.println();
        }
    }
}