class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true; // Yeni kitaplar varsayılan olarak kullanılabilir
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrow() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " kitabı ödünç alındı.");
        } else {
            System.out.println(title + " kitabı zaten ödünç alınmış.");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println(title + " kitabı iade edildi.");
    }
}