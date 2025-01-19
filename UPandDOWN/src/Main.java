//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

     Animal animal = new Animal();

     Dog dog = (Dog) animal;
     Cat cat = (Cat) animal;



    }
    public static void Upcasting(Dog animal){
        if(animal instanceof Dog){
            ((Dog) animal).kopek();
        }

    }
}