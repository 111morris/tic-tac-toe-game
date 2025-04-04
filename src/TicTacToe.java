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
    for(int i =0; i<9; i++){
      if(e.getSource() == buttons[i]){
        if(player1_turn){
          if(buttons[i].getText() == ""){
            buttons[i].setForeground(new Color(255,0,0));
            buttons[i].setText("X");
            player1_turn = false;
            textField.setText("O turn");
            check();
          }
        } else {
          if(buttons[i].getText()==""){
            buttons[i].setForeground(new Color(0,0,255));
            buttons[i].setText("O");
            player1_turn = true;
            textField.setText("X turn");
            check();
          }
        }
      }
    }
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
    //checking  X
    // the winning combinations (rows, columns, diagonals)
    int[][] winningCombinations = {
        {0, 1, 2}, // First row
        {3, 4, 5}, // Second row
        {6, 7, 8}, // Third row
        {0, 3, 6}, // First column
        {1, 4, 7}, // Second column
        {2, 5, 8}, // Third column
        {0, 4, 8}, // First diagonal
        {2, 4, 6}  // Second diagonal
    };

// Loop through each winning combination
    for (int[] combination : winningCombinations) {
      // Check if all three buttons in the combination have "X"
      if (buttons[combination[0]].getText().equals("X") &&
          buttons[combination[1]].getText().equals("X") &&
          buttons[combination[2]].getText().equals("X")) {
        // If they do, it's a win
        xWins(combination[0], combination[1], combination[2]);
      }
    }

    //checking O

// Loop through each winning combination
    for (int[] combination : winningCombinations) {
      // Check if all three buttons in the combination have "X"
      if (buttons[combination[0]].getText().equals("O") &&
          buttons[combination[1]].getText().equals("O") &&
          buttons[combination[2]].getText().equals("O")) {
        // If they do, it's a win
        oWins(combination[0], combination[1], combination[2]);
      }
    }

    public void xWins(int a, int b, int c){
      buttons[a].setBackground(Color.GREEN);
      buttons[b].setBackground(Color.GREEN);
      buttons[c].setBackground(Color.GREEN);

    }
  }
  public void oWins(int a, int b, int c){

  }
}
