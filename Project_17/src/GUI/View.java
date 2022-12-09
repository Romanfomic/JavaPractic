package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class View {

    JPanel mainFrame;

    JLabel textResult;
    JTextArea textInput;

    JButton btnUserInputs;

    JPanel[] panels = new JPanel[3];;

    View(JPanel mainFrame){
        this.mainFrame = mainFrame;
        mainFrame.setLayout(new GridLayout(3,1));

        for(int i = 0; i < 3; i++) {
            panels[i] = new JPanel();
        }

        for(int i = 0; i < 3; i++){
            this.mainFrame.add(panels[i]);
        }
        textResult = new JLabel();
        panels[0].add(textResult);

        textInput = new JTextArea();
        panels[1].add(textInput);

        btnUserInputs = new JButton("Enter");
        panels[2].add(btnUserInputs);
    }

    public void setActionListener(ActionListener eventListener){
        btnUserInputs.addActionListener(eventListener);
    }

    public String getInputText(){
        return textInput.getText().toString();
    }

    public void setResultText(String str){
        textResult.setText(str);
    }

    public void clearInput(){
        textInput.setText("");
    }

}
