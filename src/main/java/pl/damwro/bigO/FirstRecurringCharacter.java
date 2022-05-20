package pl.damwro.bigO;

import java.util.HashMap;

class FirstRecurringCharacter {

    public static void main(String[] args) {
        int[] input = new int[] { 2, 1, 5, 42, 3, 5, 2, 1 ,2};

        System.out.println("-----------MAP--------------");
        System.out.println(findFirstCharacter(input));
        System.out.println("-----------BRUTE--------------------");
        System.out.println(findFirstBrute(input));
        System.out.println("----------------------------------");
    }

    private static int findFirstBrute(int[] input) {
        int counter = 0;
        int recurringIndex = input.length;
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < recurringIndex; j++) {
                if (input[i] == input[j]) {
                    recurringIndex = j;
                }
                counter++;
            }
        }
        System.out.println("Counter: " + counter);
        return input[recurringIndex];
    }

    private static int findFirstCharacter(int[] input) {
        int counter = 0;
        HashMap<Object, Object> map = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            if (map.containsValue(input[i])) {
                System.out.println("Counter: " + counter);
                return input[i];
            } else {
                map.put(i, input[i]);
                counter++;
            }
        }
        throw new RuntimeException("Not found");
    }

}
