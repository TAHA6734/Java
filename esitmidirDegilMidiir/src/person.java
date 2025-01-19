public class person {
    public String name ;
    public  int age ;

    public  person(String name , int age){
        this.name = name ;
        this.age = age ;
    }
    public boolean equals(Object obj ){
        if(this == obj){
            return  true ;
        }
        else if(obj == null || getClass() != obj.getClass()){
            return  false ;
        }

        person person = (person) obj;

        return  name.equals(person.name) && age == person.age ;

    }
}
