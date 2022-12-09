package GUI;

import javax.naming.ldap.Control;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller extends JFrame {
    View view;
    Model model;
    Controller() {
        super("GUI");
        setSize(250,150);

        model = new Model();
        JPanel tmp = (JPanel) getContentPane();

        view = new View(tmp);
        view.setResultText("Enter your name");

        final Integer[] counter = {0};

        ActionListener eventListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (counter[0]++) {
                    case 0: {
                        model.setName(view.getInputText());
                        view.setResultText("Enter your age");
                        view.clearInput();
                        break;
                    }
                    case 1:{
                        model.setAge(Integer.parseInt(view.getInputText()));
                        view.setResultText("Enter your surname");
                        view.clearInput();
                        break;
                    }
                    case 2:{
                        model.setSurname(view.getInputText());
                        view.setResultText(model.toString());
                        view.clearInput();
                    }
                }
            }
        };

        view.setActionListener(eventListener);

        this.setVisible(true);
    }
}
