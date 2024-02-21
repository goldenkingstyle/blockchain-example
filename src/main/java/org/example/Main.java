package org.example;

public class Main {
    public static void main(String[] args) {

        Blockchain blockchain = new BlockchainImpl();

        Hash hash = new Hash();

        Block block1 = new Block(hash.generateHash());
        Block block2 = new Block(hash.generateHash());
        Block block3 = new Block(hash.generateHash());

        blockchain.add(block1);
        blockchain.add(block2);
        blockchain.add(block3);

        blockchain.printAllElements();
        blockchain.removeLastElement();

    }
}