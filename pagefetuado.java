import java.awt.*;
import java.net.URL;
import javax.swing.*;
import javax.swing.border.Border;

public class Main
{

    public static class Pagefetuado extends JFrame
    {

        Color azulFundo = new Color(227, 235, 238);
        Color botao = new Color(94, 119, 255);

        JButton voltar = new JButton("<--");

        public Pagefetuado()
        {

            JFrame jFrame = new JFrame("Cadastro");
            jFrame.setLayout(new FlowLayout());
            jFrame.setSize(1086, 680);
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame.getContentPane().setBackground(Color.white);

            voltar.setBackground(Color.white);
            voltar.setForeground(Color.black);
            voltar.setSize(500, 400);


            Container pagamento = this.getContentPane();
            pagamento.add(voltar);

            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setSize(1086,700);
            this.setVisible(true);
            this.setResizable(false);
            this.setLocationRelativeTo(null);


        }
    }

    public static void main(String[] args)
    {
        Pagefetuado cc = new Pagefetuado();
        cc.setTitle("Pagamento Efetuado");
    }

}
