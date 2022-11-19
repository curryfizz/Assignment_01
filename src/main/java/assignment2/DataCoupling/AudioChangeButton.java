package assignment2.DataCoupling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class AudioChangeButton extends JButton {


    public AudioChangeButton () {
        setText("♬");
        setForeground(Color.white);
        setBorderPainted(false);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setVisible(true);
        setBounds(0, 0, 60, 60);
        //here the size and position of the button is being set by passing data directly to the setBounds method
        //-an example of data coupling

    }
}