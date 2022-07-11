package classwork.chapter456789.chapter6.practicehomework;

public class PracticeHomeworkDemo {
    public static void main(String[] args) {
        PracticeHomework practiceHomework = new PracticeHomework();
        System.out.println(practiceHomework.convert(4));

        System.out.println(practiceHomework.calcAge(1));

        System.out.println(practiceHomework.nextNumber(6));

        System.out.println(practiceHomework.isSameNum(5,5));
        System.out.println(practiceHomework.isSameNum(4,8));
        System.out.println(practiceHomework.lessThanOrEqualToZero(-4));
        System.out.println(practiceHomework.reverseBool(false));

        int[] array1 = {7,11,5,9};
        int[] array2 = {9,66,55,47,98};
        System.out.println(practiceHomework.maxLength(array1, array2));

    }
}
