package LinearSearch;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };
        System.out.println(EvenDigits(nums));
    }

    static int EvenDigits(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static int digits(int num) {
        int len = 0;
        while (num > 0) {
            len++;
            num = num / 10;
        }
        return len;
    }

    static boolean even(int nums) {
        int numofdigits = digits(nums);
        if (numofdigits % 2 == 0) {
            return true;
        }
        return false;
    }

}
