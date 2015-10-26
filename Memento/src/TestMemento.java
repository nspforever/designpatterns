import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by nsp on 2015/10/25.
 */
public class TestMemento extends JFrame{
    public static  void main(String[] args) {
        new TestMemento();
    }

    private JButton saveBtn, undoBtn, redoBtn;

    private JTextArea theArticle = new JTextArea(40, 60);

    CareTaker careTaker = new CareTaker();

    Originator originator = new Originator();

    int savedFiles = 0, currentArticle = 0;

    public TestMemento() {
        this.setSize(750,780);
        this.setTitle("Memento Design Pattern");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("Article"));
        panel1.add(this.theArticle);

        ButtonListener saveListener = new ButtonListener();
        ButtonListener undoListener = new ButtonListener();
        ButtonListener redoListener = new ButtonListener();

        this.saveBtn = new JButton("Save");
        this.saveBtn.addActionListener(saveListener);

        this.undoBtn = new JButton("Undo");
        this.undoBtn.addActionListener(undoListener);

        this.redoBtn = new JButton("Redo");
        this.redoBtn.addActionListener(redoListener);

        panel1.add(saveBtn);
        panel1.add(undoBtn);
        panel1.add(redoBtn);

        this.add(panel1);
        this.setVisible(true);
    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == saveBtn) {
                String textInTextArea = theArticle.getText();

                originator.set(textInTextArea);
                careTaker.addMemento(originator.storeInMemento());
                savedFiles++;
                currentArticle++;

                System.out.println("Save files " + savedFiles);

                undoBtn.setEnabled(true);
            } else if (e.getSource() == undoBtn) {
                if (currentArticle >= 1) {
                    currentArticle--;
                    String textBoxString = originator.storeFromMemento(careTaker.getMemento(currentArticle));
                    theArticle.setText(textBoxString);

                    redoBtn.setEnabled(true);
                } else {
                    undoBtn.setEnabled(false);
                }
            } else if (e.getSource() == redoBtn) {
                if (savedFiles > currentArticle + 1) {
                    currentArticle++;
                    String textBoxString = originator.storeFromMemento(careTaker.getMemento(currentArticle));
                    theArticle.setText(textBoxString);
                    undoBtn.setEnabled(true);

                    if (currentArticle >= savedFiles) {
                        redoBtn.setEnabled(false);
                    }
                } else {
                    redoBtn.setEnabled(false);
                }

            }

        }
    }
}
