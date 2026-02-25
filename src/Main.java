import dto.item.CreateItemDto;
import dto.item.GetItemInfoDto;
import exception.DuplicateException;
import service.ItemService;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        ItemService is = new ItemService();

        CreateItemDto dto = new CreateItemDto("item", 100, true);
        CreateItemDto dto1 = new CreateItemDto("item1", 200, true);
        CreateItemDto dto2 = new CreateItemDto("item", 200, true);

        try {
            is.create(dto);
            System.out.println("Item created successfully");
            is.create(dto1);
            System.out.println("Item1 created successfully");
//            is.create(dto2);
//            System.out.println("Item2 created successfully");
        } catch (DuplicateException e) {
            System.out.println(dto.getName());
        }

        Optional<GetItemInfoDto> deac =  is.getInfo("item");
        System.out.println(deac.get());
        is.deactivate(deac.get());

        Optional<GetItemInfoDto> deac1 =  is.getInfo("item");
        System.out.println(deac1.get());

        Optional<GetItemInfoDto> info = is.getInfo("item3");
        System.out.println(info.get());
        is.deactivate(info.get());



    }
}

//Ресторан
//


// Orders CRUD
// Client
// Menu CRUD
//      item, price
// ENUM: orderStatus
// Bill 
// 


// controllers: 
// 
// createOrder, GetOrderInfo, deactivateOrder, changeOrderItems
// createItem, itemInfo,  deactivateItem, createNewBasedOnCurrent
// createMenu, menuInfo,  updateMenu, deactivateMenu
// getBill, closeBill
