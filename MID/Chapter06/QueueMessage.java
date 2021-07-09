package MID.Chapter06;


// Queue<E> queue=new LinkedList<E>();
// 링크드 리스트를 이용하여 큐 구현
// offer() 주어진 객체를 넣는다.
// peek() 객체 하나를 가져온다. 큐에서 제거 안한다.
// poll() 객체를 가져온다. 큐에서 제거


public class QueueMessage {
    public String command;
    public String to;

    public QueueMessage(String command, String to) {
        this.command = command;
        this.to = to;
    }
}
