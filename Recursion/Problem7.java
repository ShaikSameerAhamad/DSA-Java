public class Problem7 {
    static boolean isPalindrome(int i, String str){
        int n=str.length();
        if(i>=n/2){
            return true;
        }
        if(str.charAt(i)!=str.charAt(n-i-1)){
            return false;
        }
        return isPalindrome(i+1, str);
    }
    public static void main(String[] args) {
        String str="racecr";
        System.out.println(isPalindrome(0,str));

    }
}
