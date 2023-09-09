package school.mjc.stage0.loops.task5;

public class Hourglass {
    public static void main(String[] args) {
        printHourglassOfGivenSize(1);
    }
    public static void printHourglassOfGivenSize(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if ((j >= i && j+i <= height-1) || (j <= i && i+j >= height-1)) {
                    System.out.print(8);
                } else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
