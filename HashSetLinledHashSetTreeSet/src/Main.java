import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Set<String> set1 = new HashSet<String>();
        Set<String> set2 = new LinkedHashSet<String>();
        Set<String> set3 = new TreeSet<String>();

        System.out.println("*********************************");

        set1.add("JAVA");
        set1.add("PYTHON");
        set1.add("C++");
        set1.add("JAVASCRIPT");

        System.out.println("*********************************");

        set2.add("JAVA");
        set2.add("PYTHON");
        set2.add("C++");
        set2.add("JAVASCRIPT");

        System.out.println("*********************************");

        set3.add("JAVA");
        set3.add("PYTHON");
        set3.add("C++");
        set3.add("JAVASCRIPT");

        System.out.println("*********************************");

        System.out.println("HASH_SET");

        for(String s : set1){
            System.out.println(set1);
        }
        System.out.println("LINKED_HAS_SET");
        for(String s : set2){
            System.out.println(set2);
        }
        System.out.println("TREE_SET");
        for(String s : set3){
            System.out.println(set3);
        }



    }
}