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

    //title panel
    title_panel.setLayout(new BorderLayout());
    title_panel.setBounds(0,0,800,100);

    button_panel.setLayout(new GridLayout(3,3));
    button_panel.setBackground(new Color(150,150,150));

    for(int i =0; i<9; i++){
      buttons[i] = new JButton();
      button_panel.add(buttons[i]);
      buttons[i].setFont(new Font("MV Boli", Font.BOLD, 120));
      buttons[i].setFocusable(false);
      buttons[i].addActionListener(this);
    }


    title_panel.add(textField);
    frame.add(title_panel,BorderLayout.NORTH);
    frame.add(button_panel);

    firstTurn();

  }
  public void actionPerformed(ActionEvent e) {

  }
  //determine which player will go first
  public void firstTurn(){

    try{
      Thread.sleep(2000);
    } catch (InterruptedException e){
      e.printStackTrace();
    }
    if(random.nextInt(2)==0){
      player1_turn = true;
      textField.setText("X turn");
    } else{
      player1_turn = false;
      textField.setText("O turn");
    }
  }
  // check to see if the player has worn
  public void check(){

  }
  public void xWins(int a, int b, int c){

  }
  public void oWins(int a, int b, int c){

  }
}
