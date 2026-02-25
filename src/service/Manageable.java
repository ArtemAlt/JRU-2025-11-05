package service;

import exception.DuplicateException;
import exception.ObjectNotFoundException;

import java.util.Optional;

public interface Manageable<T, I>{

    T create(I args) throws DuplicateException;

    Optional<T> getInfo(String name);

    Boolean deactivate(T t) throws ObjectNotFoundException;

}