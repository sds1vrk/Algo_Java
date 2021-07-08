package Chapter01;

public class ForExam {
    public static void main(String[] args) {
        int hap=0;
        for (int i=1;i<=100;i++) {
//            홀수일때는 건너뜀
            if (i%2!=0) {
                continue;
            }
            hap+=i;

//            50까지만 합을 하고 50일때 종료
            if(i==50) {
                break;
            }


        }
        System.out.println(hap);

    }


}
