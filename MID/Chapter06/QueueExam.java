package MID.Chapter06;

// Queue<E> queue=new LinkedList<E>();
// 링크드 리스트를 이용하여 큐 구현
// offer() 주어진 객체를 넣는다.
// peek() 객체 하나를 가져온다. 큐에서 제거 안한다.
// poll() 객체를 가져온다. 큐에서 제거
import java.util.*;
public class QueueExam {
    public static void main(String[] args) {
        Queue<QueueMessage> messageQueue=new LinkedList<QueueMessage>();

        messageQueue.offer(new QueueMessage("sendEmail","sds"));
        messageQueue.offer(new QueueMessage("sendEMS","sjw"));
        messageQueue.offer(new QueueMessage("sendCall","sdj"));


        while(!messageQueue.isEmpty()) {
            QueueMessage message=messageQueue.poll();

            switch (message.command) {
                case "sendEmail" :
                    System.out.println(message.to+"님에게 이메일을 보낸다.");
                     break;
                case "sendEMS":
                    System.out.println(message.to+"님에게 EMS를 보낸다.");
                    break;
                case "sendCall" :
                    System.out.println(message.to+"님에게 전화를 한다.");

            }


        }

    }
}
