package Java.Programers.day01;

// 모의 고사
import java.util.*;
public class pro2_Test {

    public static int[] solution(int[] answers) {

//        int[] answer = {};

        int size=answers.length;

        ArrayList<Integer>a=new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        int a_size=a.size();

        ArrayList<Integer>b=new ArrayList<>();
        b.add(2);
        b.add(1);
        b.add(2);
        b.add(3);
        b.add(2);
        b.add(4);
        b.add(2);
        b.add(5);
        int b_size=b.size();


        ArrayList<Integer>c=new ArrayList<>();
        c.add(3);
        c.add(3);
        c.add(1);
        c.add(1);
        c.add(2);
        c.add(2);
        c.add(4);
        c.add(4);
        c.add(5);
        c.add(5);
        int c_size=c.size();

//        int aa[]=new int[5];
//        aa=aa*5;



//       a 재정렬
        if (a.size()<size) {

            int mok=size/a.size();
//            System.out.println("mok"+mok);
            int namuzi=size%a.size();

//            몫만큼 곱하고
//            a=a*mok;

            for (int i=1;i<mok;i++) {

//                몫만큼 반복
                for (int j=0;j<a_size;j++) {
                    a.add(a.get(j));
                }
            }

//            나머지 만큼 더해줌
            for (int i=0;i<namuzi;i++) {
                a.add(a.get(i));
            }
        }


        if (b.size()<size) {

            int mok=size/b.size();
//            System.out.println("mok"+mok);
            int namuzi=size%b.size();

//            몫만큼 곱하고
//            a=a*mok;

            for (int i=1;i<mok;i++) {

//                몫만큼 반복
                for (int j=0;j<b_size;j++) {
                    b.add(b.get(j));
                }
            }

//            나머지 만큼 더해줌
            for (int i=0;i<namuzi;i++) {
                b.add(b.get(i));
            }
        }


        if (c.size()<size) {

            int mok=size/c.size();
//            System.out.println("mok"+mok);
            int namuzi=size%c.size();

//            몫만큼 곱하고
//            a=a*mok;

            for (int i=1;i<mok;i++) {

//                몫만큼 반복
                for (int j=0;j<c_size;j++) {
                    c.add(c.get(j));
                }
            }

//            나머지 만큼 더해줌
            for (int i=0;i<namuzi;i++) {
                c.add(c.get(i));
            }
        }



//        System.out.println(a.toString());
//        System.out.println(b.toString());
//        System.out.println(c.toString());

//        int a_check=0;
//        int b_check=0;
//        int c_check=0;
//        ArrayList<Integer>check=new ArrayList<>(S)
        int check[]=new int[3];

        for (int i=0;i<size;i++) {

            if (a.get(i)==answers[i]) {
                check[0]+=1;
            }

            if (b.get(i)==answers[i]) {
                check[1]+=1;
            }

            if (c.get(i)==answers[i]) {
                check[2]+=1;
            }

        }

//        for (int i=0;i<check.length;i++) {
//            System.out.println(check[i]);
//        }

        int []check_b=new int[check.length];
        for (int i=0;i<check.length;i++) {
            check_b[i]=check[i];
        }


        Arrays.sort(check);
//        3명다 같을 경우(a=b=c) or 2명만 같을 경우 (a=b,a>c) (a=c, b>c), (b=c, b>a)

        int temp=check[check.length-1];
        int idx2=0;
        ArrayList<Integer> answer=new ArrayList<>();
//        System.out.println("temp"+temp);
        for (int i=0;i<check.length;i++) {
            if (temp==check_b[i]) {
                answer.add(i+1);
//                answer[0]={i+1};
//                idx2+=1;
            }
        }

        for (int i=0;i<answer.size();i++) {
//            System.out.println(answer.get(i));
        }

//        int answer
//        for (int i=0;i<)

//        int []last=answer.toArray(new int[answer.size()]);

        int []last=new int[answer.size()];

        int pp=0;
        for (int kk:last) {
            last[pp++]=kk;
        }











//        System.out.println;


        return last;
    }

    public static void main(String[] args) {
        pro2_Test p2=new pro2_Test();
        int aa[]={1,2,3,4,5,6,7,8,9,10,11};
        p2.solution(aa);

    }






}
