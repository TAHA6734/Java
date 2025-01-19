import java.lang.reflect.Array;
import java.util.Arrays;

public class restorant {

    private String name ;
    private  String adress ;
    private String menu ;
    private String[] saladlist ;
    private static int counter = 0 ;
    person person ;

    public restorant(String name ){
        this.name = name ;
        counter++;
    }
    public static int getRestorantCount(){
        return counter;
    }

    public void setName(String name){
        this.name = name ;
    }
    public String getName(){
        return name ;
    }
    public void setAdress(String adress){
        this.adress = adress;
    }
    public String getAdress(){
        return adress;
    }

    public void setMenu(String  menu){
        this.menu = menu ;
    }
    public String getMenu(){
        return menu;
    }
    public void setSaladlist(String[] saladlist){
        this.saladlist = saladlist;
    }
    public String[] getSaladlist(){
        return saladlist;
    }
    public void setPerson(person person){
        this.person = person;
    }
    public person getPerson(){return person;
    }

    public String toString(){
        return "Restaurant{name='" + name + "', address='" + adress + "', menu='" + menu +
                "', owner=" + person + ", salads=" + Arrays.toString(saladlist) + "}";
    }
}
