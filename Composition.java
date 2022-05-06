class parent{
    void print()
    {
        System.out.println("Hi");
    }
}

class child extends parent{
    void print()
    {
        System.out.pritln("Hello");
    }
    public static void main(String[] args) {
        parent obj=new child()        ;
        System.out.println(obj.print());
    }
}