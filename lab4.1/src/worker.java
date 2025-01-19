import java.util.InputMismatchException;

public class worker {

  private   String name ;
  private   int salary ;

  private static  int counter = 1 ;

    public worker(String name , int salary )throws InputMismatchException
    {
         this.setName(name);
        this.setSalary(salary);
            counter++;
    }

    public void setName(String name){
        this.name = name ;
    }
    public void setSalary(int salary){

        if(salary < 0 ){
            throw new InputMismatchException("Gecersiz islem : InputMismachexeption");
        }
        this.salary =salary;
    }

        public int getSalary(){
        return salary;
        }

    public String getName() {
        return name;
    }

    public static int getCounter(){
        return counter;
    }
}


