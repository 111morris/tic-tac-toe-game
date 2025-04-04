import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TicTacToe  implements ActionListener {
  Random random = new Random();
  JFrame frame = new JFrame();
  JPanel title_panel = new JPanel();
  JPanel button_panel = new JPanel();
  JLabel textField = new JLabel();
  JButton[] buttons = new JButton[9];
  boolean player1_turn;

  TicTacToe(){

  }
  public void actionPerformed(ActionEvent e) {

  }
  //determine which player will go first
  public void firstTurn(){

  }
  // check to see if the player has worn
  public void check(){

  }
  public void xWins(int a, int b, int c){

  }
  public void oWins(int a, int b, int c){

  }
}
