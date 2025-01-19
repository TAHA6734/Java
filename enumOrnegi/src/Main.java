
public class Main{
    public static void main(String[] args){
        animal lion = new animal(animal.AnimalTypes.MAMMAL , "liion");
        animal eagle = new animal(animal.AnimalTypes.BIRD , "Besiktas");
        animal snake = new animal(animal.AnimalTypes.REPTILE , "ssss") ;

        animal[] animals = new animal[]{lion , eagle , snake};

        zoo zoo1 = new zoo(animals);
        zoo1.printfInfo();
    }
}