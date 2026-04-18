import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] cajas = new String[6];
        for(int i = 0; i < cajas.length; i++){
            System.out.print("Escanea el número de serie de la caja " + (i+1) + ": ");
            cajas[i] = sc.next();
        }
        System.out.println("\n--- HOJA DE EMBARQUE ---");
        for(int i = cajas.length-1; i >= 0; i--){
            System.out.println("Caja " + (i+1) + ": " + cajas[i]);
        }
    }
}
