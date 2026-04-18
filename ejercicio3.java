import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];
        int[] cal = new int[5];
        String nombre = "";
        int calificacion = 0, alto = 0, bajo = 0, pB = 0, pA = 0;
        for(int i = 0; i < 5; i++){
            System.out.print("Nombre del alumno " + (i+1) + ": ");
            nombre = sc.next();
            System.out.print("Calificacion del alumno " + (i+1) + ": ");
            calificacion = sc.nextInt();
            names[i] = nombre;
            cal[i] = calificacion;
        }
        bajo = cal[0];
        alto = cal[0];
        for(int j = 0; j < 5; j++){
            if(bajo > cal[j]){
                bajo = cal[j];
                pB = j;
            }
            if(alto < cal[j]){
                alto = cal[j];
                pA = j;
            }
        }
        System.out.println("El alumno " + names[pA] + " obtuvo la calificación más alta con: " + alto);
        System.out.println("El alumno " + names[pB] + " obtuvo la calificación más baja con: " + bajo);
    }
}