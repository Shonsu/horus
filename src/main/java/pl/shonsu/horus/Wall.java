package pl.shonsu.horus;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

// W odpowiedzi na zainteresowanie naszą ofertą pracy chcielibyśmy zaprosić Panią do pierwszego etapu rekrutacji na
// stanowisko Junior Java Developer w firmie Horus.
// Poniżej przekazujemy zadanie z prośbą o analizę poniższego kodu i zaimplementowanie metod findBlockByColor,
// findBlocksByMaterial, count w klasie Wall - najchętniej unikając powielania kodu i umieszczając całą logikę w klasie Wall.
// Z uwzględnieniem w analizie i implementacji interfejsu CompositeBlock!

public class Wall implements Structure {
    private CompositeBlock compositeBlock;

    public Wall(CompositeBlock compositeBlock) {
        this.compositeBlock = compositeBlock;
    }

    @Override
    public Optional<Block> findBlockByColor(String color) {
        Iterator<Block> iterator = compositeBlock.createIterator();
        while(iterator.hasNext()){
            Block tmp = iterator.next();
            if(tmp.getColor().equals(color)){
                return Optional.of(tmp);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        List<Block> result = new ArrayList<>(List.of());
        Iterator<Block> iterator = compositeBlock.createIterator();
        while(iterator.hasNext()){
            Block tmp = iterator.next();
            if(tmp.getMaterial().equals(material)){
                result.add(tmp);
            }
        }
        return result;
    }

    @Override
    public int count() {
        Iterator<Block> iterator = compositeBlock.createIterator();
        int counter = 0;
        while(iterator.hasNext()){
            counter += iterator.next().count();
        }
        return counter;
    }
    
}
