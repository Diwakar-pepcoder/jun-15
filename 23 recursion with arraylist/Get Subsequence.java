import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);
        
        String str = scn.nextLine();
        ArrayList<String> list = gss(str);
        System.out.println(list);
    }

    public static ArrayList<String> gss(String str) {
        if(str.length() == 0){
            ArrayList<String> myAns = new ArrayList<String>();
            myAns.add("");
            return myAns;
        }
        
        String fstr = str.substring(1);
        ArrayList<String> fans = gss(fstr);
        
        ArrayList<String> myAns = new ArrayList<String>();
        
        for(String s: fans){
            myAns.add(s);
        }
        
        char ch = str.charAt(0);
        for(String s: fans){
            myAns.add(ch+s);
        }
        
        return myAns;
    }

}