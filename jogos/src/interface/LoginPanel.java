package
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

 interface;

public class LoginPanel extends  TelaPanel {
private JButton botaoLogin;
    public LoginPanel(JPanel telas, JFrame janela){
        JLabel mensagem = new JLabel("conteudo de Login Panel ");
JLabel botao = new JButton("Fazer login");
botao.addActionListener(this);
this.add(mensagem);
this.add(botao);




    }

    public void executarBotao(ActionEvent e){
        trocaTela("Tela Principal");



    }
}
