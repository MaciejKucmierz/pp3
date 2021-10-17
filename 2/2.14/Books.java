public class Books
{
    String title;
    String author;
    String releaseDate;
    boolean isBorrowed;
    
    void bookInfo(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(releaseDate);
    }
    void borrowage(){
        isBorrowed = !isBorrowed;
    }
}
