package baekjoon;

import java.util.Scanner;

/**
 * @see <a href="https://www.acmicpc.net/problem/2914">https://www.acmicpc.net/problem/2914</a>
 */
public class baekjoon_2914 {
    
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int I = scanner.nextInt() - 1;
        System.out.println(A * I + 1);
        scanner.close();
    }
    
}
