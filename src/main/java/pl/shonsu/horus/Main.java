package pl.shonsu.horus;

import java.util.List;
import java.util.Optional;

class Main {
    public static void main(String[] args) {

        List<Block> blocks0 = List.of(
                new Brick("Red1", "wood"),
                new Brick("Green1", "wood"),
                new Brick("Blue", "wood"),
                new Brick("Cyan1", "wood"));
        List<Block> blocks1 = List.of(
                new Brick("Red1", "material11"),
                new Brick("Green1", "material12"),
                new CompoundBrick(blocks0),
                new Brick("Blue", "material13"),
                new Brick("Cyan1", "material14"));
        List<Block> blocks2 = List.of(
                new Brick("Red", "material1"),
                new CompoundBrick(blocks1),
                new Brick("Blue", "material3"),
                new Brick("Cyan", "material4"));
        CompoundBrick brick = new CompoundBrick(blocks2);

        Wall wall = new Wall(brick);

        List<Block> blocks = wall.findBlocksByMaterial("wood");
        blocks.stream().forEach(block -> System.out.println(block.getMaterial() + " " + block.getMaterial()));

        System.out.println(wall.count());

        Optional<Block> block = wall.findBlockByColor("Red123");
        block.ifPresent(block1 -> System.out.println(block1.getColor()));

    }
}
