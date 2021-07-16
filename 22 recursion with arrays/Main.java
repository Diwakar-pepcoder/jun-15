import java.io.*;
import java.util.*;

public class Main {

    public static void displayArr() throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        displayArr(arr, 0);
    }

    public static void displayArr(int[] arr, int idx){
        if(idx == arr.length)return;
        System.out.println(arr[idx]);
        displayArr(arr, idx+1);
    }

    public static void maxOfArray() throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        int max = maxOfArray(arr, 0);
        System.out.println(max);
    }

    public static int maxOfArray(int[] arr, int idx){
        if(idx == arr.length-1)return arr[idx];
        
        int fmax = maxOfArray(arr, idx+1);
        int max = Math.max(fmax, arr[idx]);
        return max;
    }

    public static void lastIndex() throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int idx = lastIndex(arr, 0, x);
        System.out.println(idx);
    }

    public static int lastIndex(int[] arr, int idx, int x){
        if(idx == arr.length)return -1;
        
        int findex = lastIndex(arr, idx+1, x);
        if(findex != -1){
            return findex;
        }else{
            if(arr[idx] == x){
                return idx;
            }else{
                return -1;
            }
        }
    }

    public static void allIndices() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int x = Integer.parseInt(br.readLine());
        int[] iarr = allIndices(arr, x, 0, 0);

        if(iarr.length == 0){
            System.out.println();
            return;
        }

        for(int i = 0; i < iarr.length; i++){
            System.out.println(iarr[i]);
        }
    }

    public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
        if(idx == arr.length){
            int ar[] = new int[fsf];
            return ar;
        }
        
        if(arr[idx] == x){
            int ar[] = allIndices(arr, x, idx+1, fsf+1);
            ar[fsf] = idx;
            return ar;
        }else{
            int ar[] = allIndices(arr, x, idx+1, fsf);
            return ar;
        }
        
    }

}