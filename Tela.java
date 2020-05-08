import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tela extends JFrame implements ActionListener {
   private JTextField txttexto;
   private JLabel lbltexto;
   private JButton btnMostrar, btnLimpar, btnSair;
   
   public Tela(){
      super ("Textos");
      JPanel painelDadosEntrada = new JPanel (new GridLayout (4, 2));
      JPanel painelEntrada = new JPanel (new FlowLayout());
      txttexto = new JTextField(10);
      lbltexto = new JLabel("Texto:"); 
      painelDadosEntrada.add(lbltexto);
      painelDadosEntrada.add(txttexto);
      painelEntrada.add(painelDadosEntrada);
      JPanel painelBotoes = new JPanel(new FlowLayout());
      btnMostrar = new JButton("Mostrar");
      btnLimpar = new JButton("Limpar");
      btnSair = new JButton("Sair");
      painelBotoes.add(btnMostrar);
      painelBotoes.add(btnLimpar);
      painelBotoes.add(btnSair);
      Container caixa = getContentPane();
      caixa.setLayout(new BorderLayout());
      caixa.add(painelEntrada, BorderLayout.WEST);
      caixa.add(painelBotoes, BorderLayout.SOUTH);
      btnMostrar.addActionListener(this);
      btnLimpar.addActionListener(this);
      btnSair.addActionListener(this);
      setSize(710, 190);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLocationRelativeTo(null);
      setVisible(true);
      }
      public void actionPerformed(ActionEvent e) {
      if (e.getSource() == btnMostrar) {
      String texto = txttexto.getText();
      JOptionPane.showMessageDialog(null, texto);
      } else if (e.getSource() == btnLimpar) {
      txttexto.setText("");  
      } else {
      System.exit(0);
      }
      }
      }
   