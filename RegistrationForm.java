import java.awt.*;
import java.awt.event.*;

class RegistrationForm {
    public static void main(String[] args) {
        Frame frame = new Frame("Registration Form");

        Label nameLabel = new Label("Name:");
        Label ageLabel = new Label("Age:");
        Label emailLabel = new Label("Email:");

        TextField nameField = new TextField();
        TextField ageField = new TextField();
        TextField emailField = new TextField();

        Button submitButton = new Button("Submit");

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Name: " + nameField.getText());
                System.out.println("Age: " + ageField.getText());
                System.out.println("Email: " + emailField.getText());
            }
        });

        frame.setLayout(new GridLayout(4, 2));
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(ageLabel);
        frame.add(ageField);
        frame.add(emailLabel);
        frame.add(emailField);
        frame.add(submitButton);

        frame.setSize(800, 1200);
        frame.setVisible(true);
    }
}