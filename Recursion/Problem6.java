//Reverse of an Array
public class Problem6 {
    // using 2 variables l, r
    static void reverseArray1(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        reverseArray1(arr, l + 1, r - 1);
    }

    // using 1 variable
    static void reverseArray2(int[] arr, int i, int n) {
        if (i >= n / 2) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;
        reverseArray2(arr, i + 1, n);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 4};
        int n = arr.length;

        // First approach
        reverseArray1(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();

        // Second approach 
        int[] arr2 = {1, 3, 2, 5, 4};
        reverseArray2(arr2, 0, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i]);
        }
    }
}
