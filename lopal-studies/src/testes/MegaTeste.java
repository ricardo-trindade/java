package LOPAL;

import java.util.Random;
import java.util.regex.Pattern;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MegaTeste {

    private static String criar_nome;
    private static String usar_email;
    private static String criar_senha;
    private static double saldo;

    public static void main(String[] args) {
        // Inicialização da interface gráfica
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                criarTelaCadastro();
            }
        });
    }

    public static void criarTelaCadastro() {
        JFrame frame = new JFrame("Cadastro de Usuário");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        // Painel para cadastro
        JPanel painelCadastro = new JPanel();
        painelCadastro.setLayout(new GridLayout(6, 2));

        JLabel nomeLabel = new JLabel("Digite seu nome de usuário:");
        JTextField nomeField = new JTextField();
        painelCadastro.add(nomeLabel);
        painelCadastro.add(nomeField);

        JLabel emailLabel = new JLabel("Digite seu e-mail:");
        JTextField emailField = new JTextField();
        painelCadastro.add(emailLabel);
        painelCadastro.add(emailField);

        JLabel senhaLabel = new JLabel("Crie uma senha:");
        JPasswordField senhaField = new JPasswordField();
        painelCadastro.add(senhaLabel);
        painelCadastro.add(senhaField);

        JButton cadastrarButton = new JButton("Cadastrar");
        painelCadastro.add(new JLabel()); // Espaço vazio
        painelCadastro.add(cadastrarButton);

        frame.add(painelCadastro, BorderLayout.CENTER);

        // Ação de cadastro
        cadastrarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                criar_nome = nomeField.getText();
                usar_email = emailField.getText();
                criar_senha = new String(senhaField.getPassword());

                String regex = "^[a-zA-Z0-9._%+-]+@(outlook|gmail|hotmail|yahoo)\\.(com|com\\.br)$";
                if (Pattern.matches(regex, usar_email)) {
                    JOptionPane.showMessageDialog(frame, "Cadastro realizado com sucesso!");
                    frame.setVisible(false);
                    criarTelaLogin();
                } else {
                    JOptionPane.showMessageDialog(frame, "E-mail inválido. Tente novamente.");
                }
            }
        });

        frame.setVisible(true);
    }

    public static void criarTelaLogin() {
        JFrame frame = new JFrame("Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        // Painel para login
        JPanel painelLogin = new JPanel();
        painelLogin.setLayout(new GridLayout(4, 2));

        JLabel loginLabel = new JLabel("Digite seu e-mail ou nome de usuário:");
        JTextField loginField = new JTextField();
        painelLogin.add(loginLabel);
        painelLogin.add(loginField);

        JLabel senhaLabel = new JLabel("Digite sua senha:");
        JPasswordField senhaField = new JPasswordField();
        painelLogin.add(senhaLabel);
        painelLogin.add(senhaField);

        JButton loginButton = new JButton("Login");
        painelLogin.add(new JLabel()); // Espaço vazio
        painelLogin.add(loginButton);

        frame.add(painelLogin, BorderLayout.CENTER);

        // Ação de login
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String login = loginField.getText();
                String senha = new String(senhaField.getPassword());

                if ((login.equals(criar_nome) || login.equals(usar_email)) && senha.equals(criar_senha)) {
                    JOptionPane.showMessageDialog(frame, "Login realizado com sucesso!");
                    frame.setVisible(false);
                    criarTelaOperacoes();
                } else {
                    JOptionPane.showMessageDialog(frame, "E-mail/Usuário ou senha incorretos.");
                }
            }
        });

        frame.setVisible(true);
    }

    public static void criarTelaOperacoes() {
        // Inicializar saldo aleatório entre 500 e 1000
        Random rd = new Random();
        saldo = rd.nextDouble() * 500 + 500;

        JFrame frame = new JFrame("Operações Bancárias");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        // Painel para as operações bancárias
        JPanel painelOperacoes = new JPanel();
        painelOperacoes.setLayout(new GridLayout(5, 1));

        JButton consultarSaldoButton = new JButton("Consultar Saldo");
        JButton saqueButton = new JButton("Saque");
        JButton depositoButton = new JButton("Depósito");
        JButton sairButton = new JButton("Sair");

        painelOperacoes.add(consultarSaldoButton);
        painelOperacoes.add(saqueButton);
        painelOperacoes.add(depositoButton);
        painelOperacoes.add(sairButton);

        frame.add(painelOperacoes, BorderLayout.CENTER);

        // Ações dos botões
        consultarSaldoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Seu saldo é: R$ " + String.format("%.2f", saldo));
            }
        });

        saqueButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String saqueStr = JOptionPane.showInputDialog(frame, "Digite o valor para saque:");
                double saque = Double.parseDouble(saqueStr);

                if (saque <= saldo) {
                    saldo -= saque;
                    JOptionPane.showMessageDialog(frame, "Saque realizado com sucesso! Novo saldo: R$ " + String.format("%.2f", saldo));
                } else {
                    JOptionPane.showMessageDialog(frame, "Saldo insuficiente.");
                }
            }
        });

        depositoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String depositoStr = JOptionPane.showInputDialog(frame, "Digite o valor para depósito:");
                double deposito = Double.parseDouble(depositoStr);

                saldo += deposito;
                JOptionPane.showMessageDialog(frame, "Depósito realizado com sucesso! Novo saldo: R$ " + String.format("%.2f", saldo));
            }
        });

        sairButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Adeus! Volte sempre.");
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }
}
