 class User {

    private String name;
    private boolean isAdmin;

    // Constructor
    public User(String name, boolean isAdmin) {
        this.name = name;
        this.isAdmin = isAdmin;
    }

    // Getter ve Setter'lar
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    // Admin yetkisi ile kitap ekleme
    public void addBook(Library library, Book book) throws Exception {
        if (isAdmin) {
            library.addBook(book);
        } else {
            throw new Exception("Yetkiniz yok!");
        }
    }
}
