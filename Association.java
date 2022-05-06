class school{
    String name;
    int sid;
    String add;
    school(String name,int sid,String add)
    {
        this.name=name;
        this.sid=sid;
        this.add=add;
    }
}

class Owner extends school{
    String Oname;
    int age;
    Owner(String oname,int age,String name,int sid,String add)
    {
        super(name,sid,add);
        this.Oname=Oname;
        this.age=age;
    }
    public static void main(String[] args) {
        Owner obj=new Owner("Maddy_Mohan", 23, "SvM", 1999, "Kamla Nagar Agra")   ;
        System.out.print(obj.Oname+" "+obj.add+" "+obj.age+" "+obj.name+" "+obj.sid);
    }
}