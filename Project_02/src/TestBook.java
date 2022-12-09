public class TestBook {
    TestBook(){
        Book book1 = new Book("Great book", 150);
        Book book2 = new Book("Another great book");
        Book book3 = new Book();
        book3.SetTitle("The greatest book");
        book2.SetVolume(200);
        System.out.println(book1);
    }
}
