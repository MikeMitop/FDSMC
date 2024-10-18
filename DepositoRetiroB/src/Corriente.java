public abstract class Corriente extends Cuenta {
    private int sobreGiro;

    public Corriente(int numeroCuenta, String titular, int saldo, int sobreGiro) {
        super(numeroCuenta, titular, saldo);
        this.sobreGiro = sobreGiro;
    }

    public void deposito(int valor) {
        this.saldo += valor;
    }

    public void retiro(int valor) {
        if (valor <= (this.saldo + this.sobreGiro)) {
            this.saldo -= valor;
        } else {
            System.out.println("Monto de retiro excede el limite.");
        }
    }

    public String toString() {
        return "Cuenta = " + numeroCuenta + ", titular = " + titular + ", saldo = " + saldo + ", sobreGiro = " + sobreGiro;
    }
}
