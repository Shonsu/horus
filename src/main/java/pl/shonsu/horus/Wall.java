package pl.shonsu.horus;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class Wall implements Structure {

    private CompositeBlock compositeBlock;

    public Wall(CompositeBlock compositeBlock) {
        this.compositeBlock = compositeBlock;
    }


    public Optional<Block> findBlockByColor(String color) {
        Iterator<Block> iterator = compositeBlock.createIterator();
        while (iterator.hasNext()) {
            Block tmp = iterator.next();
            if (tmp.getColor().equals(color)) {
                return Optional.of(tmp);
            }
        }
        return Optional.empty();
    }

    public List<Block> findBlocksByMaterial(String material) {
        List<Block> result = new ArrayList<>(List.of());
        Iterator<Block> iterator = compositeBlock.createIterator();
        while (iterator.hasNext()) {
            Block tmp = iterator.next();
            if (tmp.getMaterial().equals(material)) {
                result.add(tmp);
            }
        }
        return result;
    }

    public int count() {
        Iterator<Block> iterator = compositeBlock.createIterator();
        int counter = 0;
        while (iterator.hasNext()) {
            counter += iterator.next().count();
        }
        return counter;
    }
}
