class Member {
    private String name;
    private int memberId;
    private static int memberCount = 0; // Tüm üyeleri sayan static değişken

    public Member(String name) {
        this.name = name;
        this.memberId = ++memberCount; // Her yeni üye için ID atanır
    }

    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }
}