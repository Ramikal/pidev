package esprit.team.pi.client.interfaces;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.border.EmptyBorder;

 import javax.swing.JInternalFrame;

public class Weblog extends JFrame {

	private JPanel contentPane;
	//private final Action action = new SwingAction();

	/**
	 * Launch 	private JMenuItem mntmEditProfile;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Weblog frame = new Weblog();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Weblog() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1055, 443);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenuItem mntmCreatePage = new JMenuItem("Create Page");
		
		menuBar.add(mntmCreatePage);
		
		JMenuItem mntmCreateEvent = new JMenuItem("Create Event");
		menuBar.add(mntmCreateEvent);
		
		JMenuItem mntmBookATicket = new JMenuItem("Book a Ticket");
		menuBar.add(mntmBookATicket);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Friend List");
		menuBar.add(mntmNewMenuItem);
		
		JMenuItem mntmWishList = new JMenuItem("Wish List");
		menuBar.add(mntmWishList);
		
		JMenuItem mntmViewStatistics = new JMenuItem("View Statistics");
		menuBar.add(mntmViewStatistics);
		
		JMenuItem mntmCheckIn = new JMenuItem("Check IN");
		menuBar.add(mntmCheckIn);
		
		JMenuItem mntmEditProfile = new JMenuItem("Edit Profile");
		menuBar.add(mntmEditProfile);
		
		JMenuItem mntmMyPages = new JMenuItem("My Pages");
		menuBar.add(mntmMyPages);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		final JInternalFrame internalFrame = new JInternalFrame("New JInternalFrame");
		internalFrame.setBounds(379, 64, 634, 306);
		contentPane.add(internalFrame);
		internalFrame.setVisible(false);
		
		mntmEditProfile.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				
				internalFrame.add(new Edit().getContentPane());
				internalFrame.setVisible(true);
				
			}
		});
		}

		
	

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}


	
	
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}

		public void actionPerformed(ActionEvent e) {
		}
	}
}
