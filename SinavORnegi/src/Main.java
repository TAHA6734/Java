public class Main{
    public static void main(String [] args){

            try{
                car car1 = new car("FERRARI" , 2024 , 350) ;
                car car2 = new car(2022);
                car car3 = new car("HONDA" , 2004 ) ;
                car[] cars = new car[]{car1 , car2 , car3} ;
            }catch (IllegalArgumentException e ){
                System.out.println(e.getMessage());
            }

    }
}