interface Animal {
    void eat();
    void move();
}

abstract class Mammal implements Animal {
    @Override
    public void eat() {
        System.out.println("Mammal is eating...");
    }

    public abstract void move();
}

class Dog extends Mammal {
    @Override
    public void move() {
        System.out.println("Dog is running...");
    }

    public void bark() {
        System.out.println("Dog is barking!");
    }
}

class Cat extends Mammal {
    @Override
    public void move() {
        System.out.println("Cat is walking...");
    }

    public void meow() {
        System.out.println("Cat is meowing!");
    }
}

class Dolphin extends Mammal {
    @Override
    public void move() {
        System.out.println("Dolphin is swimming...");
    }

    public void jump() {
        System.out.println("Dolphin is jumping!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Farklı türlerden nesneler oluştur
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Dolphin();

        // instanceof ile kontrol et ve özel metotları çağır
        if (a1 instanceof Dog) {
            ((Dog) a1).bark(); // Dog nesnesinin özel metodu
        }

        if (a2 instanceof Cat) {
            ((Cat) a2).meow(); // Cat nesnesinin özel metodu
        }

        if (a3 instanceof Dolphin) {
            ((Dolphin) a3).jump(); // Dolphin nesnesinin özel metodu
        }

        // Tüm hayvanlar için genel davranış
        Animal[] animals = {a1, a2, a3};
        for (Animal animal : animals) {
            animal.eat(); // Tüm hayvanlar yemek yer
            animal.move(); // Tüm hayvanlar hareket eder
        }
    }
}
