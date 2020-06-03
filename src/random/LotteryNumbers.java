package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
	public static void main(String[] args) {
	Random random = new Random();
	
	int r = random.nextInt(9);
	int r1= random.nextInt(9);
	int r2 = random.nextInt(9);
	int r3=random.nextInt(9);
	int r4 = random.nextInt(9);

	JOptionPane.showMessageDialog(null, (r)+(r1)+(r2)+(r3));
	}

}
