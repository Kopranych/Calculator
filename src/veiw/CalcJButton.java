package veiw;

import javax.swing.*;
import java.awt.*;

/**
 * Created by kopra on 13.08.2017.
 */
public class CalcJButton extends JButton {
    public CalcJButton(String nameButton){
        setText(nameButton);
    }

    public CalcJButton(String buttonText, int whidth, int height) {
        this(buttonText);
        setSize(whidth, height);
        setFont(new Font("Courier", Font.ITALIC, 20));
    }
}
