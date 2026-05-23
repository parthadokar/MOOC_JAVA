public class Books {
    private String title;
    private int pages;
    private int year;

    public Books (String bookTitle, int bookPages, int bookYear) {
        this.title = bookTitle;
        this.pages = bookPages;
        this.year = bookYear;
    }

    public String getTitle (){
        return this.title;
    }

    public int getPages () {
        return this.pages;
    }

    public int getYear () {
        return this.year;
    }

    public String toString () {
        return this.title + "," + this.pages + "," + this.year;
    }
}

