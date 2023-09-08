package school.mjc.stage0.loops.task5;

public class Hourglass {
    public static void main(String[] args) {
        printHourglassOfGivenSize(7);
    }
    public static void printHourglassOfGivenSize(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if ((j >= i && j+i <= height) || (j <= i && i+j >= height)) {
                    System.out.print(8);
                } else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
