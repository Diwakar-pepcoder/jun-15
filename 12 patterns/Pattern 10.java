import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        
        int space = n/2;
        int star = 1;
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=star;j++){
                if(j==1 || j==star){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
            
            if(i<=n/2){
                space--;
                star = star+2;
            }else{
                space++;
                star = star-2;
            }
        }

    }
}