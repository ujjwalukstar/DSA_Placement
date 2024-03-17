package Arrays;

public class first_occ {
    public static int f_occ(int n, int t, int[] arr) {
        int res = -1;
        for (int i = 0; i < n; i++) {
          if (arr[i] == t) {
            res = i;
            break;
          }
        }
        return res;
      }
      public static void main(String args[]) {
        int n = 7;
        int t = 13;
        int[] arr = {3,4,13,13,13,20,40};
    
        
        System.out.println(f_occ(n, t, arr));
      }
    
}
