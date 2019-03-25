import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 描述:
 * Swing中的观察者例子
 *
 * @author dong
 * @create 2019-03-25 21:47
 */
public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        //内部类
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }
    public void go(){
        frame = new JFrame();

        JButton button = new JButton("Should I do it?");
        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListener());
        frame.getContentPane().add(BorderLayout.CENTER, button);
    }
}

class AngelListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent event) {
        System.out.println("Don't do it, you might regret it!");
    }
}

class DevilListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Come on, do it!");
    }
}