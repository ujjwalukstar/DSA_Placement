package Arrays;

public class search {
    public static void binarySearch(int arr[],int low,int high,int target){
        int mid = (low + high)/2;  
    
   while( low <= high ){  
      if ( arr[mid] < target ){  
        low = mid + 1;     
      }else if ( arr[mid] == target ){  
        System.out.println("Element is found at index: " + mid);  
        break;  
      }else{  
         high = mid - 1;  
      }  
      mid = (low + high)/2;  
   }  
   if ( low> high ){  
      System.out.println("Not Present");  
   }  
    }
    public static void main(String[] args) {
        int arr[]={3,7,12,16,20};
        int n=arr.length;
        int target=16;
        int high=arr[n-1];
      
        binarySearch(arr,0,high,target);
        
    }
    
}
