package pl.shonsu.horus;

import java.util.List;
import java.util.Optional;

 interface Structure {
    Optional<Block> findBlockByColor(String color);

    List<Block> findBlocksByMaterial(String material);

    int count();

}
