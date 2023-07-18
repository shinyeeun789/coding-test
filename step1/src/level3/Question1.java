package level3;

// 10807번) 총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
// https://www.acmicpc.net/problem/10807

import java.util.*;

public class Question1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrCnt = sc.nextInt();
        sc.nextLine();
        String[] strArr = sc.nextLine().split(" ");
        int find = sc.nextInt();

        int count = 0;
        for (int i=0; i<strArr.length; i++) {
            if (Integer.parseInt(strArr[i]) == find) {
                count++;
            }
        }
        System.out.println(count);

        // Collections를 사용한 방법
    /*
        int count = sc.nextInt();
        sc.nextLine();              // nextInt에서 엔터키는 받지 않고, 숫자만 받기 때문에 nextLine이 제대로 동작하지 않는 문제를 해결하기 위한 코드
        List<String> strArr = new ArrayList<>(Arrays.asList(sc.nextLine().split(" ")));
        String find = sc.nextLine();
        System.out.println(Collections.frequency(strArr, find));
    */

    }

}
