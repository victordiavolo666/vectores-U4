import java.util.Scanner;
public class nbE2{
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        double [] rLluvia = new double[7];
        double  cLluvia=0, suma=0, promedio=0;
        int conta=0;
        for (int i=0;i<rLluvia.length;i++){
            System.out.print("Ingresa la cantidad de lluvia del dia " + (i+1) + ": ");
            cLluvia=sc.nextDouble();
            rLluvia[i]=cLluvia;
            suma=suma+cLluvia;
        }
        promedio=suma/rLluvia.length;
        System.out.println("Suma total: " + suma + " mm");
        System.out.println("Promedio diario: " + promedio + " mm");
        
        for (int i=0;i<rLluvia.length;i++){
            conta=(rLluvia[i]>promedio) ? conta+1 : conta;
        }
        System.out.println("Dias que superaron el promedio: " + conta);
    }
}