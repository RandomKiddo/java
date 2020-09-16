import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.util.*;
//HTML CODE FOR JAVADOC
/**
 * @author Neil Ghugare
 * @version Beta 1.0.0
 * <br />
 * <br />
 * Running The Calculator
 * <br />
 * Initialize It:
 * <br />
 * <code>CalculatorApp calculator = new CalculatorApp();</code>
 * <br />
 * Or Literal Run It:
 * <br />
 * <code>new CalculatorApp();</code>
 * <br />
 * <br />
 */
public class CalculatorApp{
    private JFrame frame;
    private JLabel label;
    /**
     * Creates and runs a new Calculator GUI
     */
    public CalculatorApp(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Calculator.java");
        frame.setSize(300, 400);
        frame.setPreferredSize(new Dimension(300, 400));
        frame.setLayout(new GridLayout(6,4));
        for (int i = 0; i < 3; i++){
            frame.add(new JPanel());
        }
        label = new JLabel();
        label.setHorizontalAlignment(SwingConstants.RIGHT);
        label.setBorder(new EmptyBorder(0, 10, 0, 10));
        JButton button = null;
        ArrayList<JButton> buttons = new ArrayList<>();
        frame.add(label);
        button = new JButton("Clear");
        button.addActionListener(new ClearListener(this.label));
        frame.add(button);
        button = new JButton("+/-");
        button.addActionListener(new SignListener(this.label));
        frame.add(button);
        button = new JButton("%");
        button.addActionListener(new PercentListener(this.label));
        frame.add(button);
        button = new JButton("/");
        button.addActionListener(new OperationListener(this.label));
        frame.add(button);
        buttons.add(button);
        button = new JButton("7");
        button.addActionListener(new TextListener(this.label));
        frame.add(button);
        button = new JButton("8");
        button.addActionListener(new TextListener(this.label));
        frame.add(button);
        button = new JButton("9");
        button.addActionListener(new TextListener(this.label));
        frame.add(button);
        button = new JButton("*");
        button.addActionListener(new OperationListener(this.label));
        frame.add(button);
        buttons.add(button);
        button = new JButton("4");
        button.addActionListener(new TextListener(this.label));
        frame.add(button);
        button = new JButton("5");
        button.addActionListener(new TextListener(this.label));
        frame.add(button);
        button = new JButton("6");
        button.addActionListener(new TextListener(this.label));
        frame.add(button);
        button = new JButton("-");
        button.addActionListener(new OperationListener(this.label));
        frame.add(button);
        buttons.add(button);
        button = new JButton("1");
        button.addActionListener(new TextListener(this.label));
        frame.add(button);
        button = new JButton("2");
        button.addActionListener(new TextListener(this.label));
        frame.add(button);
        button = new JButton("3");
        button.addActionListener(new TextListener(this.label));
        frame.add(button);
        button = new JButton("+");
        button.addActionListener(new OperationListener(this.label));
        frame.add(button);
        buttons.add(button);
        button = new JButton("0");
        button.addActionListener(new TextListener(this.label));
        frame.add(button);
        button = new JButton(".");
        button.addActionListener(new DecimalListener(this.label));
        frame.add(button);
        frame.add(new JPanel());
        button = new JButton("=");
        button.addActionListener(new EqualsListener(this.label, buttons));
        frame.add(button);
        frame.setVisible(true);
    }
    /**
     * Listener for clicking number buttons
     */
    class TextListener implements ActionListener{
        private JLabel label;
        /**
         * Initializes a TextListener
         * @param l JLabel to be changed in actionPerformed()
         */
        public TextListener(JLabel l){
            this.label = l;
        }
        /**
         * Changes label field when a number button is clicked
         * @param e ActionEvent that is used internally when a button is clicked 
         */
        @Override
        public void actionPerformed(ActionEvent e){
            this.label.setText(this.label.getText() + e.getActionCommand());
        }
    }
    /**
     * Listener for a sign change (positive to negative or negative to positive)
     */
    class SignListener implements ActionListener{
        private JLabel label;
        /**
         * Initializes a SignListener
         * @param l JLabel to be changed in actionPerformed()
         */
        public SignListener(JLabel l){
            this.label = l;
        }
        /**
         * Changes label field when the sign button is pressed
         * @param e ActionEvent that is used internally when a button is clicked 
         */
        @Override
        public void actionPerformed(ActionEvent e){
            String text = this.label.getText();
            if (text.indexOf("-") == -1){
                text = "-" + text;
            } else {
                text = text.substring(1);
            }
            this.label.setText(text);
        }
    }
    /**
     * Listener for creating decimals
     */
    class DecimalListener implements ActionListener{
        private JLabel label;
        /**
         * Initializes a DecimalListener
         * @param l JLabel to be changed in actionPerformed()
         */
        public DecimalListener(JLabel l){
            this.label = l;
        }
        /**
         * Creates a decimal number from the current number
         * @param e ActionEvent that is used internally when a button is clicked
         */
        @Override
        public void actionPerformed(ActionEvent e){
            String text = this.label.getText();
            if (text == null || text.length() == 0){
                this.label.setText("0.");
            } else {
                this.label.setText(text + ".");
            }
        }
    }
    /**
     * Listener for clearing the text field
     */
    class ClearListener implements ActionListener{
        protected JLabel label;
        /**
         * Initializes a ClearListener
         * @param l JLabel to be changed in actionPerformed()
         */
        public ClearListener(JLabel l){
            this.label = l;
        }
        /**
         * Changes label field when the clear button is pressed
         * @param e ActionEvent that is used internally when a button is clicked 
         */
        @Override
        public void actionPerformed(ActionEvent e){
            this.label.setText("");
        }
    }
    /**
     * Listener for creating percentages
     */
    class PercentListener implements ActionListener{
        private JLabel label;
        /**
         * Initializes a PercentListener
         * @param l JLabel to be changed in actionPerformed()
         */
        public PercentListener(JLabel l){
            this.label = l;
        }
        /**
         * Changes current number in label field to a percentage decimal
         * @param e ActionEvent that is used internally when a button is clicked
         */
        @Override
        public void actionPerformed(ActionEvent e){
            String text = this.label.getText();
            if (text == null || text.length() < 1){
                return;
            }
            Double value = Double.parseDouble(text);
            value /= 100;
            this.label.setText(value.toString());
        }
    }
    /**
     * Listener for pressing equals / getting results
     */
    class EqualsListener extends OperationListener implements ActionListener{
        private ArrayList<JButton> buttons;
        /**
         * Initializes an EqualListener
         * @param l JLabel to be changed in actionPerformed()
         * @param list ArrayList of OperationListener ActionListener's To Perform Operations
         */
        public EqualsListener(JLabel l, ArrayList<JButton> list){
            super(l);
            buttons = list;
        }
        /**
         * Changes label field and stores a response for later
         * @param e ActionEvent that is used internally when a button is clicked
         */
        @Override
        public void actionPerformed(ActionEvent e){
            JButton jbutton = null;
            OperationListener op = null;
            for (JButton button : buttons){
                ActionListener[] listeners = button.getActionListeners();
                OperationListener o = null;
                try{
                    o = (OperationListener)listeners[0];
                } catch (ClassCastException exception){
                    return;
                }
                if (o != null && o.stored != null){
                    op = o;
                    jbutton = button;
                    break;
                }
            }
            if (op == null || jbutton == null){
                return;
            }
            double first = Double.parseDouble(op.stored);
            double second = Double.parseDouble(this.label.getText());
            if (jbutton.getText().indexOf("+") > -1){
                Double result = first + second;
                String substring = result.toString().substring(result.toString().length() - 2);
                if (substring.equals(".0")){
                    Integer integer = result.intValue();
                    this.label.setText(integer.toString());
                } else {
                    this.label.setText(result.toString());
                }
            } else if (jbutton.getText().indexOf("-") > -1){
                Double result = first - second;
                String substring = result.toString().substring(result.toString().length() - 2);
                if (substring.equals(".0")){
                    Integer integer = result.intValue();
                    this.label.setText(integer.toString());
                } else {
                    this.label.setText(result.toString());
                }
            } else if (jbutton.getText().indexOf("*") > -1){
                Double result = first * second;
                String substring = result.toString().substring(result.toString().length() - 2);
                if (substring.equals(".0")){
                    Integer integer = result.intValue();
                    this.label.setText(integer.toString());
                } else {
                    this.label.setText(result.toString());
                }
            } else if (jbutton.getText().indexOf("/") > -1){
                Double result = first / second;
                String substring = result.toString().substring(result.toString().length() - 2);
                if (substring.equals(".0")){
                    Integer integer = result.intValue();
                    this.label.setText(integer.toString());
                } else {
                    this.label.setText(result.toString());
                }
            }
            op.stored = null;
        }
    }
    /**
     * Listener for doing math operations
     */
    class OperationListener extends ClearListener implements ActionListener{
        protected String stored;
        /**
         * Initializes an OperationListener
         * @param l JLabel to be changed in actionPerformed()
         */
        public OperationListener(JLabel l){
            super(l);
        }
        /**
         * Changes label field and stores a response for later
         * @param e ActionEvent that is used internally when a button is clicked
         */
        @Override
        public void actionPerformed(ActionEvent e){
            stored = this.label.getText();
            super.actionPerformed(e);
        }
    }
    /**
     * Can be used to run the calculator
     * @param args Internal arguments for Java main method
     */
    public static final void main(String [] args){
        new CalculatorApp();
    }
}