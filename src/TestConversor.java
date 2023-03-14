
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author FRANK
 */
public class TestConversor {

    public static void main(String[] args) {
        int res = 0;
        do {
            interfaz();
            res = JOptionPane.showConfirmDialog(
                    null,
                    "¿Quieres continuar?",
                    "Confirm",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE
            );
        } while (res == JOptionPane.YES_OPTION);

        System.exit(0);

    }

    static void interfaz() {
        String[] conversor = {"Moneda", "Temperatura"};
        Object opcion = JOptionPane.showInputDialog(null, "Selecciona una opción", "Conversor", 0, null, conversor, conversor[0]);
        if (opcion.equals("Moneda")) {
            String[] monedas = {"Peso", "Dolar", "Euro"};
            //Escoge la moneda actual
            int moneda = JOptionPane.showOptionDialog(null, "Escoge la moneda que vas a convertir", "", 0, 0, null, monedas, monedas[0]);
            double valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor", null));
            System.out.println(monedas[moneda]);
            int cambio = JOptionPane.showOptionDialog(null, "Elija la divisa", "", 0, 0, null, monedas, monedas[0]);
            Moneda m = new Moneda(valor, monedas[moneda]);
            Controller c = new Controller(m);
            switch (cambio) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Elvalor es: " + m.toPeso());
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Elvalor es: " + m.getValor());
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Elvalor es: " + m.toEuro());
                    break;
            }

        }
    }

}
