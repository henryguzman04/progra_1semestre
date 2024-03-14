import java.util.Scanner;

public class escuela5_4 {
    public static void main(String[] args) {
        Scanner he =new Scanner(System.in);
        Scanner he2 =new Scanner(System.in);
        int cont=0,num=0;
        String name;
        System.out.println("ingrese la cantidad de alumnos");
        num=he.nextInt();
        float promedio[]=new float[num];
        String nombres[]=new String[num];

        for (int j=0;j<num;j++){
            System.out.println("ingrese un nombre");
            nombres[j]= he2.nextLine();
            System.out.println("ingrese el promedio general");
            promedio[j]=he.nextFloat();
        }

        for (int j=0;j<num;j++){
            for (int i =j+1; i <num ; i++) {
                if(promedio[j]<promedio[i]){
                    name=nombres[j];
                    cont= (int) promedio[j];
                    nombres[j]=nombres[i];
                    promedio[j]=promedio[i];
                    nombres[i]=name;
                    promedio[i]=cont;
                }
            }
        }

        for (int j=0;j<num;j++){
            System.out.println(nombres[j]+"........."+promedio[j]);



        }




    }
}
