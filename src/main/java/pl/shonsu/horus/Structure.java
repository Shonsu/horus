package pl.shonsu.horus;

import java.util.List;
import java.util.Optional;

interface Structure {
    // zwraca dowolony element o podanym kolorze
    Optional<Block> findBlockByColor(String color);

    // zwraca wszystgkie elementy z danego materiału
    List<Block> findBlocksByMaterial(String material);

    // zwraca liczbę wszystkich elementów tworzących strukturę
    int count();
}
