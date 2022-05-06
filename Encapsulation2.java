class Encapsulation2 {
    // read only
    private int id=1;
    private String name="Maddy";
    private String add="Kamla nagar";
    public String get_add(){
        return this.add;
    }
    public String get_name(){
        return this.name;
    }
    public int get_id(){
     return this.id;   
    }    
}

class getter{
    public static void main(String[]args){
        Encapsulation2 Madhav =new Encapsulation2();
        System.out.println(Madhav.get_add()+" "+Madhav.get_name()+" "+Madhav.get_id());
    }
}
