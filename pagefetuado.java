import java.awt.*;
import java.net.URL;
import javax.swing.*;
import javax.swing.border.Border;

public class Main
{
    public static class Pagefetuado extends JFrame {

        //Criação de cores
        Color azulFundo = new Color(227, 235, 238);
        Color botao = new Color(94, 119, 255);
        Color fundobranco = new Color (255,255,255);


        //Criação dos campos de texto e seus conteúdos
        JTextArea t1Area = new JTextArea ("Empresa FolhaFacil\n" +
                //Os dados a baixo devem ser preenchidos com as informações do cadastro dos funcionários******
                "Nome:_______________________"+
                "Cargo:______________________\n"+
                "E-mail:_____________________\n");
        JTextArea t2Area = new JTextArea ("Descrição");
        JTextArea t3Area = new JTextArea ("Referencia");
        JTextArea t4Area = new JTextArea ("Vencimento");
        JTextArea t5Area = new JTextArea ("Desconto");
        JTextArea t6Area = new JTextArea ("\n"
                +"Salário\n"
                +"\n"
                +"INSS\n"
                +"\n"
                +"IRFF S. Salário\n"
                +"\n"
                +"Calculo de hora extra\n");
        JTextArea t7Area = new JTextArea ("\n"
                +"30d\n"
                +"\n"
                +"11,00%\n"
                +"\n"
                +"7,50%\n"
                +"\n"
                +"12 horas\n");
        //No primeiro campo insira o salario que foi designado para o funcionario e no ultimo o valor ja calculado das horas
        //que o funcionario tem a receber
        JTextArea t8Area = new JTextArea ("\n"
                +"_____________\n"
                +"\n"
                +"\n"
                +"\n"
                +"\n"
                +"\n"
                +"______________");
        //Np primeiro campo deve ser armazendado o valor do desconto do inss, e no segundo o valor do desconto do IRFF
        JTextArea t9Area = new JTextArea ("\n"
                +"\n"
                +"\n"
                +"_____________\n"
                +"\n"
                +"_____________\n");
        //Nesse campo, valor liquido deve ficar a quantidade de dinheiro que o funcionario vai receber , ja tendo feito todos os calculos
        JTextArea t10Area = new JTextArea ("\n"
                +"Vallor líquido:_________");

        //Aqui deve ser inserido a soma do salario com as horas extras
        JTextArea t11Area = new JTextArea ("\n"
                +"Total de vencimento:_________");
        //Aqui deve ser inserido a soma do inss e do IRFF
        JTextArea t12Area = new JTextArea ("\n"
                +"Total de descontos:_________");



        JTextArea divArea = new JTextArea();


        JButton cancelar = new JButton("Cancelar");
        JButton voltar = new JButton("Voltar");

        public Pagefetuado() {

            JFrame jFrame = new JFrame("Cadastro");
            jFrame.setLayout(new FlowLayout());
            jFrame.setSize(1086, 680);
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame.getContentPane().setBackground(fundobranco);


            String titulo = "Pagamento efetuado";

            JTextArea tituloArea = new JTextArea(titulo);
            JLabel label = new JLabel();
            tituloArea.setWrapStyleWord(true);
            tituloArea.setFont(new Font("Courier", Font.ITALIC,20));
            tituloArea.setPreferredSize( new Dimension( 625, 60 ) );
            tituloArea.setEditable(false);

            String vv = "  ";

            JTextArea vvv = new JTextArea(vv);
            vvv.setForeground(Color.black);
            vvv.setPreferredSize(new Dimension(240, 60));
            vvv.setEditable(false);
            vvv.setLineWrap(true);
            vvv.setWrapStyleWord(true);
            vvv.setBackground(Color.white);




            t1Area.setPreferredSize( new Dimension( 1086, 60 ) );
            t1Area.setBackground(azulFundo);
            t1Area.setFont(new Font("Courier", Font.ITALIC,15));
            t1Area.setEditable(false);

            t2Area.setPreferredSize( new Dimension( 450, 20 ) );
            t2Area.setBackground(azulFundo);
            t2Area.setEditable(false);

            t3Area.setPreferredSize( new Dimension( 200, 20 ) );
            t3Area.setBackground(azulFundo);
            t3Area.setEditable(false);

            t4Area.setPreferredSize( new Dimension( 200, 20 ) );
            t4Area.setBackground(azulFundo);
            t4Area.setEditable(false);

            t5Area.setPreferredSize( new Dimension( 200, 20 ) );
            t5Area.setBackground(azulFundo);
            t5Area.setEditable(false);

            t6Area.setPreferredSize( new Dimension( 450, 130 ) );
            t6Area.setBackground(azulFundo);
            t6Area.setEditable(false);

            t7Area.setPreferredSize( new Dimension( 200, 130 ) );
            t7Area.setBackground(azulFundo);
            t7Area.setEditable(false);

            t8Area.setPreferredSize( new Dimension( 200, 130 ) );
            t8Area.setBackground(azulFundo);
            t8Area.setEditable(false);

            t9Area.setPreferredSize( new Dimension( 200, 130 ) );
            t9Area.setBackground(azulFundo);
            t9Area.setEditable(false);


            t10Area.setPreferredSize( new Dimension( 655, 50 ) );
            t10Area.setBackground(azulFundo);
            t10Area.setEditable(false);

            t11Area.setPreferredSize( new Dimension( 200, 50 ) );
            t11Area.setBackground(azulFundo);
            t11Area.setEditable(false);

            t12Area.setPreferredSize( new Dimension( 200, 50 ) );
            t12Area.setBackground(azulFundo);
            t12Area.setEditable(false);


            voltar.setBackground(botao);
            voltar.setFont(Font.getFont(Font.SANS_SERIF));
            voltar.setForeground(Color.WHITE);
            voltar.setSize(400, 300);

            cancelar.setBackground(botao);
            cancelar.setFont(Font.getFont(Font.SANS_SERIF));
            cancelar.setForeground(Color.WHITE);
            cancelar.setSize(400, 300);

            divArea.setPreferredSize(new Dimension(1086,5));
            divArea.setBackground(Color.white);
            divArea.setEditable(false);

            JPanel botoes = new JPanel();
            botoes.setBackground(Color.white);
            botoes.setPreferredSize(new Dimension(1086,60));
            botoes.add(voltar);botoes.add(vvv);botoes.add(tituloArea);
            botoes.add(cancelar);

            Container pag = this.getContentPane();
            pag.setLayout(new FlowLayout(FlowLayout.LEFT));
            pag.add(botoes);
            pag.add(t1Area);pag.add(t2Area);pag.add(t3Area);
            pag.add(t4Area);pag.add(t5Area);pag.add(t6Area);
            pag.add(t7Area);pag.add(t8Area);pag.add(t9Area);
            pag.add(t10Area);pag.add(t11Area);pag.add(t12Area);pag.add(divArea);

            this.setSize(1086,700);
            this.setBackground(Color.white);
            this.setVisible(true);
            this.setResizable(false);
            this.setLocationRelativeTo(null);
            this.setTitle("Pagamento efetuado");
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
    public static void main(String[] args)
    {
        Pagefetuado cc = new Pagefetuado();
    }
}
