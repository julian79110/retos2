import java.util.*;
public class reto1 {
    public static void main(String[] args) {
        int[] notas=new int[3];
        float resultado;
        Scanner datos=new Scanner(System.in);

        System.out.println("Ingrese la primera nota:");
        notas[0]=datos.nextInt();

        System.out.println("Ingrese la segunda nota:");
        notas[1]=datos.nextInt();

        System.out.println("Ingrese la tercera nota:");
        notas[2]=datos.nextInt();

        

     

        resultado=(notas[0]+notas[1]+notas[2])/3;

        System.out.println("El promedio de las notas es:"+resultado);

        if (resultado<3.0) {
            System.out.println("Reprobaste la competencia");
        }
        else if (resultado>3.0 && resultado<4.0) {
            System.out.println("Pasaste raspando la competencia");
        }
        else if (resultado>4.0) {
            System.out.println("Aprobaste con buenos resultados la competencia");
        }
        datos.close();
    }
}