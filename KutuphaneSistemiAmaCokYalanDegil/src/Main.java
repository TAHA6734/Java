// Özel bir exception sınıfı
class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}


public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Kütüphane durumunu yazdır
        library.printLibraryStatus();

        // Kitap ödünç alma işlemleri
        try {
            library.borrowBook(library.member1, library.book1); // Bu işlem başarılı olacak
            library.borrowBook(library.member2, library.book1); // Bu işlem hata fırlatacak
        } catch (BookNotAvailableException e) {
            System.out.println(e.getMessage());
        }

        // Kütüphane durumunu tekrar yazdır
        library.printLibraryStatus();
    }
}