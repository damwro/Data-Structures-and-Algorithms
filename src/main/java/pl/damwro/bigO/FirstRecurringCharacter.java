package pl.damwro.bigO;

import java.util.HashMap;

class FirstRecurringCharacter {

    public static void main(String[] args) {
        int[] input = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 19 };

        System.out.println("-----------MAP--------------");
        System.out.println(findFirstCharacter(input));
        System.out.println("-----------BRUTE--------------------");
        System.out.println(findFirstBrute(input));
        System.out.println("----------------------------------");
    }

    private static int findFirstBrute(int[] input) {
        int counter = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] == input[j]) {
                    System.out.println("Big O() " +counter);
                    return input[i];
                }
                counter++;
            }
        }
        throw new RuntimeException("Not found");
    }

    private static int findFirstCharacter(int[] input) {
        int counter = 0;
        HashMap<Object, Object> map = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            if (map.containsValue(input[i])) {
                System.out.println("Big O() " +counter);
                return input[i];
            } else {
                map.put(i, input[i]);
                counter++;
            }
        }
        throw new RuntimeException("Not found");
    }

}
