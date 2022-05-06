import java.util.*;
import java.io.*;

class Main{
    static int validBraces(String str){
        int n = str.length();
        int max = 0;
        Stack<Integer> stk = new Stack<>();
        stk.push(-1); // to get the difference
        // problem index are placed, if their correspond found remove them
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '(') // may't get closing braces 
                stk.push(i);    // update in stk

            else{   //if(str.charAt(i)==')') found closing braces
                if(!stk.isEmpty())                                         
                    stk.pop(); 
            
                if(!stk.isEmpty())
                    max = Math.max(max, i - stk.peek());            
                else stk.push(i);
            }
        }
        // System.out.println(stk.peek()); stk isn't  empty
        return max;
    }
    public static void main(String[] args) {
        String str = "()(()))))";
        System.out.println(validBraces(str));        
    }    
}