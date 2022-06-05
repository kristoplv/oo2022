import javax.swing.*;
import java.awt.*;
import java.math.*;

public class SWINGCalculator {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(SWINGCalculator::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        Font f = new Font("SansSerif", Font.BOLD, 20);

        JTextField aField = new JTextField("2");
        aField.setHorizontalAlignment(SwingConstants.RIGHT);
        aField.setFont(f);

        JTextField bField = new JTextField("3");
        bField.setHorizontalAlignment(SwingConstants.RIGHT);
        bField.setFont(f);

        JTextField ansField = new JTextField();
        ansField.setHorizontalAlignment(SwingConstants.RIGHT);
        ansField.setFont(f);

        JComboBox<Operation> opCombo = new JComboBox<>();
        opCombo.setFont(f);
        opCombo.addItem(new Operation.OpAdd());
        opCombo.addItem(new Operation.OpSub());
        opCombo.addItem(new Operation.OpMul());
        opCombo.addItem(new Operation.OpDiv());

        JButton calcButton = new JButton("Calculate");
        calcButton.setFont(f);
        calcButton.addActionListener(e -> {
            double a = Integer.parseInt(aField.getText());
            double b = Integer.parseInt(bField.getText());
            ansField.setText("" + ((Operation) opCombo.getSelectedItem()).operate(a, b));
        });

        JFrame frame = new JFrame("SWINGCalculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container pane = frame.getContentPane();
        BoxLayout boxLayout = new BoxLayout(pane, BoxLayout.Y_AXIS);
        pane.setLayout(boxLayout);

        pane.add(aField);
        pane.add(bField);
        pane.add(opCombo);
        pane.add(calcButton);
        pane.add(ansField);

        frame.pack();
        frame.setVisible(true);
    }
}

   
