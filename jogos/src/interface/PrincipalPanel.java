package
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

 interface;

public class PrincipalPanel  extends TelaPanel{
    public PrincipalPanel(JPanel telas, JFrame janela){
super(telas,janela);
JLabel mensagem = new JLabel("conteúdo de pricipal panel");
JButton botao= new JButton("voltar");
botao.addActionListener(this);
this.add(botao);
this.add(mensagem);




    }
public void executarBotao(ActionEvent e ){
    trocaTela("Tela Login");
}



}
