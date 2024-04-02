//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.JOptionPane;
import models.Vehicle;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Vehicle veh = new Vehicle();

        veh.setFuel(Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de Litros de combústivel do veicúlo:")));
        veh.setDistance(Double.parseDouble(JOptionPane.showInputDialog("Digite a distância percorrida pelo veicúlo em Km:")));

        JOptionPane.showMessageDialog(null, "A distância percorrida por litros do seu veículo é " + veh.getCost());
    }
}