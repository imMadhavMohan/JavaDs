public class Constructor_chaining {
    int l,b,h;
    Constructor_chaining()    
    {        
        System.out.println("Vol is: ");
    }
    
    Constructor_chaining(int l,int b,int h)    
    {    
        this();    
        this.l=l;
        this.b=b;
        this.h=h;`
        System.out.println(l*b*h);
    }
    
    public static void main(String[] args) {
       Constructor_chaining v=new Constructor_chaining(6,8,3);
       
    }
}
