package school.mjc.stage0.loops.task5;

public class Rectangle {
    public static void main(String[] args) {
        printRectangleFrom8s(4, 3);
    }
    public static void printRectangleFrom8s(int length, int height){
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < height; j++) {
                if (i == 0 || j == 0 || i == length-1 || j == height-1) {
                    System.out.print(8);
                } else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
