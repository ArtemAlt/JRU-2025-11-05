public class RestarauntSystem {

    public static void main(String[] args) {
        System.out.println("=============Система управления рестораном==============="); 

        MenuItem grilledSalmon = new MenuItem("Salmon", "some descriptions",123.55);
        MenuItem susi = new MenuItem("Susi", "nice susi",500.55);
        String susiUuid = susi.getUuid();
        RestaurantMenu littleItalyMenu = new RestaurantMenu(10);        
        littleItalyMenu.addItemToMenu(grilledSalmon);    
        littleItalyMenu.addItemToMenu(susi);

        Restaurant littleItaly = new Restaurant("Little Italy", littleItalyMenu);

        littleItaly.availableMenuItem(susiUuid);
        littleItaly.showMenu();

        
    }
    

}
