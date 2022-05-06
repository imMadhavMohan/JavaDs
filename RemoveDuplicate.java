class RemoveDuplicate {
    static void removeDupli(char[] ch){
        for (int i = 0; i < ch.length; i++) 
            for (int j = i + 1; j < ch.length; j++) 
                if (ch[i] == ch[j]) 
                    ch[j] = '*';                                    
        for (char x : ch) 
            if (x != '*')
                System.out.print(x);        
    }
    static void removeDupli2(char[] ch){
        int map[] = new int[26];
        for(int i=0; i< ch.length; i++)
            map[ch[i]-'a']++;
        
        for(int i=0;i< map.length;i++)
            if(map[i]>=1){
              System.out.print((char)(i+97));            
              map[i]=-1;
            }       
    }
    public static void main(String[] args) {
        String str="geeksforgeeks";
        char ch[] = str.toCharArray();
        char ch2[] = str.toCharArray();
        removeDupli(ch);
        System.out.println();
        removeDupli2(ch2);        
    }
}
 