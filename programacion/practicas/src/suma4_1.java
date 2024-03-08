import java.util.Scanner;

public class suma4_1 {
    public static void main(String[] args) {
        Scanner he = new Scanner(System.in);
        int cont=1;
        float val_sum=1,sum_val=0;

        while (cont<=10){
           sum_val=sum_val+val_sum;
           cont++;
            System.out.println(sum_val);
        }
        System.out.println("suma de valores es : "+sum_val);
    }
}
