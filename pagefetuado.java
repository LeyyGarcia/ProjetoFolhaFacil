import java.awt.*;
import java.net.URL;
import javax.swing.*;
import javax.swing.border.Border;

public class Main
{
    public static class Pagefetuado extends JFrame {

        Color azulFundo = new Color(227, 235, 238);
        Color botao = new Color(94, 119, 255);



        JTextArea t1 = new JTextArea ();
        JTextArea t2 = new JTextArea ();
        JTextArea t3 = new JTextArea ();
        JTextArea t4 = new JTextArea ();
        JTextArea t5 = new JTextArea ();
        JTextArea t6 = new JTextArea ();
        JTextArea t7 = new JTextArea ();
        JTextArea t8 = new JTextArea ();
        JTextArea t9 = new JTextArea ();
        JTextArea t10 = new JTextArea ();
        JTextArea t11 = new JTextArea ();
        JTextArea t12 = new JTextArea ();
        JTextArea t13 = new JTextArea ();

        JButton cancelar = new JButton("Cancelar");
        JButton voltar = new JButton("Voltar");

        public Pagefetuado() {

            JFrame jFrame = new JFrame("Cadastro");
            jFrame.setLayout(new FlowLayout());
            jFrame.setSize(1086, 680);
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame.getContentPane().setBackground(azulFundo);


            t1.setPreferredSize( new Dimension( 1086, 150 ) );

            t2.setPreferredSize( new Dimension( 450, 50 ) );

            t3.setPreferredSize( new Dimension( 200, 50 ) );
            t4.setPreferredSize( new Dimension( 200, 50 ) );
            t5.setPreferredSize( new Dimension( 200, 50 ) );

            t6.setPreferredSize( new Dimension( 450, 300 ) );
            t7.setPreferredSize( new Dimension( 200, 300 ) );
            t8.setPreferredSize( new Dimension( 200, 300 ) );
            t9.setPreferredSize( new Dimension( 200, 300 ) );


            t10.setPreferredSize( new Dimension( 655, 200 ) );
            t11.setPreferredSize( new Dimension( 400, 100 ) );
            t12.setPreferredSize( new Dimension( 200, 100 ) );
            t13.setPreferredSize( new Dimension( 200, 100 ) );


            voltar.setBackground(botao);
            voltar.setFont(Font.getFont(Font.SANS_SERIF));
            voltar.setForeground(Color.WHITE);
            voltar.setSize(500, 400);

            cancelar.setBackground(botao);
            cancelar.setFont(Font.getFont(Font.SANS_SERIF));
            cancelar.setForeground(Color.WHITE);
            cancelar.setSize(500, 400);


            Container pag = this.getContentPane();
            pag.setLayout(new FlowLayout(FlowLayout.LEFT));
            pag.add(voltar);
            pag.add(cancelar);
            pag.add(t1);pag.add(t2);pag.add(t3);
            pag.add(t4);pag.add(t5);pag.add(t6);
            pag.add(t7);pag.add(t8);pag.add(t9);
            pag.add(t10);pag.add(t11);

            Container pag2 = this.getContentPane();
            pag2.add(t12);
            pag2.add(t13);

            //JScrollPane seta = new JScrollPane(pag);

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
        cc.setTitle("Pagamento efetuado");
    }
}
