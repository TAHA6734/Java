import java.io.Serializable;

public class Worker implements Serializable {

    String name;
    int age;
    double salary;

    public Worker(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker{name='" + name + "', age=" + age + ", salary=" + salary + "}";
    }
}

