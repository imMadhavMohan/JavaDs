class MaxSubarr{
    public static void main(String[] args) {
        int arr[] = {10 ,5 ,2 ,7 ,1 ,9};
        int n = arr.length;
        int k = 15;
        // Map<Integer, Integer> map = new HashMap<>();
        // map.put(0,-1); // sum found at 1st index
        int sum = 0;
        int max = 0; 
        int j=0;
        for(int i=0; i < n ; i++){  // sliding window won't work for -ve num
            j=i; sum = 0;
            while(j<n){
                sum+=arr[j];
                if(sum == k)
                 max = Math.max(j-i+1, max);
                if(sum < k)                                  
                  j++;                               
                else break;
            }
        }
        if(max!=0)
            System.out.println(max);
        else 
            System.out.println(-1);
    }
}