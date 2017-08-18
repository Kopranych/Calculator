package veiw;

import javax.swing.*;
import java.awt.*;

/**
 * Created by kopra on 13.08.2017.
 */
public class CalcJTextField extends JTextField {

    public CalcJTextField(int width){
        setColumns(width);
        Font font = new Font("Courier", Font.ITALIC, 20);//задать шрифт букв
        setFont(font);
    }

    public CalcJTextField(int width, Color color){
        setColumns(width);
        Font font = new Font("Courier", Font.ITALIC, 20);
        setFont(font);
        setForeground(color);//цвет букв
        setBackground(Color.WHITE);//цвет заднего фона
    }
}
