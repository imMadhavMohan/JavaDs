class ArithematicException {
      public static void main(String[] args) {
          
          try{
              int val = 50 / 0; //may throw an exception
              System.out.println(val);
          } 
          catch (ArithmeticException e) {
              System.out.println(e);
          }
        System.out.println("Exception handled");
      }  
}
