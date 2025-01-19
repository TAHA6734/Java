import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Collection<String> fruits = new ArrayList<String>();

        fruits.add("Kiraz");
        fruits.add("Elma");
        fruits.add("muz") ;

        System.out.println(fruits);

        System.out.println("Listenin boyutu : " + fruits.size());

        System.out.println("Liste bos mu " + fruits.isEmpty());

        System.out.println("muz dahil mi peki " + fruits.contains("muz"));

        fruits.remove("muz");

        System.out.println(fruits);

        Iterator<String> iterator = fruits.iterator();

        System.out.println("iteratorlu liste");

        while (iterator.hasNext()){
            String fruit = iterator.next();

            if(fruit.equals("Kiraz")){
                iterator.remove();
            }
        }
        System.out.println("Guncel liste ");

        }
    }
