    import java.util.*;
    
    class Main{
        public static void main(String[]args){
            Scanner scn=new Scanner(System.in);
            
            int n=scn.nextInt();
            int[]arr=new int[n];
            for(int i=0;i<n;i++){
              arr[i]=scn.nextInt();  
            }
            int start=0;
            int end=n-1;
            while(start<end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
            for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
}
        }   
    }