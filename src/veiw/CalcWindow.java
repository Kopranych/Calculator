package veiw;

import com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel;
import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import controller.JButtonListener;
import controller.JTextFieldListener;

import javax.swing.*;
import java.awt.*;

/**
 * Created by kopra on 13.08.2017.
 */
public class CalcWindow extends JFrame {
    public static final int WIDH_CALC = 300;
    public static final int HEIGHT_CALC = 600;
    private static final int AMOUNT_PANEL = 3;
    private static final int HEIGHT_PANEL = HEIGHT_CALC/AMOUNT_PANEL;
    private static final int HEIGHT_TEXT_FIELD = HEIGHT_PANEL/2;
    public static final String INPUT_VALUE = "введите число";

    private JFrame window = new CalcJFrame("Калькулятор", WIDH_CALC, HEIGHT_CALC);

    private CalcJPanel panelInputValue = new CalcJPanel(WIDH_CALC, HEIGHT_PANEL);
    private CalcJPanel panelButton = new CalcJPanel(WIDH_CALC, HEIGHT_PANEL);
    private CalcJPanel panelButtonSame = new CalcJPanel(WIDH_CALC, HEIGHT_PANEL);
    private CalcJPanel panelOutputValue = new CalcJPanel(WIDH_CALC, HEIGHT_PANEL);

    private CalcJTextField fieldFirst = new CalcJTextField(50);
    private CalcJTextField fieldSecond = new CalcJTextField(50);
    private CalcJTextField fieldOutput = new CalcJTextField(100, Color.BLACK);

    private CalcJLabel label1 = new CalcJLabel("Число 1");
    private CalcJLabel label2 = new CalcJLabel("Число 2");
    private CalcJLabel label3 = new CalcJLabel("Результат");

    private CalcJButton[] buttons = new CalcJButton[5];


    public void initWindow(){

        try {
            try {// вызывается перед всеми
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());//задает отображение внутренних компонентов окна
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }


        buttons[0] = new CalcJButton("+", 10,10);
        buttons[1] = new CalcJButton("-", 10,10);
        buttons[2] = new CalcJButton("*", 10,10);
        buttons[3] = new CalcJButton("/", 10,10);
        buttons[4] = new CalcJButton("=",20 ,20);


        panelButton.setLayout(new GridLayout(2,2));
        panelInputValue.setLayout(new GridLayout(4,1));
        panelButtonSame.setLayout(new BorderLayout());
        panelOutputValue.setLayout(new GridLayout(2,1));


        for (int i = 0; i < buttons.length-1; i++) {
            panelButton.add(buttons[i]);
        }
        panelButtonSame.add(buttons[4]);

        addCalcJButtonListener();
        addCalcJTextField();

        panelInputValue.add(label1);
        panelInputValue.add(fieldFirst);
        panelInputValue.add(label2);
        panelInputValue.add(fieldSecond);

        fieldOutput.setEditable(false);//запрет на редактирование
        fieldOutput.setFocusable(false);//запрет на показ курсора
        panelOutputValue.add(label3);
        panelOutputValue.add(fieldOutput);

        window.setLayout(new GridLayout(4,1));

        window.getContentPane().add(panelInputValue);
        window.getContentPane().add(panelButton);
        window.getContentPane().add(panelButtonSame);
        window.getContentPane().add(panelOutputValue);
        window.setVisible(true);// вызывается после всех операций с окном
    }

    private void addCalcJButtonListener(){
        JButtonListener buttonListener = new JButtonListener(fieldFirst, fieldSecond, fieldOutput);
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].addActionListener(buttonListener);
        }
    }

    private void addCalcJTextField(){
        fieldFirst.addFocusListener(new JTextFieldListener(fieldFirst));
        fieldSecond.addFocusListener(new JTextFieldListener(fieldSecond));
    }
}
