import java.util.Scanner;
public class ejercicio6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] pacientes = new int[5];
        int temp = 0;
        for(int i = 0; i < pacientes.length; i++){
            System.out.print("Nivel de urgencia del paciente " + (i+1) + ": ");
            pacientes[i] = sc.nextInt();
        }
        System.out.print("\nOrden de llegada: [");
        for(int i = 0; i < pacientes.length; i++){
            System.out.print(pacientes[i]);
            System.out.print((i < pacientes.length-1) ? ", " : "]");
        }
        for(int i = 0; i < pacientes.length-1; i++){
            for(int j = 0; j < pacientes.length-1-i; j++){
                if(pacientes[j] < pacientes[j+1]){
                    temp       = pacientes[j];
                    pacientes[j]   = pacientes[j+1];
                    pacientes[j+1] = temp;
                }
            }
        }
        System.out.print("\nOrden de atención (Triage): [");
        for(int i = 0; i < pacientes.length; i++){
            System.out.print(pacientes[i]);
            System.out.print((i < pacientes.length-1) ? ", " : "]");
        }
    }
}