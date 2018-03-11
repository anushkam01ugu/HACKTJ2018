import javax.swing.JFrame;
public class FoodDriver
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("FoodGenie");
      frame.setSize(800, 400);
      frame.setLocation(0, 0);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      FoodPanel p = new FoodPanel();
      frame.setContentPane(p);
      p.requestFocus();
      frame.setVisible(true);
   }
}