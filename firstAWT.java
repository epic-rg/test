import java.awt.*;
import java.awt.event.*;

public class firstAWT extends Frame implements ActionListener {

    Button b1;
    //Button b2;

    int clickCount = 0;

    public firstAWT()
    {

        Frame frame = new Frame();
        
        frame.setVisible(true);
        frame.setBounds(100 , 100, 700, 500);
        frame.setTitle("Raghav God");
        TextField tf =new TextField("Raghav is pro");
        //TextField tf1 =new TextField("Raghav is epic");

        tf.setEditable(false);
        
        frame.setLayout(new FlowLayout(FlowLayout.LEFT, 100 , 30));
        frame.add(tf);
        //frame.add(tf1);

        b1 = new Button("You noob");
        //b2 = new Button("haha lol");
        
        frame.setLayout(new FlowLayout(FlowLayout.RIGHT, 100 , 30));

        frame.add(b1);
        //frame.add(b2);

        b1.setBackground(Color.cyan);
        //b2.setBackground(Color.pink);

        b1.setForeground(Color.red);
        //b2.setForeground(Color.orange);

        b1.addActionListener(this);

        while(true)
        {
            tf.setText(String.valueOf(clickCount));
        }

   
    }

    public void actionPerformed(ActionEvent e)
    {
        clickCount++;
    }



    public static void main(String [] args)
    {
        new firstAWT();
    }

    
}