public class person {
    private String name ;
    private int age ;

    public person(String name , int age ){

    }
    public void setName(String name ){
        this.name = name ;
    }
    public String getName(){
        return name ;
    }
    public void setAge(int age){
        if(age > 100 && age < 18 ){
            throw new IllegalArgumentException("100 ile 18 yas arsinda bir patron ariyoruz");
        }
        else{
            this.age = age ;
        }
    }
    public int getAge(){
        return age;
    }

    public String toString(){
        return "Patron isimi : " + name +  "patronun yasi : " + age ;
    }


}
