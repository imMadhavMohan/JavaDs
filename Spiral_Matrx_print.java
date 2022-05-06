import java.util.*;
public class Spiral_Matrx_print {

    static int[][] printSpiral(int n, int cnt) {
        int l = 0, r = n - 1; 
        boolean check=true;
        int t = 0, b = n - 1;
        int[][] arr = new int[n][n];
        while (check==true) {
            if(l<r) check=false;
            // Print 1st row
            for (int i = l; i <= r; i++)
                arr[l][i] = (cnt++);
            t++;
            if(t>b) check=false;
            // Print last col   
            for (int i = t; i <= b; i++)
                arr[i][r] = (cnt++);
            r--;
            if(r<l) check=false;
            // Print last row
            for(int i=r;i>=l;i--)
                arr[b][i] = (cnt++);
            b--;
            if(b<t) check=false;
            // Print 1st col            
            for(int i=b;i>=t;i--)
                arr[l][i] = (cnt++); 
            l++;           
        }                   
             
        return arr;
    }

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr=printSpiral(n, 1);    
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                System.out.print(arr[i][j] + " ");
    
    }
}
