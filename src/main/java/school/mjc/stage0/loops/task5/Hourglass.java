package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
//        for (int i = 0; i < height; ++i) {
//            // print spaces
//            for (int j = 0; j < i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k < 2 * (height - i) - (height % 2); k++) {
//                System.out.print("8");
//            }
//            System.out.print("\n");
//        }
//
////        for (int i = height; i >= 0; i--) {
////            // print spaces
////            for (int j = 0; j < i; j++) {
////                System.out.print(" ");
////            }
////            for (int k = 0; k < 2 * (height - i) - (height % 2); k++) {
////                System.out.print("8");
////            }
////            System.out.println();
////        }

        int row = 1, col;
        boolean needsInvert = false;
        while (row > 0) {
            // numSpaces = currentRow - 1.
            for (col = 1; col < row; col++)
                System.out.print(" ");
            // numStars = width - 2 * numSpaces
            // <=> numStars = width - 2 * (currentRow - 1)
            // Which is the total iterations in [row, width - row + 1]
            for (col = row; col <= height - row + 1; col++)
                System.out.print("8");
            System.out.println();

            // If row gets pass height, invert.
            if (row >= height)
                needsInvert = true;

            if (needsInvert)
                --row;
            else
                ++row;
        }
    }
}
