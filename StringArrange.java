import java.io.*;
import java.util.*;

class Main {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		String str = "eklpyqrbgjdwtcaxznsifvhmou";
		
		String[] strs = {"is", "newton", "school", "fun"};
		
		int n = strs.length;
		int[] index = new int[n];
				
		for(int i=0;i<n;i++){
			for(int j=0;j<26;j++){
				if(strs[i].charAt(0) == str.charAt(j))
				  {index[i] = j; break;}
			}
		}

		Arrays.sort(index);

		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(str.charAt(index[i])==strs[j].charAt(0))
				  {System.out.println(strs[j]); break;}
			}
		}
	}
}