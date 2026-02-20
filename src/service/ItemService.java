package service;

import dto.item.CreateItemDto;
import dto.item.GetItemInfoDto;
import model.Item;

import java.util.HashSet;
import java.util.Set;

public class ItemService implements Manageable< GetItemInfoDto, CreateItemDto> {

    private final Set<Item> repository;

    public ItemService() {
        this.repository = new HashSet<>();
    }

    @Override
    public GetItemInfoDto create(CreateItemDto args) {
        Item current = new Item(args);
        repository.add(current);
        return new GetItemInfoDto(current);
    }

    @Override
    public GetItemInfoDto getInfo() {
        return null;
    }

    @Override
    public Boolean deactivate(GetItemInfoDto getItemInfoDto) {
        return null;
    }

}