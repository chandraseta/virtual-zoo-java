package virtualzoo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import virtualzoo.zoo.Zoo;
import virtualzoo.zoo.ZooDisplay;
import virtualzoo.zoo.ZooFood;
import virtualzoo.zoo.ZooReader;
import virtualzoo.zoo.ZooTour;

/**
 * Created by Rio on 3/29/2017.
 */
public class VirtualZooUI {

  private JTextPane Title;
  private JPanel BG;
  private JButton ExitButton;
  private JButton FoodInfoButton;
  private JButton TourButton;
  private JButton DisplayButton;
  /**
   * Zoo yang ada saat ini.
   */
  private Zoo zoo;

  public VirtualZooUI() throws IOException {
    zoo = new ZooReader("layout.in").getZoo();
    DisplayButton.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
        new ZooDisplay(zoo).displayZoo();
      }
    });
    TourButton.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
        new ZooTour(zoo);
      }
    });

    FoodInfoButton.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
        new ZooFood(zoo).displayTotalFood();
      }
    });
    ExitButton.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
        System.exit(0);
      }
    });
  }
}
