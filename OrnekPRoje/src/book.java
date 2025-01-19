 class Book {

    private String title;
    private String author;
    private int stock;

    // Statik değişken
    private static int totalBooks = 0;

    // Constructor
    public Book(String title, String author, int stock) {
        this.title = title;
        this.author = author;
        this.stock = stock;
        totalBooks++;
    }

    // Getter ve Setter'lar
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // Kitap ödünç alma
    public void borrowBook() throws Exception {
        if (stock > 0) {
            stock--;
        } else {
            throw new Exception("Stokta kitap kalmadı!");
        }
    }

    // Kitap iade etme
    public void returnBook() {
        stock++;
    }

    // Statik metod
    public static int getTotalBooks() {
        return totalBooks;
    }
}
