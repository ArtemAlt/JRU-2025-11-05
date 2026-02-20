package model;
import dto.item.CreateItemDto;

import java.time.LocalDateTime;
import java.util.UUID;

public class Item {
    private final UUID id;
    private final String name;
    private final Integer price;
    private final Boolean isActive;
    private final LocalDateTime createdAt;

    public Item(CreateItemDto args) {
        this.id = UUID.randomUUID();
        this.name = args.getName();
        this.price = args.getPrice();
        this.createdAt = LocalDateTime.now();
        this.isActive = args.getActive();
    }

    public String getName(){
        return this.name;
    }

    public Integer getPrice(){
        return this.price;
    }

    public Boolean getIsActive(){
        return this.isActive;
    }

    public LocalDateTime getCreatedAt(){
        return this.createdAt;
    }

    public UUID getId() {
        return id;
    }
}