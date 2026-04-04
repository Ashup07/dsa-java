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
            for(int j=1;j<n;j++){
               if(arr[start]!=arr[j]){
                   start++;
                   arr[start]=arr[j];
               }
            }
            for(int i=0;i<start+1;i++){ 
                System.out.print(arr[i]+" ");
            }
        }   
    }