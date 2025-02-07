package day16_NestedForLoops;

public class C03_Task_2 {
    public static void main(String[] args) {
        /**
         * 1 2 3 4 5
         * 1 2 3 4 5
         * 1 2 3 4 5
         */
        // outer Loop
        for (int i = 1; i < 4; i++) {
            // inner Loop
            for (int j = 1; j < 6; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        /**
         * 1 2 3 4 5   kutu 1   findik sayisi 1-5          i + j = 6; j= 6-i
         * 1 2 3 4     kutu 2   findik sayisi 1-4
         * 1 2 3       kutu 3   findik sayisi 1-3
         * 1 2         kutu 4   findik sayisi 1-2
         * 1           kutu 5   findik sayisi 1
         */
        System.out.println("--------------------------------------------------");
        //outer loop
        for (int i = 1; i < 6; i++) {
            //inner Loop
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("--------------------------");

        /**
         * x x x x x  kutu 1
         * x x x x    kutu 2
         * x x x      kutu 3
         * x x        kutu 4
         * x          kutu 5
         */
        // outer Loop
        for (int i = 1; i < 6; i++) {
            // inner loop
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print("x ");
            }
            System.out.println();
        }

        System.out.println("--------------------------");

        /**
         *  x        kutu 1     findik sayisi 1
         *  x x      kutu 2     findik sayisi 1 - 2
         *  x x x    kutu 3     findik sayisi 1 - 3
         *  x x      kutu 4     findik sayisi 1 - 2
         *  x        kutu 5     findik sayisi 1
         */
        // outer Loop
        for (int i = 1; i < 6; i++) {
            if (i <= 3) {
                // inner loop 1
                for (int j = 1; j <= i; j++) {
                    System.out.print("x ");
                }
                System.out.println();
            } else {
                // inner loop 2
                for (int k = 5; k >= i; k--) {
                    System.out.print("x ");
                }
                System.out.println();

            }
        }
        System.out.println("--------------------------");

        /**
         *  x          kutu 1     findik sayisi 1
         *  x x        kutu 2     findik sayisi 1 - 2
         *  x x x      kutu 3     findik sayisi 1 - 3
         *  x x x x    kutu 4     findik sayisi 1 - 4
         *  x x x x x  kutu 5     findik sayisi 1 - 5
         *  x x x x    kutu 6     findik sayisi 1 - 4
         *  x x x      kutu 7     findik sayisi 1 - 3
         *  x x        kutu 8     findik sayisi 1 - 2
         *  x          kutu 9     findik sayisi 1
         */
        for (int i = 1; i <= 9; i++) {
            if (i <= 5) {
                // inner loop 1
                for (int j = 1; j <= i; j++) {
                    System.out.print("x ");
                }
                System.out.println();
            } else {
                // inner loop 2
                for (int k = 9 ; k >= i; k--) {
                    System.out.print("x ");
                }
                System.out.println();

            }
        }

    }
}
