
/**
 *
 * @author FRANK
 */
public class Controller {

    //El valor en dolares
    private double base;
    private final Moneda moneda;
    
    
    public Controller(Moneda moneda) {
        this.moneda = moneda;
        this.getBase();
    }

    private void getBase() {
        String tipo = this.moneda.getTipo();
        switch (tipo ) {
            case "Dolar" -> {
                this.base = moneda.getValor();
            }
            case "Euro" -> {
                this.base =  moneda.getValor()/Divisas.EUR.getValor();
            }
            case "Peso" -> {
                this.base = moneda.getValor()/Divisas.COP.getValor();
            }
        }
        this.moneda.setValor(this.base);
        this.moneda.setTipo("Dolar");
    }
    
}
