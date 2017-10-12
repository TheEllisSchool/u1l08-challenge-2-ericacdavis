import javax.swing.JOptionPane;

public class missingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value=0;
		int missingNum=0;
		int [] cards = {2,10,4,5,6,7,9,3,8};
		for(int i = 0; i <cards.length; i++) {
			value+=cards[i];
			missingNum= 55- value;
		}
		JOptionPane.showMessageDialog(null, "The missing number was: " + missingNum);
	}

}
