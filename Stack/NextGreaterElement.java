import java.io.*;
import java.util.*;

class NextGreater{
    static void NextGreater(int arr[], Stack<Integer> stk){                
        int res[] = new int[arr.length];  
        stk.push(0);      
        for(int i = 1; i<arr.length; i++){
            while(!stk.isEmpty() && arr[stk.peek()]<arr[i]){
                res[stk.peek()] = arr[i];
                stk.pop();                
            }
            stk.push(i);            
        }
        while(!stk.isEmpty()){            
            res[stk.peek()] = -1;
            stk.pop();
        }
        for(int val: res)
          System.out.print(val+" ");
    }
    public static void main(String[] args) {
        int arr[]= { 6, 2, 5, 4, 1, 6 };
        Stack<Integer> stk = new Stack<Integer>();
        int n=arr.length;
        NextGreater(arr,stk);
    }
}