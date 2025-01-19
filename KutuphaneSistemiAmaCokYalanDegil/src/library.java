class Library {
    private Book book1;
    private Book book2;
    private Member member1;
    private Member member2;
    public static final String LIBRARY_NAME = "Şehir Kütüphanesi"; // Sabit kütüphane adı

    public Library() {
        // Kitapları ve üyeleri burada tanımlıyoruz
        book1 = new Book("Java Programlama", "Ahmet Yılmaz");
        book2 = new Book("Veri Yapıları", "Mehmet Demir");

        member1 = new Member("Taha");
        member2 = new Member("Ali");
    }

    public void borrowBook(Member member, Book book) throws BookNotAvailableException {
        if (book.isAvailable()) {
            book.borrow();
        } else {
            throw new BookNotAvailableException("Kitap mevcut değil: " + book.getTitle());
        }
    }

    public static String getLibraryName() {
        return LIBRARY_NAME;
    }

    public void printLibraryStatus() {
        System.out.println("Kütüphane Adı: " + LIBRARY_NAME);
        System.out.println("Kitaplar:");
        System.out.println("1. " + book1.getTitle() + " - " + (book1.isAvailable() ? "Kullanılabilir" : "Ödünç Alınmış"));
        System.out.println("2. " + book2.getTitle() + " - " + (book2.isAvailable() ? "Kullanılabilir" : "Ödünç Alınmış"));
    }
}