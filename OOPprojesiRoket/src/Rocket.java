public class Rocket implements SpaceShip{
    protected int cost;
    protected int weight;
    protected int maxWeight;
    protected int currentWeight;

    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public boolean Cancarry(Item item) {
        return (currentWeight + item.getWeight()) <= maxWeight ;
    }

    @Override
    public void carry(Item item) {
        currentWeight += item.getWeight();

    }
}
