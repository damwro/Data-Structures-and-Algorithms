package pl.damwro.bigO;

class ReverseString {

    public static void main(String[] args) {
        String data = "Damian Wróbel";
        System.out.println(data);
        System.out.println(reverse(data));
    }

    private static String reverse(String data) {

        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("String builder reverse");
        System.out.println(stringBuilder.append(data).reverse());

        StringBuilder stringBuilder1 = new StringBuilder();
        int length = data.length();

        while (length > 0) {
            stringBuilder1.append(data.charAt(length - 1));
            length--;
        }
        System.out.println("String builder while");
        System.out.println(stringBuilder1);


        StringBuilder stringBuilder3 = new StringBuilder();

        int numberOfChars = data.length();

        for (int i = numberOfChars; i > 0; i--) {
            stringBuilder3.append(data.charAt(i - 1));
        }
        System.out.println("String builder for loop");
        return stringBuilder3.toString();
    }
}
