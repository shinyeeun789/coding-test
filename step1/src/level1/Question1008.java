package level1;

import java.util.*;

// 1008번) 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
public class Question1008 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] strArr = sc.nextLine().split(" ");
        sc.close();

        double a = Double.parseDouble(strArr[0]);
        double b = Double.parseDouble(strArr[1]);

        double result = a / b;

        System.out.println(result);

    }

}
