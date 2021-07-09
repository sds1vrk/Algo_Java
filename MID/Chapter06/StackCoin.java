package MID.Chapter06;

// Stack : LIFO
// Stack<E> stack =new Stack<E>();
// push (주어진 객체를 스택에 넣는다)
// peek() 스택의 맨 위 객체를 가져온다.  (객체를 스택에서 제거 안함)
// pop() 스택의 맨 위 객체를 가져온다. 객체 제거

public class StackCoin {

    private int value;


    public StackCoin(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
