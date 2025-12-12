import java.util.Random;

public class MenuItem {
    private final String name;
    private final String description;
    private final double price;
    private boolean isAvailable;
    private final String uuid;

    public MenuItem(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
        isAvailable = true;
        uuid = name + new Random().nextInt();
    }

    public MenuItem(MenuItem menuItem) {
         this.name = menuItem.name;
         this.description = menuItem.description;
         this.price = menuItem.price;
         this.isAvailable = menuItem.isAvailable;
         this.uuid = menuItem.uuid;
    }

    public String menuItemInfo() {
        String dest= "";
         if (isAvailable) { dest = "Avalible";} else { dest= "Not avalible";}
        return (name + " | " + description + " | " + price + " | " + dest);
    }    

    public String getDescription() {
        return description;
    }
    public String getUuid() {
        return uuid;
    }


    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getName() {
        return name;
    }
    
    public void setAvailable (boolean value) {
        this.isAvailable = value;
    }

}