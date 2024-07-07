import javax.swing.*;
import java.awt.*;
public class FutureValueFrame extends JFrame {
     public FutureValueFrame() {
          setTitle("Future Value Calculator");
          setSize(267, 200);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          setVisible(true);
          centerWindow(this);
          JPanel panel = new FutureValuePanel();
          this.add(panel);
     }
     private void centerWindow(Window w)
    {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        setLocation((d.width-w.getWidth())/2,
        (d.height-w.getHeight())/2);
    }
}