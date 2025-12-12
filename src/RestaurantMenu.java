
    public class RestaurantMenu {
        private final MenuItem[] menuItems;
        private int itemCount;
        private final int MINIMUM_ITEMS_VALUE = 1;

        // public Menu(MenuItem[] items) {
        //     this.menuItems = items;    
        // }
        
        // public Menu createMenu(MenuItem[] items) {
        //     menuItems = items;
        // }

        public RestaurantMenu(int size) {
            if (size > 0){ 
                this.menuItems = new MenuItem[size];
            } else {
                this.menuItems = new MenuItem[MINIMUM_ITEMS_VALUE]  ;
            }
        }

        public boolean addItemToMenu(MenuItem item) {
            if (itemCount < menuItems.length) {
                menuItems[itemCount] = item;
                itemCount ++;
                return true;
            } else {
                return false;
            }
        }

        public void printMenuItems() {
            for (int i = 0; i < itemCount; i++) {
                System.out.println(menuItems[i].menuItemInfo());
            }
        }

        public MenuItem findItemByUUID(String uuid) {
            MenuItem empty = new MenuItem(" ", " ", 0.1);
            for (int index = 0; index < itemCount; index++) {
                if(menuItems[index].getUuid().equals(uuid)) {
                    return menuItems[index];
                } 
            }
            return empty;
        }
    }