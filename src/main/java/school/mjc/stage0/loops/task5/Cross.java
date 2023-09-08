package school.mjc.stage0.loops.task5;

public class Cross {
    public static void main(String[] args) {
        printCross(0);
    }
    public static void printCross(int sideLength) {
        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                if (i == j || (i + j == sideLength)) {
                    System.out.print(8);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
