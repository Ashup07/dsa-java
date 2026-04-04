    import java.util.*;
    
    class Main{
        public static void main(String[]args){
            Scanner scn=new Scanner(System.in);
            
            int n=scn.nextInt();
            int[]arr=new int[n];
            HashMap<Integer,Integer>map=new HashMap<>();
            for(int i=0;i<n;i++){
              arr[i]=scn.nextInt(); 
              map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            }
            
            for(int i :map.keySet()){
            System.out.println("The Frequency of "+i+" in array is "+map.get(i));
            }
        }   
    }