
public class animal {
    public enum AnimalTypes{
        MAMMAL ,
        FISH ,
        REPTILE,
        BIRD ;
    }
    private String name;
    AnimalTypes types ;


    public animal(AnimalTypes types , String name ){
            setName(name);
            setTypes(types);
    }

    public void setName(String name){
        this.name = name ;
    }
    public void setTypes(AnimalTypes types){
        this.types = types;
    }
    public String getName(){
        return name ;
    }
    public AnimalTypes getTypes(){
        return types;
    }
    public String toString(){
        return "name : " + this.name + "type : " + this.types + " " ;
    }

}
