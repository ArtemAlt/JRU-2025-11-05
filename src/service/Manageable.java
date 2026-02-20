package service;

public interface Manageable<T, I>{

    T create(I args);

    T getInfo();

    Boolean deactivate(T t);

}