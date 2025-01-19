//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try{
    car car1 = new car("FERRARI");
    car car2 = new car("BMW" , 2023);
    car car3 = new car("AUDI",2025 , 300);
    factory factory1 = new factory(car);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
}