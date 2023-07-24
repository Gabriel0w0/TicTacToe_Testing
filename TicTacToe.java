import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TicTacToe extends JFrame implements ActionListener{
    static JLabel lab1 = new JLabel("Testing!");
    static JLabel lab2 = new JLabel("Testing!");
    static String state ="";
    static int Tune = 0;
    JPanel panel = new JPanel(new GridLayout(3, 3));
    static JButton button[] = new JButton[9];
    TicTacToe(){
        super("TicTacToe");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        /*Add Component*/
        this.add(lab1,BorderLayout.NORTH);this.add(lab2,BorderLayout.SOUTH);this.add(panel,BorderLayout.CENTER);

        for(int i=0;i<9;i++){
                button[i]= new JButton();
                panel.add(button[i]);
                button[i].setFont(new Font(getName(), 1, 50));
                button[i].addActionListener(this);
            }
    }
    public static void main(String[] args) {
        TicTacToe win = new TicTacToe();
        win.setVisible(true);
        while(true){
        if(Tune==0)
        player1Stime();
        else
        player2Stime();
        }
    }
    public static void player1Stime(){
        judge();
        lab2.setText("Player1,Choose a grid!");
        state = "O";  
        
    }
    public static void player2Stime(){
        judge();
        lab2.setText("Player2,Choose a grid!");
        state = "X";
        
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button[0]){button[0].setText(state);button[0].setEnabled(false);Tune = (Tune==1)?0:1;}
        if(e.getSource()==button[1]){button[1].setText(state);button[1].setEnabled(false);Tune = (Tune==1)?0:1;}
        if(e.getSource()==button[2]){button[2].setText(state);button[2].setEnabled(false);Tune = (Tune==1)?0:1;}
        if(e.getSource()==button[3]){button[3].setText(state);button[3].setEnabled(false);Tune = (Tune==1)?0:1;}
        if(e.getSource()==button[4]){button[4].setText(state);button[4].setEnabled(false);Tune = (Tune==1)?0:1;}
        if(e.getSource()==button[5]){button[5].setText(state);button[5].setEnabled(false);Tune = (Tune==1)?0:1;}
        if(e.getSource()==button[6]){button[6].setText(state);button[6].setEnabled(false);Tune = (Tune==1)?0:1;}
        if(e.getSource()==button[7]){button[7].setText(state);button[7].setEnabled(false);Tune = (Tune==1)?0:1;}
        if(e.getSource()==button[8]){button[8].setText(state);button[8].setEnabled(false);Tune = (Tune==1)?0:1;}
    }
    public static void judge(){
        if(button[0].getText().toString()!=""){
        if(button[0].getText()==button[3].getText()&button[3].getText()==button[6].getText())
        {
            if(Tune==1){
                button[0].setBackground(Color.GREEN);
                button[3].setBackground(Color.GREEN);
                button[6].setBackground(Color.GREEN);
                lab1.setText("Player1 Win");
            }
            else {
                button[0].setBackground(Color.RED);
                button[3].setBackground(Color.RED);
                button[6].setBackground(Color.RED);               
                lab1.setText("Player2 Win");
            }
            for(int i=0;i<9;i++)button[i].setEnabled(false);;
            lab2.setVisible(false);
        }    
        if(button[0].getText()==button[4].getText()&button[4].getText()==button[8].getText())
        {
            if(Tune==1){
                button[0].setBackground(Color.GREEN);
                button[4].setBackground(Color.GREEN);
                button[8].setBackground(Color.GREEN);
                lab1.setText("Player1 Win");
            }
            else {
                button[0].setBackground(Color.RED);
                button[4].setBackground(Color.RED);
                button[8].setBackground(Color.RED);               
                lab1.setText("Player2 Win");
            }
            for(int i=0;i<9;i++)button[i].setEnabled(false);;
            lab2.setVisible(false);
        } 
        if(button[0].getText()==button[1].getText()&button[1].getText()==button[2].getText())
        {
            if(Tune==1){
                button[0].setBackground(Color.GREEN);
                button[1].setBackground(Color.GREEN);
                button[2].setBackground(Color.GREEN);
                lab1.setText("Player1 Win");
            }
            else {
                button[0].setBackground(Color.RED);
                button[1].setBackground(Color.RED);
                button[2].setBackground(Color.RED);               
                lab1.setText("Player2 Win");
            }
            for(int i=0;i<9;i++)button[i].setEnabled(false);;
            lab2.setVisible(false);
        } 
        }
       if(button[2].getText().toString()!=""){
        if(button[2].getText()==button[5].getText()&button[5].getText()==button[8].getText())
        {
            if(Tune==1){
                button[2].setBackground(Color.GREEN);
                button[5].setBackground(Color.GREEN);
                button[8].setBackground(Color.GREEN);
                lab1.setText("Player1 Win");
            }
            else {
                button[2].setBackground(Color.RED);
                button[5].setBackground(Color.RED);
                button[8].setBackground(Color.RED);               
                lab1.setText("Player2 Win");
            }
            for(int i=0;i<9;i++)button[i].setEnabled(false);;
            lab2.setVisible(false);
        }    
        if(button[2].getText()==button[4].getText()&button[4].getText()==button[6].getText())
        {
            if(Tune==1){
                button[2].setBackground(Color.GREEN);
                button[4].setBackground(Color.GREEN);
                button[6].setBackground(Color.GREEN);
                lab1.setText("Player1 Win");
            }
            else {
                button[2].setBackground(Color.RED);
                button[4].setBackground(Color.RED);
                button[6].setBackground(Color.RED);               
                lab1.setText("Player2 Win");
            }
            for(int i=0;i<9;i++)button[i].setEnabled(false);;
            lab2.setVisible(false);
        } 
        }        
        if(button[7].getText().toString()!=""){
        if(button[6].getText()==button[7].getText()&button[7].getText()==button[8].getText())
        {
            if(Tune==1){
                button[6].setBackground(Color.GREEN);
                button[7].setBackground(Color.GREEN);
                button[8].setBackground(Color.GREEN);
                lab1.setText("Player1 Win");
            }
            else {
                button[6].setBackground(Color.RED);
                button[7].setBackground(Color.RED);
                button[8].setBackground(Color.RED);               
                lab1.setText("Player2 Win");
            }
            for(int i=0;i<9;i++)button[i].setEnabled(false);;
            lab2.setVisible(false);
        }    
        if(button[1].getText()==button[4].getText()&button[4].getText()==button[7].getText())
        {
            if(Tune==1){
                button[1].setBackground(Color.GREEN);
                button[4].setBackground(Color.GREEN);
                button[7].setBackground(Color.GREEN);
                lab1.setText("Player1 Win");
            }
            else {
                button[1].setBackground(Color.RED);
                button[4].setBackground(Color.RED);
                button[7].setBackground(Color.RED);               
                lab1.setText("Player2 Win");
            }
            for(int i=0;i<9;i++)button[i].setEnabled(false);;
            lab2.setVisible(false);
        } 
        }    
 if(button[3].getText().toString()!=""){
        if(button[3].getText()==button[4].getText()&button[4].getText()==button[5].getText())
        {
            if(Tune==1){
                button[3].setBackground(Color.GREEN);
                button[4].setBackground(Color.GREEN);
                button[5].setBackground(Color.GREEN);
                lab1.setText("Player1 Win");
            }
            else {
                button[3].setBackground(Color.RED);
                button[4].setBackground(Color.RED);
                button[5].setBackground(Color.RED);               
                lab1.setText("Player2 Win");
            }
            for(int i=0;i<9;i++)button[i].setEnabled(false);;
            lab2.setVisible(false);
        }    
        }  
    }
}