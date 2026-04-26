package practice;

public class P0426_02_ConstructorChaining_staticCount {
    public static void main(String[] args) {
        P042602Book b1 = new P042602Book();
        P042602Book b2 = new P042602Book("Java");
        P042602Book b3 = new P042602Book("Clean Code", 450);

        b1.output();
        b2.output();
        b3.output();
    }
}
class P042602Book {
    String title;
    int pages;
    static int count;
    P042602Book () {
        this("Unknown", 0);
    }
    P042602Book(String title) {
        this(title, 0);
    }
    P042602Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
        count ++;
    }
    void output() {
        System.out.println("Title: " + title);
        System.out.println("Pages: " + pages);
        System.out.println("Total books: " + count);
    }
}