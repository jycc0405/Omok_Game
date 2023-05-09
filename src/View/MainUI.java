package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainUI extends JFrame{
    private final String FRAME_TITLE="메인창";
    private int[] FRAME_SIZE={700,600};
    private int FRAME_LOC_X = 500;
    private int FRAME_LOC_Y=100;

    public MainUI(){
        setSize(FRAME_SIZE[0],FRAME_SIZE[1]);
        setTitle(FRAME_TITLE);
        setLocation(FRAME_LOC_X,FRAME_LOC_Y);

        JButton serverBt = new JButton("방 생성");
        JButton clientBt = new JButton("방 입장");

        serverBt.setBounds(180,250,100,45);
        clientBt.setBounds(400,250,100,45);

        //--------------------------------------------------------------------------------------------//

        JLabel background = new JLabel(new ImageIcon(getClass().getResource("/image/main.png")));
        add(background);

        background.add(serverBt);
        background.add(clientBt);

        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/image/black.png")));

        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
