package pl.shonsu.horus;

import java.util.Iterator;

interface Block {
    String getColor();

    String getMaterial();

    int count();

    Iterator<Block> createIterator();
}
