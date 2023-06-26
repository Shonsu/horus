package pl.shonsu.horus;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class CompoundBrick implements CompositeBlock{
    Iterator<Block> iterator = null;
    List<Block> blocks = new ArrayList<>();

    public CompoundBrick(List<Block> blocks) {
        add(blocks);
    }

    public void add(List<Block> blocks) {
        this.blocks.addAll(blocks);
    }

    @Override
    public List<Block> getBlocks() {
        return blocks;
    }

    @Override
    public String getColor() {
        return "null";
    }

    @Override
    public String getMaterial() {
        return "null";
    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public Iterator<Block> createIterator() {
        if(iterator == null || !iterator.hasNext()){
            iterator = new CompositeIterator(blocks.iterator());
        }
        return iterator;
    }
}
