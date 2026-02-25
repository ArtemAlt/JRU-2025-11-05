package service;

import dto.item.CreateItemDto;
import dto.item.GetItemInfoDto;
import exception.DuplicateException;
import exception.ObjectNotFoundException;
import model.Item;

import java.util.HashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

/**
 *  restInDto -m- inDto -s-  item -s-  outDto -m2- restOut
 *   noID - id - noID
 *
 *   inDto - outDto
 *   outDto - inOrderDto
 */
public class ItemService implements Manageable< GetItemInfoDto, CreateItemDto> {

    private final Set<Item> repository;

    public ItemService() {
        this.repository = new HashSet<>();
    }

    @Override
    public GetItemInfoDto create(CreateItemDto args) throws DuplicateException{
        Item current = new Item(args);
        if(getInfo(args.getName()).isPresent()) {
            throw new DuplicateException();
        }
        repository.add(current);
        return new GetItemInfoDto(current);
    }

    @Override
    public Optional<GetItemInfoDto> getInfo(String name) {
        return repository.stream()
        .filter(item -> Objects.equals(item.getName(), name))
        .map(GetItemInfoDto::new)
        .findFirst();
    }

    @Override
    public Boolean deactivate(GetItemInfoDto getItemInfoDto) throws ObjectNotFoundException {
        Optional<Item> info = getItem(getItemInfoDto.getName());
        if(!info.isPresent()) {
            throw new ObjectNotFoundException();
        }
        info.get().setIsActive(false);
        return true;
    }

    private Optional<Item> getItem(String name) {
        return repository.stream()
                .filter(item -> Objects.equals(item.getName(), name))
                .findFirst();
    }

}