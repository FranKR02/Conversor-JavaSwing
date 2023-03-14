
/**
 *
 * @author FRANK
 */
public enum Divisas {
    USD(1.0),
    EUR(0.94),
    COP(4722);

    private final double valor;
    
    Divisas(double valor) {
        this.valor = valor;
    }

    public double getValor(){
        return this.valor;
    }
}
