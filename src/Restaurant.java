
public class Restaurant {
    private final String name;
    private final RestaurantMenu menu;
    
    public Restaurant(String name, RestaurantMenu menu) {
        this.name = name;
        this.menu = menu;
    }

    public void showMenu() {
        System.out.println("============ МЕНЮ РЕСТОРАНА " + name.toUpperCase() + " ===============");
        menu.printMenuItems();
        System.out.println("============ " + name.toUpperCase() + " ===============");

    }
     
    public void availableMenuItem(String uuid) {
           MenuItem item =  menu.findItemByUUID(uuid);
           item.setAvailable(true);
    }

    public void deactivateMenuItem(String uuid) {
           MenuItem item =  menu.findItemByUUID(uuid);
           item.setAvailable(false);
    }
}
