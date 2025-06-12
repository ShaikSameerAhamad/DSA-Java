
import java.util.Arrays;

public class BinarySearch {
    static int Search(int[] arr,int left,int right,int target){
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else if(arr[mid]>target){
                right=mid-1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] arr={9,3,5,1,7,2,8,4,10};
        int target=3;
        Arrays.sort(arr);
        int index=Search(arr,0,arr.length-1,target);
        System.out.println("Found at index:"+index);
    }
}
