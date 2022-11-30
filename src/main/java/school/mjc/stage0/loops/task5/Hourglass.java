package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) { //4-misol
        for (int x = 0; x < height; x++) {
            for (int y = 0; y < height; y++) {
                if ((height - y >= x + 1 && y >= x) || (height - y <= x + 1 && y <= x)) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Hourglass hourglass = new Hourglass();
        hourglass.printHourglassOfGivenSize(5);
    }
}
