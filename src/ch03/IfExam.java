package ch03;

public class IfExam {
    public static void main(String[] args) {
        int x=50;
        int y=60;

        if(x > y){
            System.out.println("x는 y보다 큽니다.");
            System.out.println("test 1");
        }

        if(x > y){
            System.out.println("x는 y보다 큽니다.");
            System.out.println("test 2");
        }

        if(x==y) {
            System.out.println("x는 y와 같습니다.");
        } else if(x>y){
            System.out.println("x는 y보다 큽니다.");
        } else {
            System.out.println("x는 y보다 다릅니다.");
        }
    }
}
