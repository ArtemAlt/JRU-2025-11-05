public class Book {
    private String title;
    private Author author;
    private int year;
    private int pageCount;

    public Book(String title, Author author, int year, int pageCount) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.pageCount = pageCount;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String info() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + authorInfo(author) +
                ", year=" + year +
                ", pageCount=" + pageCount +
                '}';
    }

    private String authorInfo(Author author) {
        return author == null ? "" : author.info();
    }
}
