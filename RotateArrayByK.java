    import java.util.*;
    
    class Main{
        public static void main(String[]args){
            Scanner scn=new Scanner(System.in);
            
            int n=scn.nextInt();
            int k=scn.nextInt();
            int[]arr=new int[n];
            
            for(int i=0;i<n;i++){
              arr[i]=scn.nextInt(); 
            }
            rotateArray(arr,k);
            for(int nums:arr){
                System.out.print(nums+" ");
            }
            
        }  
        public static void reverseArray(int[]arr,int start,int end){
            while(start<end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
        public static void rotateArray(int[]nums,int k){
            int n=nums.length;
            if(n==0)return;
            if(k<0)k=k+n;
            reverseArray(nums,0,n-1);
            reverseArray(nums,0,k-1);
            reverseArray(nums,k,n-1);
            
        }
    }