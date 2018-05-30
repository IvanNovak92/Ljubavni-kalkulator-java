package ljubavnikalkulator;

import javax.swing.JOptionPane;
import javax.xml.bind.ParseConversionEvent;

public class Start {

	public static void main(String[] args) {

		String imeJedan = (JOptionPane.showInputDialog("Unesite prvo ime"));

		String imeDva = (JOptionPane.showInputDialog("Unesite drugo ime"));

		int volese =imeJedan.length() + imeDva.length();

				

		if (volese>50) {
			System.out.println(imeJedan + " " + "i" + " " + imeDva+ " " + "se vole" + volese * 3  + "%");

		}
		if(volese<50) {
			System.out.println(imeJedan + " " + "i" + " " + imeDva+ " " + "se vole" + " " + volese * 3  + "%");
			
		}
		
				
		}
		

	}


