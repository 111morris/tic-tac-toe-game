import javax.swing.*;
import java.awt.*;
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
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(800,800);
    frame.getContentPane().setBackground(new Color(50,50,50));
    frame.setLayout(new BorderLayout());
    frame.setVisible(true);

    textField.setBackground(new Color(25,25,25));
    textField.setForeground(new Color(25,255,0));
    textField.setFont(new Font("Ink Free", Font.BOLD, 70));
    textField.setHorizontalAlignment(JLabel.CENTER);
    textField.setText("Tic-Tac-Toe");
    textField.setOpaque(true);

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
