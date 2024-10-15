public class Biography extends Book{
    String about;

    public Biography() {
        super();
        about = "";
        System.out.println("Biography object created with default constructor.");
    }

    public  Biography(String about, String title, int year, double price) {
        super(title,year,price);
        this.about = about;
        System.out.println("about: " + about);

    }

    public  String getAbout() {
        System.out.println("Returning: " + this.about);
        return this.about;
    }

    public void  setAbout(String about) {
        System.out.println("Previous about: " + this.about + ", New about: " + about);
        this.about = about;
    }
    
    public void print() {
        System.out.println("Biography: ");
        System.out.println("About: " +about);
        System.out.println("Title: " + getTitle());
        System.out.println("Year: " + getYear());
        System.out.println("Price: " + getPrice());
        
    }
}