//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            person person = new person("TAHA","TEKIN",-5);
            person person1 = new person("AHMET","TEKIN");

            person[] intialPersons = {person , person1};
            Company company = new Company("GOGGLE" , intialPersons);

            company.PrintEmplooyeInfo();

        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}