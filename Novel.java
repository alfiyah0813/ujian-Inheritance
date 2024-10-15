public class Novel extends Book {
    String genre;

    public Novel() {
        super();
        this.genre = ""; 
        System.out.println("Novel() called. Initializing genre to: " + this.genre);
    }

    public Novel(String genre, String title, int year, double price) {
        super(title, year, price); 
        this.genre = genre;
        System.out.println("Novel object created with genre: " + this.genre);
    }

    public String getGenre() {
        System.out.println("getGenre() called. Returning: " + this.genre);
        return this.genre;
    }

    public void setGenre(String genre) {
        System.out.println("setGenre() called. Previous genre: " + this.genre + ", New genre: " + genre);
        this.genre = genre;
    }

    public void print() {
        System.out.println("Novel:");
        System.out.println("Title: " + getTitle());
        System.out.println("Year: " + getYear());
        System.out.println("Price: " + getPrice());
        System.out.println("Genre: " + genre);
    }
}