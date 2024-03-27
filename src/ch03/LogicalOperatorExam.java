package ch03;

public class LogicalOperatorExam {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;

        System.out.println(b1 && b2);
        System.out.println(b1 && b3);

        System.out.println(b1 || b2);
        System.out.println(b1 || b3);
        System.out.println(b2 || b2);

        System.out.println(b1 ^ b3);
        System.out.println(b1 ^ b2);

        System.out.println(!b1);
        System.out.println(!b2);
        
        int score = 65;
        if(score >= 70 && score <= 100) {
            System.out.println("성공");
        } else {
            System.out.println("실패");
        }
    }
}
