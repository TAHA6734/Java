public class manager extends employee{
    protected double teambudget ;
    public manager(String name , int id , double salary  , double teambudget){
        super(name , id , salary ) ;
        this.teambudget = teambudget ;
    }

    @Override
    public double calculatebonus() {
        return  0 ;
    }

    public String toString(){
        return "taha" ;
    }
}
