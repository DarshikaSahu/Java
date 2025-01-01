public class Books {

    int price;
    String name;
    String isbn;

    public Books(){
        super();  // call parent class constructor
        //all classes inherit object
        //super is always written in first line of constructor
    }

    public Books(int price, String name, String isbn){
        super();
        this.price = price;
        this.name = name;
        this.isbn = isbn;
    }

    @Override
    public String toString(){
        return "Books [price= " + price + ", name= " + name + ", isbn= " + isbn + "]";
    }
}
