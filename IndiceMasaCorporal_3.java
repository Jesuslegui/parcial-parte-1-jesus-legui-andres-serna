import javax.swing.JOptionPane;
import java.awt.Desktop;
import java.net.URI;

public class IndiceMasaCorporal_3 {
    public static void main(String[] args) {
        String pesoStr = JOptionPane.showInputDialog("Ingrese su peso en kilogramos:");
        String alturaStr = JOptionPane.showInputDialog("Ingrese su altura en metros como 1.20:");

        double peso = Double.parseDouble(pesoStr);
        double altura = Double.parseDouble(alturaStr);

        double imc = peso /(altura*altura);

        String mensaje;

        if (imc < 16) {
            mensaje = "Delgadez severa";
        } else if (imc < 17) {
            mensaje = "Delgadez moderada";
        } else if (imc < 18.5) {
            mensaje = "Delgadez leve";
        } else if (imc < 25) {
            mensaje = "Peso normal";
        } else if (imc < 30) {
            mensaje = "Sobrepeso";
        } else if (imc < 35) {
            mensaje = "Obesidad leve";
        } else if (imc < 40) {
            mensaje = "Obesidad moderada";
        } else {
            mensaje = "Obesidad mórbida\nPara más información, puedes ver este video:";
            
            String videoUrl = "https://www.youtube.com/watch?v=m2wpyNBWRLwQ";
            mostrarVideo(videoUrl);
        }

        JOptionPane.showMessageDialog(null, "Su IMC es: " + imc + "\n" + mensaje);
    }

   
    private static void mostrarVideo(String videoUrl) {
        try {
           
            Desktop.getDesktop().browse(new URI(videoUrl));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo abrir el video.");
 }
}
}