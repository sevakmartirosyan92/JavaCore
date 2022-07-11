package classwork.chapter456789.chapter5.arrayUtil;

public class ArrayUtil {
    //Տպել մասիվի բոլոր էլեմենտները:
    void print(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }

    }

    //Տպել մասիվի ամենամեծ թիվը:
    int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    //Տպել մասիվի ամենափոքր թիվը:
    int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    //Տպել մասիվի կենտ էլեմենտները:
    void printOddEl(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    //Տպել մասիվի զույգ էլեմենտները:
    void printEvenEl(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    //Տպեք կենտերի քանակը:
    void printOddCount(int[] array) {
        int oddCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println("oddCount " + oddCount);
    }

    //Տպել զույգերի քանակը:
    void printEvenCount(int[] array) {
        int evenCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("evenCount " + evenCount);
    }

    //Տպեք մասիվի բոլոր թվերի միջին թվաբանականը (բոլոր էլեմենտների գումարը / էլեմենտների քանակի վրա):
    void sum(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("sum " + sum / array.length);
    }

    //Տպեք մասիվի էլեմենտների գումարը։
    void setMean(int[] array) {
        int mean = 0;
        for (int i = 0; i < array.length; i++) {
            mean += array[i];
        }
        System.out.println("mean " + mean);
    }


    void sortFromMin(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] < array[j - 1]) {
                    int temp = array[i];
                    array[i] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }
}