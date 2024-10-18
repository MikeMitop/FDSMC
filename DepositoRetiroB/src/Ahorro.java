public class Ahorro extends Cuenta {
    private double interes;

    public Ahorro(int numeroCuenta, String titular) {
        super(numeroCuenta, titular, 0);
        this.interes = 0.03;
    }

public void deposito(int valor) {
    saldo+=valor;
    saldo+=valor*interes;
}

public void retiro(int valor) {

    if(valor <= saldo){
        saldo-=valor;
       }else{
        System.out.println("Los fondos NO son suficientes ");
       }

    }

}
