public interface Spaceship {
    boolean launch(); // Fırlatma başarılı mı?
    boolean land();   // İniş başarılı mı?
    boolean canCarry(Item item); // Belirli bir eşyayı taşıyabilir mi?
    void carry(Item item);       // Eşyayı roketin ağırlığına ekle
}
