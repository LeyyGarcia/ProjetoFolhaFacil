import java.awt.*;
import javax.swing.*;

public class relatorio {
    public void telrelatorio()
    {
        Color azulFundo = new Color(227, 235, 238);
        Color botao = new Color(94, 119, 255);

        JFrame jFrame = new JFrame(" Relatórios: ");
        jFrame.setLayout(new FlowLayout());
        jFrame.setSize(1086, 680);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.getContentPane().setBackground(azulFundo);

        JButton Botao1Cadastro = new JButton(" Cadastro ");
        JButton Botao2Pagamento = new JButton(" Pagamento ");

        Botao1Cadastro.setBackground(botao);
        Botao1Cadastro.setFont(Font.getFont(Font.SANS_SERIF));
        Botao1Cadastro.setForeground(Color.WHITE);
        Botao1Cadastro.setSize(200, 100);

        Botao2Pagamento.setBackground(botao);
        Botao2Pagamento.setFont(Font.getFont(Font.SANS_SERIF));
        Botao2Pagamento.setForeground(Color.WHITE);
        Botao2Pagamento.setSize(200, 100);

        String titulo = " Relatório recente:";
        String textorela = " ";

        JTextArea relatorioexibir = new JTextArea(titulo);
        relatorioexibir.setForeground(Color.black);
        relatorioexibir.setPreferredSize(new Dimension(1086, 50));
        relatorioexibir.setEditable(false);
        relatorioexibir.setLineWrap(true);
        relatorioexibir.setWrapStyleWord(true);
        relatorioexibir.setBackground(azulFundo);
        relatorioexibir.setFont(new Font("Courier", Font.ITALIC,20));
        relatorioexibir.setSelectionColor(Color.lightGray);
        relatorioexibir.setSelectedTextColor(Color.darkGray);

        JPanel botoes =  new JPanel(new GridLayout(0, 1, 0, 2));
        botoes.add(Botao1Cadastro);
        botoes.add(Botao2Pagamento);

        JPanel painelrelatorio = new JPanel((new GridLayout(1, 0, 2, 0)));
        painelrelatorio.add(relatorioexibir);

        /* public void telrelatorio()
        {

            JFrame jFrame = new JFrame(" Relatórios: ");
            jFrame.setLayout(new FlowLayout());
            jFrame.setSize(1086, 680);
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame.getContentPane().setBackground(azulFundo);
        } */
}

    public static void main(String[] args)
    {
        //relatorioempresa.relatorio cc = new relatorioempresa.relatorio();
    }

}
