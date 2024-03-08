import java.util.Scanner;

public class paqueteria3_14 {
    public static void main(String[] args) {
        Scanner he = new Scanner(System.in);
        int grms, num_zn,cost;
        System.out.println("ingrese el numero de zona al cual desea enviar\namerica del norte(1)\namerica central(2)\namerica del sur(3)\neuropa(4)\nasia(5)");
        num_zn= he.nextInt();
        System.out.println("ingrese el peso en gramos que desea enviar : ");
        grms= he.nextInt();
        if(grms>=5000){
            System.out.println("NO SE DA EL SERVICIO");
        }else{
            switch (num_zn){
                case 1:
                 cost=grms*11;
                    System.out.println("el costo del servicion es : "+cost);
                 break;
                 case 2:
                     cost=grms*10;
                     System.out.println("el costo del servicio es : "+cost);
                     break;
                case 3:
                    cost=grms*12;
                    System.out.println("el costo del servicio es : "+cost);
                    break;
                case 4:
                    cost=grms*24;
                    System.out.println("el costo del servicio es : "+cost);
                    break;
                case 5:
                    cost=grms*27;
                    System.out.println("el costo del servicio es : "+cost);
                    break;
                default:
                    System.out.println("el numero de zona que usted eligio no existe\n vuelva a intentarlo......\ngracias😃");
            }





        }

    }
}
