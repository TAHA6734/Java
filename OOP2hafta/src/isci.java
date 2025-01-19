public class isci {

    public String name ;
    public int Id ;
    public int wage ;
    public double workin_hours;


    public isci(String name , int Id , int wage , double workin_hours){
        this.Id = Id ;
        this.name = name ;
        this.wage = wage ;
        this.workin_hours = workin_hours ;
    }


    public void Display_info(){

        System.out.println("isminiz : " + isci.this.name );
        System.out.println("Kimlik numaraniz : "  + isci.this.Id);

    }

    public void Salary(){

        double salary = wage * workin_hours;
        System.out.println(" Maliyetiniz : " + salary);
    }





}




