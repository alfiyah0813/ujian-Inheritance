public class Book{
    String title;
    int year;
    double price;

    public Book() {

        super();
        title = "";
        year = 0;
        price  = 0.0;
    }

    public Book(String title,  int year, double price) {
        this. title = title;
        this.year = year;
        this.price = price;
    }

    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public  int getYear() {
        return this.year;
    }

    public  void setYear(int year) {
        this.year = year;
    }

    public  double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountedPrice() {
        if (year > 2021) {
            return price; // no discount
        } else if (year >= 2011 && year <= 2020) {
            return price * 0.8; // 20% discount
        } else {
            return price * 0.5; // 50% discount
        }
    }

    public void print() {
        System.out.println("Title: " + title );
        System.out.println("Year: " + year );
        System.out.println("Price: " + price );
        System.out.println("Discounted Price: " + getDiscountedPrice());
        }
}