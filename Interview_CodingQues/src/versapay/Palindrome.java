package versapay;

/*
 * String with k distinct characters and no same characters adjacent
 * 
 * Input  : n = 5, k = 3 
Output :  abcab
Explanation: 3 distinct character a, b, c
and n length string. 

Input: 3 2
Output: aba 
Explanation: 2 distinct character 'a' 
and 'b' and n length string.
 */
public class Palindrome {
	
    public static String solution(int N, int K) {
        // write your code in Java SE 8

    String res = "";
         
        for (int i = 0; i < K; i++)
            res = res + (char)('a' + i);
     
        int count = 0;
         
        for (int i = 0; i < N - K; i++)
        {
            res = res + (char)('a' + count);
            count++;
             
            if (count == K)
                count = 0;
        }
         
        return res;


    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5, k = 2;
        
        System.out.println(solution(n, k));

	}

}
