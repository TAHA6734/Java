public class developer extends  employee{
    private String programminglanguage ;
    public developer(String name , int id , double salary , String programminglanguage){
        super(name , id , salary);
        this.programminglanguage = programminglanguage ;
    }
    public double calculatebonus(){
        return 0;
    }
    public String toString(){

        return  " " ;
    }
}
