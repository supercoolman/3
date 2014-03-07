/* 
 * a) public House(int _year,int _size)
 * b) private int year private int size;
 *    public static final int MIN_SIZE =10;
 * c) private static int nbrOfHouses;
 * d) public static int getNbrHouses(){
        return nbrOfHouses;
      }
   e) public int getYear(){
        //diverse kod
      }
      public int getSize(){
        //diverse kod
      }
   f) att den inte går att ändras.
   g) ------
      House
      ------
      year:int
      size:int
      nbrOfHouses:int
      MIN_SIZE:int
      ------
      House(year:int, size:int)
      getNbrHouses():int
      getYear():int
      getSize():int
      ------
      
 */


package hus;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;

public class hus extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hus frame = new hus();
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
	public hus() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTextArea textArea = new JTextArea();
		contentPane.add(textArea);
		House house1 = new House(2015, 2);
		House house2 = new House(666, 40);
		House house3 = new House(1994, 19);
		House[] husArray = new House[10];
		husArray[6]=house2;
		husArray[4]=house3; 
		husArray[1]=house1;
		for(int i=0;i<husArray.length;i++){
			if(husArray[i] != null){
				textArea.append("huset är bygt år "+husArray[i].getYear()+" och är "+husArray[i].getSize()+"stort \n");
			}
		}
		textArea.append("de fins "+House.getNbrHouses()+" hus");
		
	}

}
