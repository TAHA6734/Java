import com.sun.source.tree.BreakTree;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import  java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

   List<Worker> workers = new ArrayList<>() ;

        workers.add(new Worker(500000 , 25 , "TAHA "));
        workers.add(new Worker(78000 , 21, "CENK "));
        workers.add(new Worker(58000 , 37 , "BARIS "));
        workers.add(new Worker(17002 , 42 , "AHMET "));
        workers.add(new Worker(90000 , 90 , "KAYRA "));


        Comparator<Worker> namecomparator = new Comparator<Worker>(){
            public int compare(Worker w1 , Worker w2){
                return w1.getIsim().compareTo(w2.getIsim());
            }
        };



            Comparator<Worker> budgetcomparator = new Comparator<Worker>(){

                public int compare(Worker w1 , Worker w2){
                    return Integer.compare(w1.getMaas() , w2.getMaas());
                }
            };



            Comparator<Worker> agecomparator = new Comparator<Worker>(){
                public int compare(Worker w1 , Worker w2){
                    return Integer.compare(w1.getYas() , w2.getYas());
                }
            };

        System.out.println("Isme gore  Siralama : ");
        Collections.sort(workers , namecomparator);
        for(Worker worker : workers){
            System.out.println(worker);
        }

        System.out.println("Yasa gore Siralama : ");
        Collections.sort(workers , agecomparator);
        for(Worker worker : workers){
            System.out.println(worker);
        }

        System.out.println("Maasa gore Siralama");
        Collections.sort(workers , budgetcomparator);
        for(Worker worker : workers){
            System.out.println(worker);
        }


    }
}