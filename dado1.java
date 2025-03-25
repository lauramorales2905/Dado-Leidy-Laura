import java.security.SecureRandom;
import java.util.Scanner;

public class dado1{
  public static void main(String[] args){
    //Creamos la instancia para generar los números random
    SecureRandom random = new SecureRandom();
    
    //Creamos el arreglo para almacenar la frecuencia de cada cara del dado
    int[] frecuenciaCaras = new int[6];
    
    //Pedimos al usuario el número de lanzamientos
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese el número de lanzamientos por favor muchachon: ");
    int numLanzamientos = scanner.nextInt();

    //Lanzamientos
    for (int i=0; i< numLanzamientos; i++){
      //Número aleatorio 1 y 6
      int cara = random.nextInt(6) + 1;

      //Contador
      switch (cara){
        case 1:
         frecuenciaCaras[0]++;
         break;
        case 2:
         frecuenciaCaras[1]++;
         break;
        case 3:
         frecuenciaCaras[2]++;
         break;
        case 4:
         frecuenciaCaras[3]++;
         break;
        case 5:
         frecuenciaCaras[4]++;
         break;
        case 6:
         frecuenciaCaras[5]++;
         break;
      }
      }
     // Mostrar los resultados en una tabla
         System.out.println("Cara   Frecuencia");
         for (int i = 0; i < frecuenciaCaras.length; i++) {
             System.out.printf("%-6d %d%n", (i + 1), frecuenciaCaras[i]);
         }
  }
}
