public class Rocket implements Spaceship {
    protected int cost;
    protected int weight;
    protected int maxWeight;
    protected int currentWeight;

    // Constructor
    public Rocket(int cost, int weight, int maxWeight) {
        this.cost = cost;
        this.weight = weight;
        this.maxWeight = maxWeight;
        this.currentWeight = weight; // Başlangıçta kendi ağırlığı ile başlar
    }

    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public void carry(Item item) {
        currentWeight += item.getWeight();
    }

    @Override
    public boolean canCarry(Item item) { // Metot adı düzeltildi
        return (currentWeight + item.getWeight()) <= maxWeight;
    }
}
