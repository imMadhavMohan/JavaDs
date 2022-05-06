class Author{
    // act as datatype
    int age;
    String name;
    String exp;
    String place;
    Author(int age,String place,String exp,String name)
    {
        this.age=age;
        this.exp=exp;
        this.name=name;
        this.place=place;
    }
}

class Book{
    Author detailAuthor; // Has-A relation or Aggregation
    int price;
    int page;
    // All are nstance var
    Book(int price,int page,Author detailAuthor)
    {
        this.price=price;
        this.page=page;   
        this.detailAuthor=detailAuthor;     
    }
    public static void main(String[] args) {
        Author Maddy=new Author(22, "Agra", "Pneumatic", "Mohan");
        Book Mygod=new Book(390,230,Maddy);
        System.out.println(Mygod.price+" & "+Mygod.page);
        System.out.println(Mygod.detailAuthor.age+" & "+Mygod.detailAuthor.name);
    }
}

