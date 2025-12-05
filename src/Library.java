public class Library {
    private Book[] books = new Book[100];
    private int count;

    public void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
            System.out.println("Книга добавлена: " + book.getTitle());
        } else {
            System.out.println("Библиотека переполнена!");
        }
    }

    public Book findBookByTitle(String title) {
        System.out.println("Find Book by Title: " + title);
        for (int i = 0; i < count; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                System.out.println(books[i].info());
                return books[i];
            }
        }
        System.out.println("Book not found!");
        return new Book();
    }

    public void showAllBooks() {
        System.out.println("All Books:");
        for (int i = 0; i < count; i++) {
            System.out.println(books[i].info());
        }
    }

}
