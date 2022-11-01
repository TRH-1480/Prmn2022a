package lecture01;

public class Kadai14 {
    public static void main(String[] args) {
        int[] a = new int[100];
        int sum = 0;
        for(int i=0;i<=99;i++){
            a[i] = i+1;
            if(i%2==0){
                sum = sum + a[i];
            }
        }
        System.out.println(sum);
    }
}
