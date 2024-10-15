public class Main {
    public static void main(String[] args) {
        Book book = new Book("Generic Book", 2020, 50.0);
        book.print();
        System.out.println();

        TextBook textBook = new TextBook("Math TextBook", "Mathematics", 2021, 70.0);
        textBook.print();
        System.out.println();
        
        Novel novel = new Novel("Fantasy Novel", "Fantasy", 2019, 30.0);
        novel.print();
        System.out.println();
        
        Biography bio = new Biography( "Albert Einstein", "Biography of Einstein",2018, 40.0);
        bio.print();
    }
}