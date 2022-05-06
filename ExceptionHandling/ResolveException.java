class ResolveException {
    public static void main(String[] args) {
        int i=50, j=0;
        try{
            i/=j;
        }
        catch (ArithmeticException e){
            System.out.println(i/=(j+2));
        }
        System.out.println("RestCode");
    }
}
