//Simple GUI program
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class fp6{
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            gui();
        });
    }
    private static void gui(){
        //create a nd set up the JFrame
        JFrame frame = new JFrame("Simple GUI Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //create and set up the content pane
        JPanel panel  = new JPanel();
        panel.setLayout(new FlowLayout());

        //Create a button
        JButton button = new JButton("Click Here");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(frame,"Button Clicked");
            }
        });

        //Add components to the content panel
        panel.add(button);

        frame.setContentPane(panel);

        frame.setSize(300,300);
        frame.setLocationRelativeTo(null);  //center the frame on the screen
        frame.setVisible(true);

    }
}
