package versapay;

import java.util.Arrays;

/*
This is a demo task.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
 */

public class SmallestPositiveInteger {

    public static int solution(int[] arr) {

        Arrays.sort(arr);

        int smallest = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == smallest) {
                smallest++;
            }
        }

        return smallest;
    }

    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	
        System.out.println("Hello Codility Demo Test for Java, B");
        int[] array1 = {-1, -3};
        System.out.println(solution(array1));
        int[] array2 = {1, -1};
        System.out.println(solution(array2));
        int[] array3 = {2, 1, 2, 5};
        System.out.println(solution(array3));
        int[] array4 = {3, 1, -2, 2};
        System.out.println(solution(array4));
        int[] array5 = {};
        System.out.println(solution(array5));
        int[] array6 = {1, -5, -3};
        System.out.println(solution(array6));
        int[] array7 = {1, 2, 4, 5};
        System.out.println(solution(array7));
        int[] array8 = {17, 2};
        System.out.println(solution(array8));

	}

}


/*
 Compilation successful.

Example test:   [1, 3, 6, 4, 1, 2]
OK

Example test:   [1, 2, 3]
OK

Example test:   [-1, -3]
OK

Your code is syntactically correct and works properly on the example test.
Note that the example tests are not part of your score. On submission at least 8 test cases not shown here will assess your solution.
All changes saved

Any problems with the editor?
 */
