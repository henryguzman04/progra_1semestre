import java.util.Scanner;

public class VENTAS_DE_UVA {
    public static void main(String[] args) {
        Scanner he =new Scanner(System.in);
        Scanner he2 =new Scanner(System.in);

        String tip;
        int tam ,kg;
        float p,ga;
        System.out.println("ingrese la cantidad en kilos de la uva ");
        kg= he2.nextInt();
        System.out.println(" ingrese el tipo de uva a/b ");
        tip=he.nextLine();
        if(tip.equals("a")){
            System.out.println("ingrese el tamaño de la uva 1 / 2");
            tam=he.nextInt();
            if(tam==1){
                p=20;
            }else {
                p=30;
            }
        }else {
            System.out.println("ingrese el tamaño de la uva 1 / 2");
            tam=he.nextInt();
            if(tam==1){
               p=30;
            }else{
                p=50;
            }
        }
        ga=p*kg;
        System.out.println("la ganancia total de la uva es: "+ga);
        
    }
}
