import java.awt.*;
import javax.swing.*;

public class Pagamento {
    public void createAndShowGUI(){
        // definição das cores do fundo e do botão
        Color azulFundo = new Color(227, 235, 238);
        Color botao = new Color(94, 119, 255);

        // definições do Jframe
        JFrame jframepagamentos = new JFrame(" Pagamento ");
        jframepagamentos.setLayout(new FlowLayout());
        jframepagamentos.setSize(1100, 650);
        jframepagamentos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframepagamentos.getContentPane().setBackground(azulFundo);
        jframepagamentos.setResizable(false);
        jframepagamentos.setLocationRelativeTo(null); // CENTRALIZA O JFRAME PARA SER EXIBIDO NO MEIO DA TELA

        // criação do título da página
        String titulopagina = " Pagamento ";

        // definição das características e da área do jtext
        JTextArea titulopagto = new JTextArea(titulopagina);
        titulopagto.setPreferredSize(new Dimension(1500, 600));
        titulopagto.setForeground(botao);
        titulopagto.setEditable(false);
        titulopagto.setLineWrap(true);
        titulopagto.setWrapStyleWord(true);
        titulopagto.setBackground(azulFundo);
        titulopagto.setPreferredSize(new Dimension(970, 50));
        titulopagto.setFont(new Font("Courier", Font.ITALIC,20));
        titulopagto.setSelectionColor(Color.lightGray);
        titulopagto.setSelectedTextColor(Color.darkGray);
        titulopagto.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 10));

        // criação dos botões de pagamento
        JButton botao1efetuarpgt = new JButton("Efetuar pagamento");
        JButton botao2efetuarpgt = new JButton("Efetuar pagamento");
        JButton botao3efetuarpgt = new JButton("Efetuar pagamento");

        // criação do botão voltar
        JButton botao4voltar = new JButton(" Voltar ");

        // atribuição das características dos botões
        botao1efetuarpgt.setBackground(botao);
        botao1efetuarpgt.setFont(Font.getFont(Font.SANS_SERIF));
        botao1efetuarpgt.setForeground(Color.WHITE);
        botao1efetuarpgt.setSize(500, 400);

        // atribuição das características dos botões
        botao2efetuarpgt.setBackground(botao);
        botao2efetuarpgt.setFont(Font.getFont(Font.SANS_SERIF));
        botao2efetuarpgt.setForeground(Color.WHITE);
        botao2efetuarpgt.setSize(500, 400);

        // atribuição das características dos botões
        botao3efetuarpgt.setBackground(botao);
        botao3efetuarpgt.setFont(Font.getFont(Font.SANS_SERIF));
        botao3efetuarpgt.setForeground(Color.WHITE);
        botao3efetuarpgt.setSize(500, 400);

        // atribuição das características dos botões
        botao4voltar.setBackground(botao);
        botao4voltar.setFont(Font.getFont(Font.SANS_SERIF));
        botao4voltar.setForeground(Color.WHITE);
        botao4voltar.setSize(600, 400);


       /* ActionListener voltar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                janelaInicial ji = new janelaInicial();
                ji.iniciar();
                jframepagamentos.dispose();
            }
        };

        botao4voltar.addActionListener(voltar);

        Banco bank = new Banco();
        bank.inicializarConexao();
        String data = bank.consultarNaoPagos(); */



        // definição das caixas de texto
        JTextArea pagamento1 = new JTextArea();
        pagamento1.setForeground(Color.black);
        pagamento1.setLineWrap(true);
        pagamento1.setEditable(false);
        pagamento1.setSize(500, 400);
        pagamento1.setFont(new Font("Courier", Font.ITALIC, 15));
        //pagamento1.setText(data);
        pagamento1.setText("""
        Nome: Joao
        Cargo: DEV
        Email: joaomarchette@gmail.com
        Salario: R$ 32,00
        Data de Pagamento: 12/02/1991
        --------------------
        """);


        // definição das caixas de texto
        JTextArea pagamento2 = new JTextArea();
        pagamento2.setForeground(Color.black);
        pagamento2.setLineWrap(true);
        pagamento2.setEditable(false);
        pagamento2.setFont(new Font("Courier", Font.ITALIC, 15));


        // definição das caixas de texto
        JTextArea pagamento3 = new JTextArea();
        pagamento3.setForeground(Color.black);
        pagamento3.setLineWrap(true);
        pagamento3.setEditable(false);
        pagamento3.setFont(new Font("Courier", Font.ITALIC, 15));


        // definição do tamanho das caixas de texto
        pagamento1.setPreferredSize(new Dimension(300, 455));
        pagamento2.setPreferredSize(new Dimension(300, 455));
        pagamento3.setPreferredSize(new Dimension(300, 455));

        // painel para exibir as caixas de texto lado a lado
        JPanel textos = new JPanel(new GridLayout(1, 1, 50, 1));
        textos.add(pagamento1);
        textos.add(pagamento2);
        textos.add(pagamento3);

        // painel para exibir os botões na parte inferior da tela
        JPanel botoes = new JPanel(new GridLayout(1, 0, 220, 1));
        botoes.add(botao1efetuarpgt);
        botoes.add(botao2efetuarpgt);
        botoes.add(botao3efetuarpgt);

        // painel para exibir o botão voltar na posição correta
        JPanel botaovoltar = new JPanel((new GridLayout(1, 1, 1, 0)));
        botaovoltar.add(botao4voltar);

        // painel para exibir o título da página na posição correta
        JPanel correcaotitulo = new JPanel(new GridLayout(1, 1, 1, 1));
        correcaotitulo.add(titulopagto, BorderLayout.NORTH);

        // adição dos elementos ao jframe
        jframepagamentos.add(correcaotitulo);
        jframepagamentos.add(botaovoltar, BorderLayout.WEST);
        jframepagamentos.add(textos);
        jframepagamentos.add(botoes);
        jframepagamentos.setVisible(true);
    }
}
