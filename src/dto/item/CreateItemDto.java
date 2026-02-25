package dto.item;

public class CreateItemDto {
    private final String name;
    private final Integer price;
    private final Boolean isActive;

    public CreateItemDto(String name, Integer price, Boolean isActive) {
        this.name = name ;
        this.price = price;
        this.isActive = isActive;
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

}