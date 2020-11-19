public class Book {
    private int id ;
    private String name ;
    private String author ;
    private String publisher ;

    public Book(){}

    public Book(int id , String name , String author , String publisher){
        this.id = id ;
        this.name = name ;
        this.author = author ;
        this.publisher = publisher ;
    }
    //Id
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    // name
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    // Author
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }

    //publisher
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public String getPublisher() {
        return publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}