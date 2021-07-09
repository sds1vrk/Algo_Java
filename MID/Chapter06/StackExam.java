package MID.Chapter06;
import java.util.*;


// Stack : LIFO
// Stack<E> stack =new Stack<E>();
// push (주어진 객체를 스택에 넣는다)
// peek() 스택의 맨 위 객체를 가져온다.  (객체를 스택에서 제거 안함)
// pop() 스택의 맨 위 객체를 가져온다. 객체 제거

public class StackExam {

    public static void main(String[] args) {

        Stack<StackCoin> coinBox=new Stack<StackCoin>();


        coinBox.push(new StackCoin(100));
        coinBox.push(new StackCoin(200));
        coinBox.push(new StackCoin(300));


//      coinBox가 빌떄까지 반복
        while (!coinBox.isEmpty()) {
            StackCoin coin=coinBox.pop();
            System.out.println("꺼낸 동전"+coin.getValue());

        }
    }


}
