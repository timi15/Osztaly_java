public class gyakorlas {
    public static void main(String[] args) {

        Auto auto1= new Auto("Mercedes", "fekete", "GT", 2300);  //példányosítás
        //osztály  objektum  = operátor  konstruktor

        Auto auto2= new Auto("Audi", "piros", "A6",2100);

        System.out.println(auto1.getKcm());

        auto1.setSzin("fehér");  //szin megváltoztatása
        System.out.println(auto1.getSzin());






    }
}
