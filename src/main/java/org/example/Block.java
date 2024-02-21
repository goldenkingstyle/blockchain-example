package org.example;

import java.util.concurrent.atomic.AtomicLong;

public class Block {

    private final String hash;
    private static final AtomicLong idCounter = new AtomicLong(0);
    private final long id;

    public Block(String hash) {
        this.hash = hash;
        this.id = idCounter.getAndIncrement();
    }

    @Override
    public String toString(){
        return "Hash: " + hash + ", id: " + id;
    }
}
