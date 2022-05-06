import java.io.*;
import java.util.*;

class NextSmallerElement {
    static void nextSmaller(int arr[], int n){
        Stack<Integer> stk = new Stack<Integer>();
        stk.push(0);
        int res[] = new int[arr.length];
        for(int i = 1; i < arr.length; i++){
            while(!stk.isEmpty() && arr[stk.peek()]>arr[i]){
                res[stk.peek()] = arr[i];
                stk.pop();
            }
            stk.push(i);
        }
        while(!stk.isEmpty()){
            res[stk.peek()] = -1;
            stk.pop();
        }
        for(int val:res){
            System.out.print(val+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={6,2,5,4,1,6};
        nextSmaller(arr, arr.length);
    }
}
