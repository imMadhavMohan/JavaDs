class Human{
    int leg;
    int eye;
    int heart;
    Human(int leg,int eye,int heart)
    {
        this.leg=leg;
        this.eye=eye;
        this.heart=heart;
    }
}

class Madhav{
    Human h=null; // an obj declaration of type Human
    String hobby;
    Madhav(Human h,String hobby)
    {
        this.h=h;
        this.hobby=hobby;
    }
    public static void main(String[] args)
    {
       Human Maddy=new Human(2,3,2); 
       Madhav obj=new Madhav(Maddy, "Cycling");
       System.out.println(obj.hobby+" "+obj.h.eye+" "+obj.h.leg);
    }
}