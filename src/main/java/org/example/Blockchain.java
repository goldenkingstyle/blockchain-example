package org.example;

public interface Blockchain {
    public void add(Block block);

    public void removeLastElement();

    public void printAllElements();
}
