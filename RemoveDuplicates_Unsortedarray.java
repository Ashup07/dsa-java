    import java.util.*;
    
    class Main{
        public static void main(String[]args){
            Scanner scn=new Scanner(System.in);
            
            int n=scn.nextInt();
            int[]arr=new int[n];
            
            for(int i=0;i<n;i++){
              arr[i]=scn.nextInt(); 
              
            }
            HashMap<Integer,Integer>map=new HashMap<>();
            for(int i:arr){
                if(!map.containsKey(i)){
                    map.put(i,1);
                }
            }
            int[]res=new int[map.size()];
            int cnt=0;
            for(int i:map.keySet()){
                res[cnt]=i;
                cnt++;
            }
            for(int i=0;i<map.size();i++){
                System.out.print(res[i]+" ");
            }
        }   
    }