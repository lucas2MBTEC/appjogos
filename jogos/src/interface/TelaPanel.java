package
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

 interface;
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

 
import java.awt.event.ActionListener;


public class TelaPanel extends JPanel implements ActionListener {
    private JPanel telas;
private  CardLayout controleTela;
JFrame janelas;


public TelaPanel(JPanel telas, JFrame janelas){
this.telas = telas;
this.controleTela = (CardLayout) telas.getLayout();
this.janelas = janelas;
this.setBackground(Color.decode("#202028"));


}
}
