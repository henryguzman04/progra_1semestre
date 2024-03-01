import java.util.Scanner;

public class descuentos {
    public static void main(String[] args) {
        Scanner he =new Scanner(System.in);
        float ct,de,pf;
        System.out.println("costo del traje");
        ct=he.nextFloat();
        if(ct>2500){
            de=ct*0.15f;
        }else{
            de=ct*0.08f;
        }
        System.out.println("el precio final del traje es : "+de);
    }
}
