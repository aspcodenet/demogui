package se.systementor;
import java.awt.*;
import java.awt.event.*;

public class EntryForm {
    public void show()    {
        Frame frm=new Frame("Formuläret");
        Label lblResult = new Label();
        frm.add(lblResult);

        frm.setSize(350,200);
        frm.setVisible(true);
        frm.addWindowListener(new WindowAdapter(){
                    public void windowClosing(WindowEvent e){
                        System.exit(0);
                    }
                });

        Panel p = new Panel();
        Panel p1 = new Panel();
        Label jFirstName = new Label("First Name");
        TextField lFirstName = new TextField(20);
        Label jLastName =new Label("Last Name");
        TextField lLastName=new TextField(20);
        p.setLayout(new GridLayout(3,1));
        p.add(jFirstName);
        p.add(lFirstName);
        p.add(jLastName);
        p.add(lLastName);
        
        Button submitButton=new Button("Submit");
        p.add(submitButton);
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lblResult.setText("Du skrev in: " + lLastName.getText() + ", " + lFirstName.getText());
            }
        });        
        p1.add(p);

        frm.add(p1,BorderLayout.NORTH);        
    }
}
