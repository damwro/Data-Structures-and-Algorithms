package pl.damwro.bigO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MergeSortedArrays {

    public static void main(String[] args) {
        System.out.println(merge(Arrays.asList(1, 2, 3, 50), Arrays.asList(3, 5, 5, 100)));
    }

    private static List<Integer> merge(List<Integer> list1, List<Integer> list2) {
        List<Integer> integers = new ArrayList<>(list1);
        integers.addAll(list2);

        return integers.stream().sorted().toList();
    }
}
