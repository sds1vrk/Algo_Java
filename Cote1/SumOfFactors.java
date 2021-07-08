package Cote1;
import java.util.*;
public class SumOfFactors {

    public static int solution(int n) {

        HashSet<Integer> hash = new HashSet<Integer>();
        int answer = 0;


        for (int i = 1; i < Math.sqrt(n); i++) {

//            int k=n/i;
            if (n % i == 0) {
//                answer += n/i;
//                answer += i;
                hash.add(n/i);
                hash.add(i);
            }

        }

        Iterator<Integer> it1=hash.iterator();
        while(it1.hasNext()) {
            answer+=it1.next();
//            System.out.println(it1.next());
        }



        return answer;

    }


//    초기값을 n으로 하고 풀이

    class Solution2 {
        public int solution(int n) {
            int answer = n;

            for(int i=1; i <= n / 2; i++) {
                if(n % i == 0) {
                    answer += i;
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(12));

    }


}

