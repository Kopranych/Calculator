package veiw;

import javax.swing.*;
import java.awt.*;
import static veiw.CalcWindow.*;

/**
 * Created by kopra on 13.08.2017.
 */
public class CalcJFrame extends JFrame {
    public CalcJFrame(String title, int width, int height) {
        setIconImage(new ImageIcon("iconcalc.jpg").getImage());// вызывается перед всеми
        setSize(width, height);
        setTitle(title);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
 //       setMinimumSize(new Dimension(WIDH_CALC, HEIGHT_CALC));//минимальный размер окна
        setResizable(false);//запрет на изменение размера окна
//        setVisible(true);// не делай в конструкторе!!!
    }
}
