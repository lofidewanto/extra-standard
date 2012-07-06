package de.extra.xtt.gui;

import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import de.extra.xtt.util.tools.Configurator;

/**
 * Diese Klasse implementiert den About-Dialog des XSD-Creators.
 * 
 * @author Beier
 */
public class About extends JDialog {

	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;
	private Configurator configurator;

	/**
	 * Konstruktor zur Initialisierung des About-Dialogs
	 * 
	 * @param owner
	 *            Frame, das Besitzer dieses Dialogs ist
	 * @param configurator
	 *            Configurator-Objekt mit dem Zugriff auf die Versionsinformationen
	 */
	public About(Frame owner, Configurator configurator) {
		super(owner);
		this.configurator = configurator;
		setResizable(false);
		setTitle("About XSD-Creator");
		this.setLocationRelativeTo(owner);
		initialize();
	}

	/**
	 * This method initializes this
	 */
	private void initialize() {
		this.setSize(478, 268);
		this.setContentPane(getJContentPane());
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(null);

			JLabel label = new JLabel("");
			label.setIcon(new ImageIcon(About.class.getResource("/resource/de/drv/dsrv/xtt/gui/img/awv_extra.png")));
			label.setBounds(10, 11, 449, 150);
			jContentPane.add(label);

			JLabel lblXsdcreator = new JLabel("XSD-Creator");
			lblXsdcreator.setHorizontalAlignment(SwingConstants.CENTER);
			lblXsdcreator.setFont(new Font("Tahoma", Font.BOLD, 18));
			lblXsdcreator.setBounds(10, 168, 449, 23);
			jContentPane.add(lblXsdcreator);

			JButton btnOk = new JButton("OK");
			btnOk.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
				}
			});
			btnOk.setBounds(370, 206, 89, 23);
			jContentPane.add(btnOk);

			JLabel lblVersion = new JLabel("");
			lblVersion.setHorizontalAlignment(SwingConstants.CENTER);
			lblVersion.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblVersion.setBounds(10, 192, 449, 15);
			lblVersion.setText("Version " + configurator.getVersion());
			jContentPane.add(lblVersion);
		}
		return jContentPane;
	}
} // @jve:decl-index=0:visual-constraint="10,10"
