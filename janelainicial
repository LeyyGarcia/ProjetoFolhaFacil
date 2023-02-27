import java.awt.*;
import java.net.URL;
import javax.swing.*;
import javax.swing.border.Border;

public class Main {

    private static void createAndShowGUI() {

        // Aqui foi criada a tela e suas caracterísitcas
        Color azulFundo = new Color(227, 235, 238);
        Color botao = new Color(94, 119, 255);
        JFrame jFrame = new JFrame("Página Inicial");
        jFrame.setLayout(new FlowLayout());
        jFrame.setSize(1086, 680);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.getContentPane().setBackground(azulFundo);

        //Historia da empresa em String para ficar linha sob linha
        String texto = "Historia da empresa\n"
                + "Em fevereiro de 2023 um grupo composto de estudantes do Senai Anchieta foi formado com o objetivo de criar um sistema versátil e\n"
                + "que possibilitasse o cadastro de funcionários, juntamente à funcionalidade de cálculo dos impostos e o custo efetivo daquele ou\n"
                + "daqueles indivíduos à empresa de forma objetiva. Com a proposta de trazer uma interface amigável e novas utilidades, o sistema foi desenvolvido em Java,\n"
                + "utilizando a orientação a objetos. O recurso possibilitou a criação do sistema e posteriormente, a implementação de novos recursos úteis aos usuários,\n"
                + "trazendo um “design” limpo e dados distribuídos de forma simples e objetiva, visando a oferecer maior facilidade e clareza ao usuário final.\n";
        //Titulo do Menu
        String TpaginaUm = " Menu";

        //Atribuindo a String do Projeto ao JTEXT para editar
        JTextArea HistoriaProj = new JTextArea(texto);
        JLabel label = new JLabel();
        HistoriaProj.setPreferredSize(new Dimension(700, 600));
        HistoriaProj.setForeground(Color.black);
        HistoriaProj.setEditable(false);
        HistoriaProj.setLineWrap(true);
        HistoriaProj.setWrapStyleWord(true);
        HistoriaProj.setBackground(azulFundo);
        HistoriaProj.setFont(new Font("Courier", Font.ITALIC,20));
        HistoriaProj.setSelectionColor(Color.lightGray);
        HistoriaProj.setSelectedTextColor(Color.darkGray);


        //Attribuindo o titulo em um JTEXT também
        JTextArea TitulopaginaUm = new JTextArea(TpaginaUm);
        TitulopaginaUm.setForeground(botao);
        TitulopaginaUm.setEditable(false);
        TitulopaginaUm.setLineWrap(true);
        TitulopaginaUm.setWrapStyleWord(true);
        TitulopaginaUm.setBackground(Color.white);
        TitulopaginaUm.setPreferredSize(new Dimension(650, 50));
        TitulopaginaUm.setFont(new Font("Courier", Font.ITALIC,24));
        TitulopaginaUm.setSelectionColor(Color.lightGray);
        TitulopaginaUm.setSelectedTextColor(Color.darkGray);
        TitulopaginaUm.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 10));


        //Criando os botoes
        JButton Botao1Cadastro = new JButton("Cadastrar funcionário");
        JButton Botao2Pagamento = new JButton("Pagamento");
        JButton Botao3Relatorio = new JButton("Relatorio");
        JButton Botao4Sair = new JButton("Sair");

        //Setando caracteristicas dos botoes
        Botao1Cadastro.setBackground(botao);
        Botao1Cadastro.setFont(Font.getFont(Font.SANS_SERIF));
        Botao1Cadastro.setForeground(Color.WHITE);
        Botao1Cadastro.setSize(500, 400);

        Botao2Pagamento.setBackground(botao);
        Botao2Pagamento.setFont(Font.getFont(Font.SANS_SERIF));
        Botao2Pagamento.setForeground(Color.WHITE);
        Botao2Pagamento.setSize(500, 400);

        Botao3Relatorio.setBackground(botao);
        Botao3Relatorio.setFont(Font.getFont(Font.SANS_SERIF));
        Botao3Relatorio.setForeground(Color.WHITE);
        Botao3Relatorio.setSize(500, 400);

        Botao4Sair.setBackground(botao);
        Botao4Sair.setFont(Font.getFont(Font.SANS_SERIF));
        Botao4Sair.setForeground(Color.WHITE);
        Botao4Sair.setSize(500, 400);

        
        //definição de layout da historia do projeto
        JPanel painelprincipal = new JPanel((new GridLayout(0, 1, 1, 1)));
        painelprincipal.add(HistoriaProj, BorderLayout.NORTH);

        //adicionando os botoes em um Container e setando o design
        JPanel botoesesquerda = new JPanel(new GridLayout(0, 1, 0, 2));
        botoesesquerda.add(TitulopaginaUm, BorderLayout.CENTER);
        botoesesquerda.add(Botao1Cadastro);
        botoesesquerda.add(Botao2Pagamento);
        botoesesquerda.add(Botao3Relatorio);
        botoesesquerda.setBackground(Color.white);
        botoesesquerda.add(Botao4Sair, BorderLayout.SOUTH);
        botoesesquerda.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 10));

        Container tudo = jFrame.getContentPane();
        tudo.add(botoesesquerda);
        tudo.add(painelprincipal);


        botoesesquerda.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 1));
        painelprincipal.setLayout(new FlowLayout(FlowLayout.RIGHT, 2, 2));
        jFrame.add(label);
        jFrame.setVisible(true);
        jFrame.setLocationRelativeTo(null); // CENTRALIZA O JFRAME PARA SER EXIBIDO NO MEIO DA TELA
    }

    public static void main(String[] args) {
        createAndShowGUI();
    }
}
