public abstract  class employee {
    protected String name ;
    protected  int id ;
    protected  double salary ;

    public employee(String name , int id , double salary){
        this.name = name ;
        this.id = id ;
        this.salary = salary ;
    }
    public abstract double calculatebonus();

    public String toString(){
        return "name : " + name   + " id : " + id + " salary : " + salary ;
    }
}
