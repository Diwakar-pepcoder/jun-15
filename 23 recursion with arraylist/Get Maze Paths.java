import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> list = getMazePaths(1,1, n, m);
        System.out.println(list);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        
        if(sr == dr && sc == dc){
            ArrayList<String> paths = new ArrayList<>();
            paths.add("");
            return paths;
        }
        
        ArrayList<String> paths = new ArrayList<>();
        
        if(sc+1 <= dc){
            ArrayList<String> faith = getMazePaths(sr, sc+1, dr, dc);
            for(String s: faith){
                paths.add("h"+s);
            }
        }
        
        if(sr+1 <= dr){
            ArrayList<String> faith = getMazePaths(sr+1, sc, dr, dc);
            for(String s: faith){
                paths.add("v"+s);
            }
        }
        
        return paths;
    }

}