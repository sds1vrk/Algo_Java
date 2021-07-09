package Java.Programers.day01;
import java.util.Stack;
public class pro3_kakaoRefer {

    class Solution {
        public int solution(int[][] board, int[] moves) {
            int answer = 0;
            Stack<Integer> stack = new Stack<>();
            for (int move : moves) {
                for (int j = 0; j < board.length; j++) {
                    if (board[j][move - 1] != 0) {
                        if (stack.isEmpty()) {
                            stack.push(board[j][move - 1]);
                            board[j][move - 1] = 0;
                            break;
                        }
                        if (board[j][move - 1] == stack.peek()) {
                            stack.pop();
                            answer += 2;
                        } else
                            stack.push(board[j][move - 1]);
                        board[j][move - 1] = 0;
                        break;
                    }
                }
            }
            return answer;
        }
    }
}
