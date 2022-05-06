import java.io.*;
import java.util.*;

class SubAarrSumZero {
    public static void main(String[] args) {
        int arr[]={15,-2,2,-8,1,7,10,23};
        int n=arr.length;
        int start=0, end=-1;
        int currSum=0 ,max = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            currSum+=arr[i];
            if(currSum == 0){ 
                max = i+1;              
            }
            if(!map.containsKey(currSum))
                map.put(currSum, i);
            if(map.containsKey(currSum) && max < (i - map.get(currSum))){
                max = i - map.get(currSum);                
            }
            
        }
        if(max != -1)
          System.out.println(max);
        else System.out.println(-1);
    }
}
