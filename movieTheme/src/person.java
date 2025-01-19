public class person {
    private int id ;
    private int age;
    private String name ;
    private String surname ;
    private static int id_counter  = 1 ;

    person(String name , String surname , int age ){
        this.name = name;
        this.surname=surname;
        this.age =age;
        setId(id);
    }
    person(String name , String surname){
        this(name,surname,0);
    }

    public void setName(String name){
        this.name = name ;
    }
    public void  setId(int id){
        this.id = id ;
    }
    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("0'dan kucuk sayi girilemez");
        } else {
            this.age = age;
        }
    }
    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public int getAge(){
        return age ;
    }
    public int getId(){
        return id;
    }
    public static int GetTotalPerson(){
        return id_counter-1;
    }
    public String toString(){
        return String.format("id : %d  , NAME : %d , AGE %d " , id , name , age ) ;
    }

}
