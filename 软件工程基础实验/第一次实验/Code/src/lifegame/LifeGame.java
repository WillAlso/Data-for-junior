package lifegame;

import javax.swing.JFrame;

public class LifeGame extends JFrame{
	
	LifeGame(){
		this.setSize(600, 400);
		this.setTitle("Game of Life");
		this.setResizable(true);
	}
	
	public static void main(String[] args) {
		LifeGame lifegame = new LifeGame();
		lifegame.setVisible(true);
	}

}
