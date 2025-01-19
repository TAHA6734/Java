public class passenger {

    private String name ;
    private String currentplace ;
    private String destination ;
    private int age ;
    public passenger(){
        this.age = 0 ;
        this.currentplace = "unknown" ;
        this.destination = "unknown" ;
        this.name = "unknown";
    }
    public passenger(String name , int age){
        this.age = age ;
        this.name =name ;
    }
    public void setPassenger(String name , int age ){
        this.name= name ;
        this.age = age ;
    }
    public void setDestination(String destination){
        this.destination = destination;
    }
    public void showpassenger(){
        System.out.println("name : " + this.name + "age : " + this.age+"cuurent place : " + this.currentplace + "destination : " + this.destination);
    }
    public int getAge(){
        return age ;
    }
    public String getName() {
        return name;
    }
    public void passengerCurrent(String currentplace){
        this.currentplace = currentplace;
    }
}
