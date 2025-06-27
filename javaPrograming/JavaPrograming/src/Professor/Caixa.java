package Professor;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Caixa extends JFrame {

    private static final long serialVersionUID = 1l;
    private JPanel contentPane;
    private JTextField txtDeposito;
    private JTextField txtSaque;
    private JTextField txtSaldo;
    private JTextField txtSalario;
    private JTextField txtEmprestimo;
    private JTextField txtParcela;
    ContaBancaria conta = new ContaBancaria();
    Servicos servico = new Servicos();

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try{
                    Caixa frame = new Caixa();
                    frame.setVisible(true);
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
    }

    public Caixa(){
        setTitle("Caixa eletronico");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,583,524);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblDeposito = new JLabel("Depósito");
        lblDeposito.setFont(new Font("Arial", Font.PLAIN,18));
        lblDeposito.setBounds(10,99,84,22);
        contentPane.add(lblDeposito);

        JLabel lblSaque = new JLabel("Saque");
        lblSaque.setFont(new Font("Arial", Font.PLAIN,18));
        lblSaque.setBounds(10,159,84,22);
        contentPane.add(lblSaque);

        txtDeposito = new JTextField();
        txtDeposito.setFont(new Font("Arial", Font.PLAIN,18));
        txtDeposito.setBounds(93,99,211,22);
        contentPane.add(txtDeposito);
        txtDeposito.setColumns(10);

        txtSaque = new JTextField();
        txtSaque.setFont(new Font("Arial", Font.PLAIN,18));
        txtSaque.setBounds(93,159,211,22);
        contentPane.add(txtSaque);
        txtSaque.setColumns(10);

        JButton btnDeposito = new JButton("Depósito");
       btnDeposito.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               double deposito = Double.parseDouble(txtDeposito.getText());
               double saldo = conta.depositar(deposito);
               txtSaldo.setText(String.valueOf(saldo));
           }
       });

       btnDeposito.setFont(new Font("Arial", Font.PLAIN,18));
       btnDeposito.setBounds(373,95,116,31);
       contentPane.add(btnDeposito);

       JButton btSaque = new JButton("Saque");
       btSaque.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               double saque = Double.parseDouble(txtSaque.getText());
               double saldo = conta.sacar(saque);

               txtSaldo.setText(String.valueOf(saldo));
           }
       });
       btSaque.setFont(new Font("Arial", Font.PLAIN,18));
       btSaque.setBounds(373,161,116,31);
       contentPane.add(btSaque);

       JLabel lblNewLabel = new JLabel("Saldo");
       lblNewLabel.setFont(new Font("Arial", Font.PLAIN,18));
       lblNewLabel.setBounds(10,35,84,22);
       contentPane.add(lblNewLabel);

       txtSaldo = new JTextField();
       txtSaldo.setFont(new Font("Arial",Font.PLAIN, 18));
       txtSaldo.setBounds(93,38,133,20);
       contentPane.add(txtSaldo);
       txtSaldo.setColumns(10);

       JLabel lblEmprestimo = new JLabel("Empréstimo");
       lblEmprestimo.setFont(new Font("Arial", Font.PLAIN,22));
       lblEmprestimo.setBounds(213,226,128,31);
       contentPane.add(lblEmprestimo);

       JLabel lblSalario = new JLabel("Salario");
       lblSalario.setFont(new Font("Arial", Font.PLAIN,18));
       lblSalario.setBounds(10,308,84,22);
       contentPane.add(lblSalario);

       JLabel lblValorEmprestimo = new JLabel("Empréstimo");
       lblValorEmprestimo.setFont(new Font("Arial", Font.PLAIN,18));
       lblValorEmprestimo.setBounds(10,355,100,22);
       contentPane.add(lblValorEmprestimo);

       JLabel lblParcela = new JLabel("Parcela");
       lblParcela.setFont(new Font("Arial", Font.PLAIN,18));
        lblParcela.setFont(new Font("Arial", Font.PLAIN,18));
        lblParcela.setBounds(10,404,100,22);
        contentPane.add(lblParcela);


        txtSalario = new JTextField();
        txtSalario.setBounds(130,310,211,22);
        contentPane.add(txtSalario);
        txtSalario.setColumns(10);

        txtEmprestimo = new JTextField();
        txtEmprestimo.setBounds(130,358,211,22);
        contentPane.add(txtEmprestimo);
        txtEmprestimo.setColumns(10);

        txtParcela = new JTextField();
        txtParcela.setBounds(130,407,211,22);
        contentPane.add(txtParcela);
        txtParcela.setColumns(10);

        JButton btnSolicitar = new JButton("Solicitar");
        btnSolicitar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double salario = Double.parseDouble(txtSalario.getText());
                double emprestimo = Double.parseDouble(txtEmprestimo.getText());
                double parcela = servico.emprestar(salario, emprestimo);
                conta.depositar(emprestimo);
                double saldo = conta.getSaldo();
                txtSaldo.setText(String.valueOf(saldo));
                txtParcela.setText(String.valueOf(parcela));
            }
        });
        btnSolicitar.setFont(new Font("Arial", Font.PLAIN,18));
        btnSolicitar.setBounds(373,406,116,31);
        contentPane.add(btnSolicitar);




    }



}
