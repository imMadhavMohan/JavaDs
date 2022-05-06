 import java.util.*;
 import java.util.Vector;
 class Vec{
     public static void main(String[] args) {
        Vector<Integer> v= new Vector<Integer>();
        for(int i=0;i<8;++i)
          v.add(i*2);
        System.out.println(v);             
    // Remove at index
    v.remove(5);
    System.out.println(v);
    // Remove By Obj, need typecast as Index & obj are Int
    v.remove((Integer)14);
    System.out.println(v);
    System.out.println(v.isEmpty());    
    Integer[] arr=new Integer[v.size()];
    v.toArray(arr);
    for(int i: arr)
        System.out.print(i+" ");
    System.out.println("\n"+v.get(1));    
    }
 }