import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class SubarrSum {
   public static void main(String args[]){
       int sum = 5;
       int arr[]={10,15,-5,15,-10,5};
       int n = arr.length;
       Map<Integer, Integer> map = new HashMap<>();
       int currSum=0;
       int start = 0, end = -1;
        for(int i=0;i<n;i++){
            currSum+=arr[i];
            if((currSum-sum)==0) // currSum==sum
            {
              start=0; end=i; break;   
            }
            if(map.containsKey(currSum-sum)){ // Good boolean
              start = map.get(currSum-sum)+1; // Get index
              end = i; break;
            }
            map.put(currSum, i);
        }
        if(end!=-1)    
          System.out.println("sum exist"+"length of subArr: "+ (end - start+1));
        else 
            System.out.println("not exist");
   }
}
