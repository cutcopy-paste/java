import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class FactorialCalculatorAWT extends Frame implements ActionListener {
    Label inputLabel, resultLabel;
    TextField inputField, resultField;
    Button calculateButton;

    public FactorialCalculatorAWT() {
        setLayout(new FlowLayout());

        inputLabel = new Label("Enter a number:");
        add(inputLabel);

        inputField = new TextField(10);
        add(inputField);

        calculateButton = new Button("Calculate");
        add(calculateButton);
        calculateButton.addActionListener(this);

        resultLabel = new Label("Factorial:");
        add(resultLabel);

        resultField = new TextField(10);
        resultField.setEditable(false);
        add(resultField);

        setTitle("Factorial Calculator");
        setSize(250, 150);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            try {
                int number = Integer.parseInt(inputField.getText());
                long factorial = calculateFactorial(number);
                resultField.setText(String.valueOf(factorial));

                // Write result to text file
                FileWriter writer = new FileWriter("factorial_result.txt");
                writer.write("Factorial of " + number + " is " + factorial);
                writer.close();
            } catch (NumberFormatException | IOException ex) {
                resultField.setText("Invalid Input");
            }
        }
    }

    private long calculateFactorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * calculateFactorial(n - 1);
    }

    public static void main(String[] args) {
        new FactorialCalculatorAWT();
    }
}
