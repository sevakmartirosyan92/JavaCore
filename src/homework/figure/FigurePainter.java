package homework.figure;

public class FigurePainter {
    /*
     *
     * *
     * * *
     * * * *
     * * * * *
     */
    char c = '?';
    void figure1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

        /*       *
               * *
             * * *
           * * * *
         * * * * *
         */
        void figure2() {
            for (int i = 0; i < 5; i++) {
                for (int j = 5; j > i; j--) {
                    System.out.print("  ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print(c + " ");
                }
                System.out.println();
            }
        }
           /*
           * * * * *
           * * * *
           * * *
           * *
           *
                    */
    void figure3(){
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(c + " ");
            }
           System.out.println();
            }
        }
    }


