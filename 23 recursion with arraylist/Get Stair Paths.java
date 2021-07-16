import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        ArrayList<String> list = getStairPaths(n);
        System.out.println(list);
    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n==0){
            ArrayList<String> ans = new ArrayList<String>();
            ans.add("");
            return ans;
        }
        
        ArrayList<String> ans = new ArrayList<String>();
        if(n-1 >= 0){
            ArrayList<String> one = getStairPaths(n-1);
            for(String s: one){
                ans.add("1"+s);
            }
        }
        
        if(n-2 >= 0){
            ArrayList<String> two = getStairPaths(n-2);
            for(String s: two){
                ans.add(2+s);
            }
        }
        
        if(n-3>=0){
            ArrayList<String> three = getStairPaths(n-3);
            for(String s: three){
                ans.add(3+s);
            }
        }
        
        return ans;
    }
}