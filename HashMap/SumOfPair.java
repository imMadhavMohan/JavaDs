import java.io.*;
import java.lang.*;
import java.util.*;

class Main{
    static int cntPairSum(int arr[], int n, int sum){
        int cnt =0 ;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++)
                if(arr[j]+arr[i]==sum)
                  cnt++;
        }
        return cnt;
    }
    // The idea behind this method is to calculate (a+b) = sum, so we'll store the (sum-a)=b into the map 
    // && also will increase the frequency of b++, in map.
    static int cntPairSums(int arr[], int n, int sum){
        Map<Integer, Integer> map = new HashMap<>();
        int cnt = 0;
        for(int i = 0; i < n; i++){
            //  a = arr[i]; 
            //  b = sum-arr[i];  a + b =sum
            if (map.containsKey(sum - arr[i])) // 6 - 1 = 5, add the frequency  of appearance of b
                cnt += map.get(sum - arr[i]);  // add frequency(val) to cnt

            if (map.containsKey(arr[i])) 
                map.put(arr[i], map.get(arr[i]) + 1);   // add frequency(val)
            else 
                map.put(arr[i], 1);            
        }
        return cnt;
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 7, -1};
        int n = arr.length;
        int sum = 6;
        // Brute force O(n2)
        System.out.println(cntPairSum(arr,n,sum));
        //Efficient O(n)
        System.out.println(cntPairSums(arr, n, sum));
    }
}