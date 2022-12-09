import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Animation extends JFrame {
    JLabel picture = new JLabel("");
    String[] frames = new String[4];
    JPanel[] pnl = new JPanel[2];
    Font fnt = new Font("Times new roman", Font.BOLD, 40);

    public Animation(){
        super("Loading");
        setVisible(true);
        setLayout(new GridLayout(3,3));
        setSize(500, 500);
        picture.setFont(fnt);

        for(int i = 0 ; i < pnl.length ; i++)
        {
            pnl[i] = new JPanel();
            add(pnl[i]);
        }
        pnl[0].add(picture);

        frames[0] = "-";
        frames[1] = "\\";
        frames[2] = "|";
        frames[3] = "/";
    }
    public void Move(){
        int frameNumber = 0;
        while(true) {
            frameNumber = frameNumber%4;
            picture.setText(frames[frameNumber]);
            frameNumber++;
            try{
                Thread.sleep(200);
            }catch (InterruptedException ie){
                Thread.currentThread().interrupt();
            }
        }
    }

}
