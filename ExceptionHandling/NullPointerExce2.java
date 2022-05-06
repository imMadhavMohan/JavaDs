/*We cannot call a non-static method on a reference variable with null value,
 it will throw NullPointerException, but we can call static method with 
 reference variables with null values. Since static methods are bonded using 
 static binding, they won’t throw Null pointer Exception.*/

 class NullPointerExce2 {
    private static void staticMethod() {
        System.out.println("Can be called for null reference obj");
    }
    private void nonStaticMethod(){
        System.out.println("Non-static method Can't be called for null reference obj");   
    }
    public static void main(String[] args) {
        NullPointerExce2 obj = null;
        obj.staticMethod();
        // try{
        obj.nonStaticMethod();
        // } catch (Exception e){
            System.out.println("Exception caught");
        // }
    }    
}
