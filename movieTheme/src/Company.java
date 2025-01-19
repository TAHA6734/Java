public class Company {
    private String name ;
    person[] person ;

   public  Company(String name , person[] person){
        this.name=name;
        this.person=person;
    }
    public void company_greeting(){
        System.out.println("welcome to company my friend ");
    }

    public void PrintEmplooyeInfo(){
        System.out.println("NAME : " + name);
       for(person person : person){
           System.out.println(person);
       }
    }
}
