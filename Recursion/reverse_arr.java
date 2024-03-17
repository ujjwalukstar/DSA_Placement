package Recursion;

public class reverse_arr {
    public static void swap(Integer arr[], int a, int b) {
        Integer temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static boolean rev_arr(int n, Integer[] arr, int i) {
        if (i >= n / 2) {
            return false;
        }
        swap(arr, i, n - i - 1);
        rev_arr(n, arr, i + 1);
        return false;
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        Integer arr[] = new Integer[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
        Integer arr[] = {2, 3, 4, 5, 6};
        int n = arr.length;

        rev_arr(n, arr, 0);

        System.out.println("Reversed array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
