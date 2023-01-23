public class MissingNumber {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{2, 1, 4, 3, 6, 5, 7, 10, 9}, 10)); // 8
        System.out.println(missingNumber(new int[]{2, 1, 4, 3, 6, 5, 7, 10, 9, 8}, 10)); // 0

    }
//    Imagine a list of numbers from 1 to max_num, inclusive - except that one of these numbers will be missing from the list.
//    Write a function that takes this list of numbers, as well as the max_num, and it should return the missing number.
//    For example, given a list of numbers, in random order, of 1…10, 8 was removed. If this list and the maxNum of 10 was passed into the function,
//    it would return 8: missingNumber({2, 1, 4, 3, 6, 5, 7, 10, 9}, 10) ⇒ 8
//    If there is no missing number, the function should return 0.
    static int missingNumber(int[] numbers, int maxNum) {
        int expectedSum = 0;
        for(int i=1; i < maxNum+1; i++) {
            expectedSum+=i;
        }
        int sum = 0;
        for(var n : numbers) {
            sum+=n;
        }
        return expectedSum - sum;
    }
}
