import java.util.Scanner;
public class nbE1 {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
        int [] sca = {1024,2048,4096,8192,16384};
    System.out.println("Ingresa el código de acceso:");
    int cod=sc.nextInt();
    for(int i=0;i<sca.length;i++){
        if(cod==sca[i]){
            System.out.print("[ACCESO CONCEDIDO] Bienvenido al Site");
    } else{
    System.out.print("[ALERTA] Acceso denegado. Personal no autorizado ");
    }    
}    
}
    }