package class_basic.MultiTest;

public class Book {
     String title;
    private String writer;
    private int price;

    public Book(){  // 생성자
        this.title="";
        writer="";
        this.price=0;
    }
    public Book(String title, String writer, int price) {
        this.title = title;
        this.writer = writer;
        this.price = price;
    }
}
