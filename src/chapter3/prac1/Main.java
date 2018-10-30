package chapter3.prac1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Integer key = null;

        Search<Integer> searchAlgo = new BinarySearch<>();
        searchAlgo.search(list, key);

        searchAlgo = new LinearSearch<>();
        searchAlgo.search(list, key);
    }
}
