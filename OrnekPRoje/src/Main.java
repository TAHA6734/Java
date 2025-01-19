public class Main {
    public static void main(String[] args) {

        try {
            // Kütüphane oluşturma
            Library library = new Library();

            // Kitaplar oluşturma
            Book book1 = new Book("SAVAS VE SUÇ", "DOSTOYEVSKI", 5);
            Book book2 = new Book("NUTUK", "MUSTAFA KEMAL ATATURK", 1923);

            // Kullanıcılar oluşturma
            User admin = new User("ADMIN", true);
            User user = new User("TAHA", false);

            // Admin kitap ekliyor
            admin.addBook(library, book1);
            admin.addBook(library, book2);

            // Kullanıcı kitap ödünç alıyor
            library.borrowBook("NUTUK", user);

            // Kullanıcı kitabı iade ediyor
            library.returnBook("NUTUK", user);

            // Toplam kitap sayısını gösterme
            System.out.println("TOPLAM KITAP SAYISI: " + Book.getTotalBooks());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
