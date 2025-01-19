import java.util.ArrayList;

 class Library {

    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    // Kitap ekleme
    public void addBook(Book book) {
        books.add(book);
    }

    // Kitap ödünç alma
    public void borrowBook(String title, User user) throws Exception {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.borrowBook();
                System.out.println(user.getName() + " kitabı ödünç aldı: " + title);
                return;
            }
        }
        throw new Exception("Kitap bulunamadı!");
    }

    // Kitap iade etme
    public void returnBook(String title, User user) throws Exception {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.returnBook();
                System.out.println(user.getName() + " kitabı iade etti: " + title);
                return;
            }
        }
        throw new Exception("Kitap bulunamadı!");
    }
}

