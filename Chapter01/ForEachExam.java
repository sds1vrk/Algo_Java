package Chapter01;

public class ForEachExam {

    public static void main(String[] args) {

        int [] arr={10,20,30,40,50};

        for (int i=0;i<arr.length;i++) {
            int value=arr[i];
            System.out.println(value);
        }

//        For Each, 담을 공간 변수
        for (int value:arr) {
            System.out.println(value);
        }



    }

}
