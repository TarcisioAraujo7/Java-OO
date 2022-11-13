
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class viewBiblioteca {

	private JFrame frame;
	private float saldo;
	private int conquistas;
	private JTextField horasField;

	
	public viewBiblioteca() {

	}

	/**
	 * Initialize the contents of the frame.
	 */
	protected void initialize(List<Produto> produtoDisponiveis, Jogador player) {
		setFrame(new JFrame());
		getFrame().getContentPane().setForeground(Color.WHITE);
		getFrame().getContentPane().setBackground(Color.WHITE);
		getFrame().setBounds(100, 100, 820, 500);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(20, 26, 203, 362);
		panel.setBackground(Color.CYAN);
		getFrame().getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario1");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(71, 123, 111, 20);
		panel.add(lblNewLabel);
		
		JLabel img = new JLabel("img");
		img.setForeground(Color.PINK);
		img.setBackground(Color.BLACK);
		img.setIcon(new ImageIcon("C:\\GitHub\\Java-OO\\teste\\Bomberman-icon.png"));
		img.setBounds(10, 11, 179, 101);
		panel.add(img);
		
		JLabel txtSaldo = new JLabel("SALDO:");
		txtSaldo.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtSaldo.setBounds(10, 186, 102, 14);
		panel.add(txtSaldo);

		player.setConquistas(produtoDisponiveis);
		conquistas = player.getConquistas();
		JLabel txtConquistas = new JLabel(String.format("CONQUISTAS: %d", conquistas));
		txtConquistas.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtConquistas.setBounds(10, 268, 102, 14);
		panel.add(txtConquistas);
		
		JLabel txtJogos = new JLabel("JOGOS:");
		txtJogos.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtJogos.setBounds(10, 228, 46, 14);
		panel.add(txtJogos);
		
		JButton btnvoltarLogin = new JButton("Voltar");
		btnvoltarLogin.setBounds(73, 402, 89, 23);
		btnvoltarLogin.setBackground(Color.WHITE);
		btnvoltarLogin.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnvoltarLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				viewLogin window = new viewLogin("","");
				window.getFrame().setVisible(true);
				getFrame().setVisible(false);
				
			}
		});
		getFrame().getContentPane().add(btnvoltarLogin);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(282, 209, 175, 147);
		getFrame().getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("JOGO ATUAL");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(51, 11, 78, 14);
		panel_3.add(lblNewLabel_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(555, 209, 175, 147);
		getFrame().getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JLabel txtTituloJogarHoras = new JLabel("JOGAR(HORAS)");
		txtTituloJogarHoras.setBounds(45, 11, 89, 14);
		panel_4.add(txtTituloJogarHoras);
		txtTituloJogarHoras.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		horasField = new JTextField();
		horasField.setBounds(24, 32, 124, 20);
		panel_4.add(horasField);
		horasField.setColumns(10);
		
		
		saldo = player.getSaldoTotal();

		JButton btnComprar = new JButton("+ COMPRAR SALDO");
		btnComprar.setBounds(570, 399, 160, 29);
		btnComprar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnComprar.setBackground(Color.GREEN);
		txtSaldo.setText(String.format("SALDO:  %.2f", saldo));
		btnComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.setSaldoTotal( saldo += 10);
				txtSaldo.setText(String.format("SALDO:  %.2f", saldo));
			}
		});

		getFrame().getContentPane().add(btnComprar);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(555, 26, 175, 147);
		getFrame().getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JComboBox<String> comboBoxComprar = addJogos(produtoDisponiveis, false);
		panel_2.add(comboBoxComprar);
		 
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(282, 26, 175, 147);
		getFrame().getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox<String> comboBoxMeusJogos = addJogos(produtoDisponiveis, true);
		panel_1.add(comboBoxMeusJogos);
		comboBoxMeusJogos.setToolTipText("MEUSJOGOS");

		JLabel txtTituloComprar = new JLabel("LOJA");
		txtTituloComprar.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtTituloComprar.setBounds(75, 11, 107, 14);
		panel_2.add(txtTituloComprar);
		
		JButton btnComprarJogo = new JButton("COMPRAR");
		btnComprarJogo.setBounds(36, 76, 99, 23);
		btnComprarJogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				comboBoxComprar.getSelectedItem();

				for (Produto produto : produtoDisponiveis) {
					if (produto instanceof Jogo) {
						if (produto.toString().equals(comboBoxComprar.getSelectedItem()) && player.comprarJogo((Jogo) produto)) {
							
							comboBoxMeusJogos.addItem(produto.toString());
							comboBoxComprar.removeItem(comboBoxComprar.getSelectedItem());
							saldo = player.getSaldoTotal();
							txtSaldo.setText(String.format("SALDO:  %.2f", saldo));
							break;
					}
					}
					
				}
				
			}
		});
		
		panel_2.add(btnComprarJogo);
		
		JLabel txtTituloMeuJogos = new JLabel("MEUS JOGOS");
		txtTituloMeuJogos.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtTituloMeuJogos.setBounds(54, 11, 111, 14);
		panel_1.add(txtTituloMeuJogos);
		//comboBox.getSelectedIndex()

		JButton btnJogar = new JButton("JOGAR");
		btnJogar.setBounds(34, 68, 100, 23);
		btnJogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				for (Produto produto : produtoDisponiveis) {
					if (produto instanceof Jogo) {
						if (produto.toString().equals(comboBoxMeusJogos.getSelectedItem())) {
							
							Jogo jogoSelecionado = (Jogo) produto;

							jogoSelecionado.Jogar(horasField.getText());

							player.setConquistas(produtoDisponiveis);
							conquistas = player.getConquistas();
							txtConquistas.setText(String.format("CONQUISTAS: %d", conquistas));
							break;
					}
					}
					
				}
			}
		});
		panel_4.add(btnJogar);


	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JComboBox<String> addJogos(List<Produto> produtoDisponiveis, boolean possui){
		JComboBox<String> comboBoxComprar = new JComboBox<String>();
		comboBoxComprar.setBounds(10, 33, 155, 22);

		for (Produto produto : produtoDisponiveis) {
			if (produto instanceof Jogo && produto.getPossui() == possui) {
				comboBoxComprar.addItem(produto.toString());
			}
		}
		
		return comboBoxComprar;
	}

	
}