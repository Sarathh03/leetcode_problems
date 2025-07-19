import java.util.*;
class Demo{
    public static void main(String[] args) {
        System.err.println("enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        int mid =0;
        System.out.println("eneter the element of the array");
        for(int i =0;i<n;i++){
            num[i]= sc.nextInt();
            

        }
        mid = num[n/2];
        System.out.println("middle element of the array is"+mid);
        sc.close();
    }
}