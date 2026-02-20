package dto.item;
import model.Item;

public class CreateItemDto {
    private final String name;
    private final Integer price;
    private final Boolean isActive;

    public CreateItemDto(Item current) {
        this.name = current.getName();
        this.price = current.getPrice();
        this.isActive = current.getIsActive();
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