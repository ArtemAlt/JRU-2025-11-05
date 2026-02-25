package controller;

import service.ItemService;

import java.util.Map;

//@RestController
public class RestController {
    private ItemService itemService;

    //PostMapping
    public void getItemInfo(Map<String, String> headers, String body) {
        itemService.getInfo(body);
    }
}
