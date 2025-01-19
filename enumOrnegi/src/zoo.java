public class zoo {
    private animal[] animals;

    public zoo(animal[] animals){
        this.animals = animals;
    }

    public void printfInfo(){
        for(animal animal : animals){
            System.out.println(animal);
        }
    }
}
