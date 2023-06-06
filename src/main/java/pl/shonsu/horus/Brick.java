package pl.shonsu.horus;

import java.util.Iterator;

class Brick implements Block{
    private String color;
    private String material;

    public Brick(String color, String material) {
        this.color = color;
        this.material = material;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getMaterial() {
        return material;
    }

    @Override
    public int count() {
        return 1;
    }

    public Iterator<Block> createIterator(){
        return new NullIterator();
    }

}
