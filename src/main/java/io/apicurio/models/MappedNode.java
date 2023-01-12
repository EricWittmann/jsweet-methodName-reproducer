package io.apicurio.models;

public interface MappedNode<T> {

    public void addItem(String name, T item);
    public T removeItem(String name);

}
