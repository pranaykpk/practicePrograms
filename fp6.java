// Login page gui 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class fp6 extends JFrame implements ActionListener{
    
    //Declaring components
    private JLabel userLabel,passLabel,message;
    private JTextField userField;
    private JPasswordField passField;
    private JButton loginButton;
   
    //Creating constructor
    public fp6(){
        super("Login Page");
        setSize(400,300);
        setLayout(new GridLayout(4,2));
        
        //Initializing components 
        userLabel = new JLabel("Username");
        passLabel = new JLabel("Password");
        message  = new JLabel();
        userField = new JTextField();
        passField = new JPasswordField();
        loginButton = new JButton("Login");
        

        // adding components to the frame
        add(userLabel);
        add(userField);
        add(passLabel);
        add(passField);
        add(loginButton);
       
        add(message);

        //adding action listeners to the buttons
        loginButton.addActionListener(this);
       

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
  
    }
    public void actionPerformed(ActionEvent e){
        String username = userField.getText();
        String password = new String(passField.getPassword());

        String actualUsername = "Hello World";
        String actualPassword = "1234567";

        if(username.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(this,"Please enter both username and password");

        }
        else if(username.compareTo(actualUsername) !=0 &&password.compareTo(actualPassword)!=0  ){
            JOptionPane.showMessageDialog(this,"Incorrect username or password");

        }
        else{
           String name= JOptionPane.showInputDialog("Enter your name");
            JOptionPane.showMessageDialog(this,"Welcome, "+name);
        }
    }
    public static void main(String[] args) {
        new fp6();
    }
}