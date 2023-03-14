
/**
 *
 * @author FRANK
 */
public class Moneda {

    private double valor;
    private String tipo;

    public Moneda(double valor, String tipo) {
        this.valor = valor;
        this.tipo = tipo;
    }

    public double getValor() {
        System.out.println(valor);
        return Math.round(valor * 1000000.0) / 1000000.0;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double toEuro() {
        this.setTipo("Euro");
        this.setValor(Math.round((this.valor * Divisas.EUR.getValor()) * 10000.0) / 10000.0);
        return this.getValor();
    }

    public double toPeso() {
        this.setTipo("Peso");
        this.setValor(Math.round((this.valor * Divisas.COP.getValor()) * 10000.0) / 10000.0);
        return this.getValor();
    }

    @Override
    public String toString() {
        return "Moneda{" + "valor=" + valor + ", tipo=" + tipo + '}';
    }

}
