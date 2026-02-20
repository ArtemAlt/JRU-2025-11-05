package dto.item;

import model.Item;

import java.time.format.DateTimeFormatter;

public class GetItemInfoDto {    
    private final String name;
    private final Integer price;
    private final Boolean isActive;
    private final String createdAt;
    
    public GetItemInfoDto(Item item) {
        this.name = item.getName();
        this.price = item.getPrice();
        this.createdAt = item.getCreatedAt().format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm"));
        this.isActive = item.getIsActive();
    }


    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public Boolean getActive() {
        return isActive;
    }

    public String getCreatedAt() {
        return createdAt;
    }
}