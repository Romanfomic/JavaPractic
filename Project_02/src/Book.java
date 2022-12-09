public class Book {
    private String Title;
    private int Volume;

    public Book(String title, int volume){
        Title = title;
        Volume = volume;
    }
    public Book(String title){
        Title = title;
        Volume = 0;
    }
    public Book(){
        Title = "Unknown";
        Volume = 0;
    }

    public void SetTitle(String title){
        Title = title;
    }
    public void SetVolume(int volume){
        Volume = volume;
    }

    public String GetTitle(){
        return Title;
    }
    public int GetVolume() {
        return Volume;
    }

    public String toString(){
        String information = "Book, Title = " + Title + ", Volume = " + Volume;
        return information;
    }
}
