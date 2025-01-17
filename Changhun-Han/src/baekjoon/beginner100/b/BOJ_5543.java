package baekjoon.beginner100.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/5543">
 * https://www.acmicpc.net/problem/5543
 * </a>
 */
public class BOJ_5543 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int burger = 2001;
        int drink = 2001;
        
        for (int i = 0; i < 3; i++) {
            int value = Integer.parseInt(br.readLine());
            if (value < burger) {
                burger = value;
            }
        }
        
        for (int i = 0; i < 2; i++) {
            int value = Integer.parseInt(br.readLine());
            if (value < drink) {
                drink = value;
            }
        }
        
        System.out.println(burger + drink - 50);
        br.close();
    }
    
}