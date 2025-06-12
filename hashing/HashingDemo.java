package hashing;
import java.util.Scanner;
public class HashingDemo {
    static int f(int key,int[] arr){
        int count=0;
        for(int i:arr){
            if(i==key){
                count=count+1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter n:");
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    for(int i:arr){
        System.out.print(f(i,arr)+"\t");
    }
    }
}

