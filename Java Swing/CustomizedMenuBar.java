//menu5=menu4 +
//penanganan event untuk RadioButtonMenuItem dan checkBoxMenuItem
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class CustomizedMenuBar extends JMenuBar {
	JMenu mFile;
	JMenu mView;
	JMenu mHelp;
	JMenu mNew;
	JMenuItem miOpen;
	JMenuItem miSave;
	JMenuItem miClose;
	JSeparator miSep;
	JMenuItem miExit;
	JRadioButtonMenuItem miNormal;
	JRadioButtonMenuItem miPageLayout;
	ButtonGroup group;
	JCheckBoxMenuItem miItalic;
	JCheckBoxMenuItem miBold;
	JMenuItem miForm;
	JMenuItem miProject;
	String pesan;
	public CustomizedMenuBar() {
		//Buat Menu Utama
		mFile=new JMenu("File"); mFile.setMnemonic('F');
		mView=new JMenu("View"); mView.setMnemonic('V');
		mHelp=new JMenu("Help"); mHelp.setMnemonic('H');
		//Sambungkan MenuUtama ke MenuBar
		add(mFile);
		add(mView);
		add(mHelp);
		//Buat SubMenu dari Menu File
		mNew=new JMenu ("New"); mNew.setMnemonic('N');
		miOpen=new JMenuItem ("Open");miOpen.setMnemonic('O');
		miSave=new JMenuItem ("Save");miSave.setMnemonic('S');
		miClose=new JMenuItem ("Close");miClose.setMnemonic('C');
		miSep=new JSeparator();
		miExit=new JMenuItem ("Exit");miExit.setMnemonic('E');
		//Sambungkan Sub Menu
		mFile.add(mNew);
		mFile.add(miOpen);
		mFile.add(miSave);
		mFile.add(miClose);
		mFile.add(miSep);
		mFile.add(miExit);
		//Buat Sub Menu dari Menu View
		miNormal=new JRadioButtonMenuItem("Normal");
		miNormal.setMnemonic('N');
		miPageLayout=new JRadioButtonMenuItem("Page Layout");
		miPageLayout.setMnemonic('P');
		//JRadioButonMenuItem harus berada pada satu grup
		group=new ButtonGroup();
		group.add(miNormal);
		group.add(miPageLayout);
		miItalic=new JCheckBoxMenuItem("Italic");
		miItalic.setMnemonic('I');
		miBold=new JCheckBoxMenuItem("Bold"); miBold.setMnemonic('B');
		//Sambungkan Sub Menu
		mView.add(miNormal);
		mView.add(miPageLayout);
		//mView.add(new JSeparator()); , cara lain untuk membuat seperator menu
		mView.addSeparator();
		mView.add(miItalic);
		mView.add(miBold);
		//Buat Sub-sub Menu dari SubMenu New
		miForm=new JMenuItem ("Form"); miForm.setMnemonic('F');
		miProject=new JMenuItem ("Project"); miProject.setMnemonic('P');
		//Sambungkan Sub Menu
		mNew.add(miForm);
		mNew.add(miProject);
		//PENANGANAN EVENT
		//--menu Exit--
		//buat objek penangan event: ActionListener
		ActionListener lst=new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		};
		//sambungkan dengan menu yang dimaksud
		miExit.addActionListener(lst);
		//--menu miNormal--
		//buat objek penangan event: ActionListener
		//sekaligus sambungkan dengan menu yang dimaksud
		miNormal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShowButtonStatus();
			}
		}
		);
		//--menu miPageLayout--
		miPageLayout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShowButtonStatus();
			}
		}
		);
		//--menu miItalic--
		miItalic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShowButtonStatus();
			}
		}
		);
		//--menu miBold--
		miBold.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShowButtonStatus();
			}
		}
		);
	}
	//fungsi untuk melihat menu button dipilih atau tidak
	protected void ShowButtonStatus(){
		if (miNormal.isSelected()) System.out.println("Normal: ON");
		else System.out.println("Normal: OFF");
		if (miPageLayout.isSelected()) System.out.println("PageLayout: ON"); 
		else System.out.println("PageLayout: OFF");
		if (miItalic.isSelected()) System.out.println("Italic: ON");
		else System.out.println("Italic: OFF");
		if (miBold.isSelected()) System.out.println("Bold: ON"); else
		System.out.println("Bold: OFF");
	};
} //end of class CustomizedMenuBar