import java.util.Scanner;

public class area_rectangulo {
    public static void main(String[] args) {
        Scanner he =new Scanner(System.in);
        float A,B,Area;
        System.out.println("intruduce la altura : ");
        A= he.nextFloat();
        System.out.println("intruduce la base : ");
        B= he.nextFloat();
        Area =B*A;
        System.out.println("el area del triangulo es: "+Area );
    }
}
