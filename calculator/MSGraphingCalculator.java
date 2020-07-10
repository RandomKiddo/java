 
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
public class MSGraphingCalculator extends GraphingCalculator{
    private JFrame frame;
    private JPanel panel;
    /**
     * submit button on JPanel, is only public for ActionListener
     */
    public static JButton submit;
    /**
     * rescale button on JPanel, is only public for ActionListener
     */
    public static JButton rescale;
    private JSlider slider;
    /**
     * creates a GraphingCalculator instance that allows you to scale functions manually
     */
    public MSGraphingCalculator(){
        super();
        super.hide();
        frame = new JFrame();
        frame.setSize(700,100);
        frame.setTitle("Scaler <Scale - EXECUTE>");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel(new BorderLayout());
        JLabel label = new JLabel("Use Slider For Scaling : ");
        slider = new JSlider(1,1000,30);
        submit = new JButton("Continue <Scale>");
        Click click = new Click();
        submit.addActionListener(click);
        JLabel current = new JLabel("30");
        panel.add(label, BorderLayout.NORTH);
        panel.add(slider, BorderLayout.CENTER);
        panel.add(current, BorderLayout.EAST);
        panel.add(submit, BorderLayout.SOUTH);
        frame.add(panel);
        frame.setVisible(true);
        int copy = 30;
        while (!submit.getModel().isPressed()){
            if (slider.getValue() != copy){
                copy = slider.getValue();
                panel.remove(current);
                current = new JLabel("" + copy);
                panel.add(current, BorderLayout.EAST);
            }
            panel.revalidate();
            panel.repaint();
        }
        int factor = slider.getValue();
        GraphingCalculator.MANUALSCALE = true;
        GraphingCalculator.MSCALE = factor;
        super.show();
    }
}
class Click implements ActionListener{
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == MSGraphingCalculator.submit){
            MSGraphingCalculator.submit.setText("Scaling...");
        }
    }
}