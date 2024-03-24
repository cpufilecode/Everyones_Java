package ch02;

public class OperatorExam {
    public static void main(String[] args) {
        int i1 = -5;
        int i2 = +i1;
        int i3 = -i1;
        int i4 = ++i3;
        int i5 = i3++;
        System.out.println(i5);
        System.out.println(i3);

        int i = 5;
        int j = 2;
        System.out.println(i+j);
        System.out.println(i-j);
        System.out.println(i*j);
        System.out.println(i/j);
        System.out.println(i / (double) j );
    }
}
