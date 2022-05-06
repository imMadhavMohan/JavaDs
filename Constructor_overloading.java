class cube{
    int l,b,h;
    cube(int l,int b,int h)
    {
        this.l=l;
        this.b= b;
        this.h=h;
        vol(l, b, h);
    }
    cube(int l,int b)
    {
        this.l=l;
        this.b= b;
        area(l, b);  
    }
    void vol(int l,int b,int h){
        System.out.println(l*b*h);
    }
    void area(int l,int b)
    {
        System.out.println(l*b); 
    }
    public static void main(String[] args)
    {
        cube v=new cube(3,4,8);
        cube a=new cube(v.l,v.b);
    }
}