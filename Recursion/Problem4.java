public class Problem4 {
   //Parameterized Approach
   static void sumOfNum1(int i,int sum){
      if(i<1){
         System.out.println("Using Parameterized:"+sum);
         return;
      }
      sumOfNum1(i-1, sum+i);
   }
   //Functional Approach
   static int sumOfNum2(int n){
      if(n==0){
         return 0;
      }
      return n+sumOfNum2(n-1);
   }

   public static void main(String[] args) {
      int n=5;
      sumOfNum1(n,0);
      int res=sumOfNum2(n);
      System.out.println("Using Functional:"+res);
   } 
}
