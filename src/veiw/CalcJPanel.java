package veiw;

import javax.swing.*;
import java.awt.*;

/**
 * Created by kopra on 13.08.2017.
 */
public class CalcJPanel extends JPanel{
    public CalcJPanel(int width, int height){
        setBorder(BorderFactory.createEmptyBorder());//оформление вида панели
        setSize(width,height);
        setPreferredSize(new Dimension(200,100));//установить предпочтительный размер компонента
    }
}
