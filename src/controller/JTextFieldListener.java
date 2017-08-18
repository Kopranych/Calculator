package controller;

import veiw.CalcJTextField;
import veiw.CalcWindow;

import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 * Created by kopra on 16.08.2017.
 */
public class JTextFieldListener implements FocusListener {

    private CalcJTextField field = new CalcJTextField(50);

    public JTextFieldListener(CalcJTextField field){
        this.field = field;
    }

    @Override
    //метод выполняется при наведении курсора на рабочее поле
    public void focusGained(FocusEvent e) {
        if(field.getText().trim().equals(CalcWindow.INPUT_VALUE)){//
            field.setText("");
            field.setForeground(Color.BLACK);
        }

    }

    @Override
    //метод выполняется при снятии курсора с рабочего поля
    public void focusLost(FocusEvent e) {
        if(field.getText().trim().equals("")){//trim - подсказка остается даже если введены пробелы
            field.setText(CalcWindow.INPUT_VALUE);
            field.setForeground(Color.GRAY);
        }
    }
}
