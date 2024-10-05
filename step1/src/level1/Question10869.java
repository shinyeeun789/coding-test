package level1;

import java.util.*;

// 10869번) 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.

/* 입력 : 7 3
 * 출력 : 
 * 10
 * 4
 * 21
 * 2
 * 1
 */
public class Question10869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArr = sc.nextLine().split(" ");
        int frstNum = Integer.parseInt(strArr[0]);
        int scndNum = Integer.parseInt(strArr[1]);

        // A+B 출력
        System.out.println(frstNum + scndNum);
        // A-B 출력
        System.out.println(frstNum - scndNum);
        // A*B 출력
        System.out.println(frstNum * scndNum);
        // A/B 출력
        System.out.println(frstNum / scndNum);
        // A%B 출력
        System.out.println(frstNum % scndNum);
    }
}
