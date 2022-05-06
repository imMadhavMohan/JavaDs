import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class MaxSubArrSum {
    public static void main(String[] args){
        int sum = -5;
        int arr[] = { -5 , 8, -14, 2, 4 ,12};
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        int currSum = 0;
        int max = 0;
        int start = 0, end = -1;
        for(int i=0;i<n;i++){
            currSum+=arr[i];
            if((currSum-sum)==0) // currSum=sum, sum found 
            {
                start = 0;
                end = i;    
                max = end - start + 1;                         
            }
            if(map.containsKey(currSum-sum) && (i-map.get(currSum-sum)) > max){
                start = map.get(currSum-sum)+1;
                end = i;
                max = end - start;                
            }
            if (!map.containsKey(currSum)) // i want currSum as left as possible as we want
             map.put(currSum,i); // largest subarr
        }
        if(max!=-1)
          System.out.println(max);
        else System.out.println(0);
    }
}
