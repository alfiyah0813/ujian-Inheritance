public class  TextBook extends Book{
    String subject; 

    

    public TextBook (String subject,String title, int year, double price) {
        super(title, year, price); 
        this.subject = subject;
    }

    public TextBook() {
        super();
        subject = "";
        System.out.println("Subject: " + this.subject);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        System.out.println("Previous subject: " + this.subject + ", New subject: " + subject);
        this.subject = subject;
    }

    public void print() {
        System.out.println("TextBook: ");
        System.out.println("Tittle: " + getTitle());
        System.out.println("Year: " + getYear());
        System.out.println("Price: " + getPrice());
        System.out.println("Subject: " + subject);
    }
}