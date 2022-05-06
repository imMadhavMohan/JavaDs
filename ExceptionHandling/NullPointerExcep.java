class NullPointerExcep {
    static String str=null;
    public static void main(String[] args) {
        
        try{
            if(str.equals("Geek"))
          System.out.println("Matched");
          else
          System.out.println("Not matched");
        }catch(Exception e){
            System.out.println("Exception caught");
        }
        
    }
}
