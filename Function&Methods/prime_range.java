public class prime_range {
   
       
            public static boolean isprime(int n){
                if(n==2){
                return true;
                }
        
                for(int i=2;i<=Math.sqrt(n);i++){ //optimized and normal (i<=n-1)
        
                    if(n%i==0){
                    return false;
                }
            }
                return true;
            }

            public static void isPrimeinRange(int n){
            for(int i=2;i<=n;i++){
                if(isprime(i)){
                    System.out.print(i+ " ");
                }
            }
                System.out.println();
            }
            public static void main(String[] args) {
            
            isPrimeinRange(4);
    }
}
