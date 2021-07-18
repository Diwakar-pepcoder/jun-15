import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        printSS(scn.nextLine(), "");
    }

    // Print Subsequence
    public static void printSS(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        String fstr = str.substring(1);
        printSS(fstr, ans + str.charAt(0));
        printSS(fstr, ans);
    }

    // Print Kpc
    static String[] keys = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void printKPC(String str, String asf) {
        if (str.length() == 0) {
            System.out.println(asf);
            return;
        }

        int index = str.charAt(0) - '0';
        String code = keys[index];

        String fstr = str.substring(1);
        for (int i = 0; i < code.length(); i++) {
            char ch = code.charAt(i);

            printKPC(fstr, asf + ch);
        }
    }

    // Print Maze Paths
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {

        if (sc == dc && sr == dr) {
            System.out.println(psf);
            return;
        }

        // h
        if (sc + 1 <= dc) {
            printMazePaths(sr, sc + 1, dr, dc, psf + "h");
        }

        // v
        if (sr + 1 <= dr) {
            printMazePaths(sr + 1, sc, dr, dc, psf + "v");
        }
    }

    // Print Maze Paths With Jumps
    public static void printMazePathsJumps(int sr, int sc, int dr, int dc, String psf) {
        if (sc == dc && sr == dr) {
            System.out.println(psf);
            return;
        }

        // h
        for (int jump = 1; sc + jump <= dc; jump++) {
            printMazePathsJumps(sr, sc + jump, dr, dc, psf + "h" + jump);
        }

        // v
        for (int jump = 1; sr + jump <= dr; jump++) {
            printMazePathsJumps(sr + jump, sc, dr, dc, psf + "v" + jump);
        }

        // d
        for (int jump = 1; sc + jump <= dc && sr + jump <= dr; jump++) {
            printMazePathsJumps(sr + jump, sc + jump, dr, dc, psf + "d" + jump);
        }
    }

}