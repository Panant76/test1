public class BingoOrNot {
    public static String bingo(int[] numberArray) {
        int[] bingo = new int[]{2, 9, 14, 7, 15};
        int count = 0;

        for (int a : bingo) {
            for (int b : numberArray) {
                if (a == b) {
                    count++;
                    break;

                }
            }
        }
        if (count == bingo.length) return "Win";
        else return "Lose";
    }

    public static void main(String[] args) {
        int[] test = new int[]{1, 2, 9, 4, 6, 7, 8, 2, 5, 14, 3, 15};
        System.out.println(bingo(test));
    }
}