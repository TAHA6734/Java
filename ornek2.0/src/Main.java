public class Main{
    public static void main(String[] args){
         passenger p1 = new passenger();
        p1.showpassenger();
        System.out.println();


        passenger p2 = new passenger("taha kayra" , 22) ;
        p2.passengerCurrent("ankara");
        p2.setDestination("istanbul");
        p2.showpassenger();
        System.out.println();


    }
}