//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        person p1 = new person("Ahmet", 25);
        person p2 = new person("Ahmet", 25);
        person p3 = new person("Mehmet", 30);

        System.out.println(p1.equals(p2)); // true (İçerikleri aynı)
        System.out.println(p1.equals(p3)); // false (İçerikler farklı)
        System.out.println(p1 == p2);
    }
}