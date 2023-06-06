package pl.shonsu.horus;

import java.util.Iterator;
import java.util.Stack;

class CompositeIterator implements Iterator<Block> {
    Stack<Iterator<Block>> stack = new Stack<>();

    public CompositeIterator(Iterator<Block> iterator) {
        stack.push(iterator);
    }
    @Override
    public boolean hasNext() {
        if (stack.isEmpty()) {
            return false;
        } else {
            Iterator<Block> iterator = stack.peek();
            if (!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }

    @Override
    public Block next() {
        if (hasNext()) {
            Iterator<Block> iterator = stack.peek();
            Block compositeBlock = iterator.next();
            stack.push(compositeBlock.createIterator());
            return compositeBlock;
        } else {
            return null;
        }
    }
}
