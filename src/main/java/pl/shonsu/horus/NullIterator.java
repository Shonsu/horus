package pl.shonsu.horus;

import java.util.Iterator;

class NullIterator implements Iterator<Block> {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public CompositeBlock next() {
        return null;
    }
}
