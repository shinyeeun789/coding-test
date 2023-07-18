package level1;

import java.util.*;

// 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
public class Question1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] strArr = sc.nextLine().split(" ");
        if(Integer.parseInt(strArr[0]) > Integer.parseInt(strArr[1])) System.out.println(">");
        else if(Integer.parseInt(strArr[0]) < Integer.parseInt(strArr[1])) System.out.println("<");
        else System.out.println("==");

    }

}
