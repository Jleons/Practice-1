import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner lectura= new Scanner(System.in);
        System.out.println("Ingrese numero");
        int numero = lectura.nextInt();
        System.out.println("Clave");
        int clave= lectura.nextInt();
        System.out.println("dueno");
        String dueno= lectura.next();
        double saldo= lectura.nextDouble();
        
        
        Cuenta c2= new Cuenta(numero, clave, dueno, saldo);
        
        
       
        
        
        
    }
    }
    

