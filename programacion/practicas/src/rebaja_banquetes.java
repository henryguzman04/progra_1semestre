import java.util.Scanner;

public class rebaja_banquetes {
    public static void main(String[] args) {
        Scanner he =new Scanner(System.in);
        int np;
        float tot;
        System.out.println("introduce el numero de personas");
        np=he.nextInt();
        if(np>300){
            tot=np*75;
        }else{
            if(np>200){
                tot=np*85;
            }else{
                tot=np*95;
            }
        }
        System.out.println("el total a pagar es: "+tot);
    }
}
