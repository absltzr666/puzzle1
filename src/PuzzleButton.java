import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PuzzleButton extends JButton {

    private boolean isLastButton;

    public PuzzleButton() {
        super();
        initUI();
    }

    public PuzzleButton(Image i) {
        super(new ImageIcon(i));
        initUI();
    }

    private void initUI() {
        isLastButton = false;

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                setBorder(BorderFactory.createLineBorder(Color.BLUE));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                setBorder(BorderFactory.createLineBorder(Color.RED));
            }
        });
    }

    public boolean isLastButton() {return isLastButton;}
    public void setLastButton(boolean isLastButton) {this.isLastButton = isLastButton;}
}

