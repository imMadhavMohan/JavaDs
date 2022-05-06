class getter_setter{
    // Write only class
    private int id;
    private String name;
    private String add;
    public void setter(int id,String name,String add)
    {
        this.add=add;
        this.id=id;
        this.name=name;
    }
    public String get_name(){
        return name;
    }
    public int get_id()
    {
        return id;        
    }
    public String get_add(){
        return add;
    }
}

class encap{
    public static void main(String[]args) {
        getter_setter madhav=new getter_setter();      
        madhav.setter(1, "Maddy", "kamla nagar"); 
        System.out.println(madhav.get_add());
        System.out.println(madhav.get_id());
        System.out.println(madhav.get_name());
    }
}