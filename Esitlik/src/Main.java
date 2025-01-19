//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MyClass myClass = new MyClass(1 , "JAVA") ;
        MyClass myClass1 = new MyClass( 1 , "JAVA");
        MyClass myClass2 = new MyClass(2 , "PYTHON") ;

        System.out.println(myClass.equals(myClass1));
        System.out.println(myClass.equals(myClass2));
    }
}