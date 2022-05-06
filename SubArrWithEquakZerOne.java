import java.io.*;
import java.util.*;

class SubArrWithEquakZerOne {    
    public static void main(String[] args) {
        int arr[]={1,0,0,1,0,1,1};
        int n=arr.length;        
        int currSum = 0;
        int ans=0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i=0; i<n; i++){            
            currSum += arr[i];
            if(currSum == 0){
               ans++;                
            }
            if(map.containsKey(currSum))
            {
                ans+=map.getKey(currSum);
                map.put(currsum, map.get(currSum));
            }
            else map.put(currsum, 1);

        }        
    }    
}
