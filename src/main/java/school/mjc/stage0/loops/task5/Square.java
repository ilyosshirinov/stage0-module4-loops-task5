package school.mjc.stage0.loops.task5;

public class Square {
    //<88888 8 8 8 8 8 8 88888 >
//<88 88 >
    public void printSquareFrom8s(int sideLength) {   // 1-misol
        for (int x = 0; x < sideLength; x++) {
            for (int y = 0; y < sideLength; y++) {
                if (x == 0 || y == 0 || x + 1 == sideLength || y + 1 == sideLength) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Square square = new Square();
        square.printSquareFrom8s(5);
    }
}
