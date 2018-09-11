import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/16113
 * BOJ 백준온라인져지 16113 시그널 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static char map[][];
    private static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new char[5][N / 5 + 2];
        String str = br.readLine();
        for (int i = 0; i < N; i++) {
            map[i / (N / 5)][i % (N / 5)] = str.charAt(i);
        }
        for (int i = 0; i < N / 5; i++) {
            if (map[0][i] == '#') {
                String tempString = getNumber(i);
                if (tempString.equals("")) continue;
                bw.write(tempString);
                i++;
                if (!tempString.equals("1")) i += 2;
            }
        }
        bw.flush();
    }
    private static String getNumber (int c) {
        int result = 0;
        int i = 0;
        while (i < 15) {
            if (map[i % 5][i / 5 + c] == '#') result += 1 << i;
            i++;
        }
        if ((result & (1+2+4+8+16)) > 0 && (result & 32) == 0 && (result & 64) == 0 && (result & 128) == 0 && (result & 256) == 0 && (result & 512) == 0) return "1";
        switch (result) {
            case 1+2+4+8+16+32+512+1024+2048+4096+8192+16384:
                return "0";
            case 1+2+4+8+16:
                return "1";
            case 1+4+8+16+32+128+512+1024+2048+4096+16384:
                return "2";
            case 1+4+16+32+128+512+1024+2048+4096+8192+16384:
                return "3";
            case 1+2+4+128+1024+2048+4096+8192+16384:
                return "4";
            case 1+2+4+16+32+128+512+1024+4096+8192+16384:
                return "5";
            case 1+2+4+8+16+32+128+512+1024+4096+8192+16384:
                return "6";
            case 1+32+1024+2048+4096+8192+16384:
                return "7";
            case 1+2+4+8+16+32+128+512+1024+2048+4096+8192+16384:
                return "8";
            case 1+2+4+16+32+128+512+1024+2048+4096+8192+16384:
                return "9";
            default:
                return "";
        }
    }
}
// 1 32 1024
// 2 64 2048
// 4 128 4096 
// 8 256 8192
// 16 512 16384