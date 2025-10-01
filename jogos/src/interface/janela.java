package
import javax.swing.JPanel;

 interface;

import java.awt.CardLayout;

 
import javax.swing.JFrame;

 
public class janela extends JFrame {
    public janela(){
this.setBounds(0,0,1920,1080);
CardLayout controletela = new CardLayout();
JPanel telas = new JPanel(controletela);
LoginPanel LoginPanel = new LoginPanel(telas, this);
PrincipalPanel PrincipalPanel = new PrincipalPanel(telas, this);


    }
}
