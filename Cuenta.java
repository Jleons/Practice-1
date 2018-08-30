
 public class Cuenta {
    
    private int numero;
    private int clave;
    private String dueno;
    private double saldo;
    public static int numCuenta;
    
 
    public Cuenta(int numero, int clave, String dueno, double saldo){
            this.numero=numero;
            this.clave=clave;
            this.dueno=dueno;
            this.saldo= saldo;
    
}
     public boolean consignar (double valor){
        return false;
        
    }
    
    public boolean retirar (double valor){
        if (valor > 0 && valor<= this.saldo){
            this.saldo-=valor;
            return true;
        }
        return false;
    }

    public int getNumero() {
        return numero;
    }

    public int getClave() {
        return clave;
    }

    public String getDueno() {
        return dueno;
    }

    public double getSaldo() {
        return saldo;
    }

    public static int getNumCuenta() {
        return numCuenta;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static void setNumCuenta(int numCuenta) {
        Cuenta.numCuenta = numCuenta;
    }
    

 }