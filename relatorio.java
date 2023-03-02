import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Main {
    private static void createAndShowGUI() {
        Color azulFundo = new Color(227, 235, 238);
        Color botao = new Color(94, 119, 255);

        JFrame framerelatorio = new JFrame(" Relatórios ");
        framerelatorio.setLayout(new FlowLayout());
        framerelatorio.setSize(850, 500);
        framerelatorio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framerelatorio.getContentPane().setBackground(azulFundo);
        framerelatorio.setResizable(false);
        framerelatorio.setLocationRelativeTo(null); // CENTRALIZA O JFRAME PARA SER EXIBIDO NO MEIO DA TELA

        JButton botao1cad = new JButton(" Cadastro ");
        JButton botao2pgto = new JButton(" Pagamento ");
        JButton botao3rela = new JButton(" Relatório ");
        JButton botao4volt = new JButton(" Voltar ");

        String titulo = " Relatório ";

        JTextArea relatoriotitulo = new JTextArea(titulo);
        relatoriotitulo.setForeground(Color.black);
        relatoriotitulo.setPreferredSize(new Dimension(600, 100));
        relatoriotitulo.setEditable(false);
        relatoriotitulo.setLineWrap(true);
        relatoriotitulo.setWrapStyleWord(true);
        relatoriotitulo.setBackground(azulFundo);
        relatoriotitulo.setFont(new Font("Courier", Font.ITALIC,20));
        relatoriotitulo.setSelectionColor(Color.lightGray);
        relatoriotitulo.setSelectedTextColor(Color.darkGray);

        JPanel paineltitulo = new JPanel(new GridLayout(1, 0, 1, 0));
        paineltitulo.add(relatoriotitulo);

        JTextArea txtrelatorio = new JTextArea();
        txtrelatorio.setForeground(Color.black);
        txtrelatorio.setLineWrap(true);
        txtrelatorio.setEditable(false);
        txtrelatorio.setPreferredSize(new Dimension(170, 255));

        botao1cad.setBackground(botao);
        botao1cad.setFont(Font.getFont(Font.SANS_SERIF));
        botao1cad.setForeground(Color.WHITE);
        botao1cad.setSize(500, 400);

        // atribuição das características dos botões
        botao2pgto.setBackground(botao);
        botao2pgto.setFont(Font.getFont(Font.SANS_SERIF));
        botao2pgto.setForeground(Color.WHITE);
        botao2pgto.setSize(500, 400);

        // atribuição das características dos botões
        botao3rela.setBackground(botao);
        botao3rela.setFont(Font.getFont(Font.SANS_SERIF));
        botao3rela.setForeground(Color.WHITE);
        botao3rela.setSize(500, 400);

        // atribuição das características dos botões
        botao4volt.setBackground(botao);
        botao4volt.setFont(Font.getFont(Font.SANS_SERIF));
        botao4volt.setForeground(Color.WHITE);
        botao4volt.setSize(600, 400);

        JPanel painelbotoes = new JPanel(new GridLayout(0, 1, 5, 10));
        painelbotoes.add(botao4volt);
        painelbotoes.add(botao1cad);
        painelbotoes.add(botao2pgto);
        painelbotoes.add(botao3rela);

      //JPanel painelrelatorio = new JPanel((new GridLayout(1, 1, 1, 1)));
       // painelrelatorio.add(txtrelatorio, BorderFactory.createEmptyBorder(10, 20, 10, 10));

        framerelatorio.add(relatoriotitulo);
       // framerelatorio.add(painelrelatorio);
        framerelatorio.add(painelbotoes);


        framerelatorio.setVisible(true);
    }

    public static void main(String[] args) {
        createAndShowGUI();
    }
}
