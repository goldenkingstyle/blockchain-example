package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BlockchainImpl implements Blockchain{

    ArrayList<Block> array = new ArrayList<>();

    @Override
    public void add(Block block) {
        array.add(block);
    }

    @Override
    public void removeLastElement(){
        array.remove(array.size() - 1);
    }

    @Override
    public void printAllElements(){
        for(Block block : array){
            System.out.println(block.toString());
        }
    }
}
