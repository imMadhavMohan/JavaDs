import java.io.*;
import java.util.*;

class HistogramArea {
    static int maxArea1(int arr[]){
        int n = arr.length;
        int area = Integer.MIN_VALUE;
        int l = 0, r = 0;
        for(int i=0; i<n; i++){
            l=i ; r=i; 
            int max=0;
            while(l-1>=0 && arr[l-1]>=arr[i]){ // contiguous array                                
                l--;
            }            
            while(r<n && arr[i]<=arr[r]){ // contiguous array
                r++;
            }
            max = (r-l)*arr[i];
            if(max > area)
                area = max;
        }
        return area;
    }

    static int maxArea2(int arr[]){
        int n = arr.length; 
        int max = Integer.MIN_VALUE;
        int  right[] = rightSmallest(arr);
        int left[] = leftSmallest(arr);               
        
        System.out.print("Left : ");
        for(int i=0; i<n ;i++)
         System.out.print(left[i]+" ");

        System.out.println();

        System.out.print("Right : ");
        for(int i=0; i<n ;i++)
         System.out.print(right[i]+" ");
                
        for(int i=0;i<n;i++) {
            int val = (Math.abs(right[i]-left[i])-1)*arr[i];
            if(max<val) 
             max = val;
        }
        return max;
    }

    static int[] leftSmallest(int arr[]){
        int left[] = new int[arr.length];
        Stack<Integer> stk = new Stack<>();        
        int n = arr.length;
        stk.push(n-1);
        for(int i=n-2; i>=0; i--){ // corner case      
            while(!stk.isEmpty() && arr[stk.peek()] > arr[i]){
                left[stk.peek()] = i;
                stk.pop();
            }            
            stk.push(i);
        }
        while(!stk.isEmpty()){
            left[stk.peek()] = -1;
            stk.pop();
        }
        return left;
    }

    static int[] rightSmallest(int arr[]){
        int right[] = new int[arr.length];
        int n = arr.length;
        Stack<Integer> stk = new Stack<>();                
        stk.push(0); 
        int r=0;
        for(int i=1; i<n; i++){    // corner case                                  
            r = i;            
            while(!stk.isEmpty() && arr[stk.peek()] > arr[i])
            {    
                right[stk.peek()]=i;
                stk.pop() ;                
            }
            stk.push(i);
        }
        while(!stk.isEmpty())
        {
           right[stk.peek()] = r; // to manage the process and corner case
           stk.pop();
          }        
        return right;
    }
    public static void main(String[] args) {
        int arr[] = {6, 2, 5, 4, 5, 1, 6};
        System.out.println("Max Area: " +maxArea1(arr));
        System.out.println("\nMax Area: "+maxArea2(arr));    
    }
}
