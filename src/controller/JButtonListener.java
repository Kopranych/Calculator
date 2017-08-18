package controller;

import module.Calculation;
import veiw.CalcJButton;
import veiw.CalcJPanel;
import veiw.CalcJTextField;
import veiw.CalcWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by kopra on 16.08.2017.
 */
public class JButtonListener implements ActionListener{

    private CalcJTextField firstField;
    private CalcJTextField secondField;
    private CalcJTextField resultField;
    private static double c = 0;

    public JButtonListener(CalcJTextField firstField, CalcJTextField secondField, CalcJTextField resultField){
        this.firstField = firstField;
        this.secondField = secondField;
        this.resultField = resultField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(! (e.getSource() instanceof JButton)){
            return;
        }

        CalcJButton tempButton = (CalcJButton)e.getSource();

        final double a = Double.parseDouble(firstField.getText());
        final double b = Double.parseDouble(secondField.getText());


        if (tempButton.getActionCommand().equals("+"))
            c = Calculation.addition(a,b);
        else if(tempButton.getActionCommand().equals("-"))
            c = Calculation.subtraction(a,b);
        else if(tempButton.getActionCommand().equals("*"))
            c = Calculation.multiplication(a,b);
        else if(tempButton.getActionCommand().equals("/"))
            c = Calculation.division(a,b);
        else if(tempButton.getActionCommand().equals("="))
            resultField.setText(String.valueOf(c));
    }
}
