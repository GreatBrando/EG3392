
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class BattleshipFrame extends JFrame {

  // Constants
  public static final int BOARD_ROW = 7;
  public static final int BOARD_COL = 7;

  // Array representing the playing grid
  private Cell cell_grid[][] = new Cell[BOARD_ROW][BOARD_COL];

  //JComponents
  private JLabel attempt_lbl;
  private int attempt_num = 0;
  
  //Ship Objects
  private Ship ship_one = new Ship();
  private Ship ship_two = new Ship();
  private Ship ship_three = new Ship();

  public BattleshipFrame() {

    setTitle("Battleship");
    getContentPane().setBackground(Color.LIGHT_GRAY);
    
    //GridBag Layout for Frame 
    setLayout(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.weightx = 1.0;
    gbc.weighty = 1.0;

    JPanel cell_panel = new JPanel(new GridLayout(BOARD_ROW, BOARD_COL));
    cell_panel.setPreferredSize(new Dimension(500, 500));
    gbc.gridx = 0;  // Set to Default so not to stretch on frame
    gbc.gridy = 0;
    gbc.anchor = GridBagConstraints.PAGE_START;  //Anchors the Board Frame to top of Frame
    add(cell_panel, gbc);

    attempt_lbl = new JLabel("Attempts: " + attempt_num);
    gbc.gridx = 0; // Not set to default so that scoreboard can fill up blank space 
    gbc.gridy = 1;
    gbc.anchor = GridBagConstraints.PAGE_END;  //Anchors the Attempts Tab to bottom of Frame 
    add(attempt_lbl, gbc);

    // Create Cell Grid
    for (int r = 0; r < BOARD_ROW; r++) {
      for (int c = 0; c < BOARD_COL; c++) {
        cell_grid[r][c] = new Cell();
        cell_grid[r][c].addMouseListener(new Listener(r, c));
        cell_panel.add(cell_grid[r][c]);
      }
    }

    // Add Ships To Random Cells
    ship_one.cells = addShip(1);
    ship_two.cells = addShip(2);
    ship_three.cells = addShip(3);

    setMinimumSize(new Dimension(500, 500));

    pack();
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  
  //Enumeration Class, Assign Default Value for Horizontal = 0 and Vertical = 1
  public enum Orientation { 
	  Horizontal, 
	  Vertical 
  }

  
  //ADD SHIP METHOD
  public Cell[] addShip(int size) {
	
	//Array that creates number of cells based off size
    Cell[] result = new Cell[size];

    // Select a random orientation for ship.
    Orientation o = Orientation.values()[(int)(Math.random() * 2)];

    // Select random starting points for our 'a' and 'b' coordinates.
    int start_x = ((int)(Math.random() * (BOARD_COL - size)));
    int start_y = ((int)(Math.random() * (BOARD_ROW - size)));

    // Loop through the grid
    for (int x = start_x; x < BOARD_COL; x++) {
      for (int y = start_y; y < BOARD_ROW; y++) {

        // Create a flag for the inner loop to modify
        // in case we need skip over cell.
        // EX: An Overlap or OOB
        boolean skip = false;

        // Check 'size' cells to determine if they are
        // occupied or if we go OOB.
        for (int c = 0; c < size; c++) {
          if (o.equals(Orientation.Vertical)) {
            if (((x + c) >= BOARD_COL) || cell_grid[x + c][y].isOccupied) {
              skip = true;
              break;
            }
          } else {
            if (((y + c) >= BOARD_ROW) || cell_grid[x][y + c].isOccupied) {
              skip = true;
              break;
            }
          }
        }

        // If we need to skip, move to the next cell
        if (skip)
          break;

        // Everything's good to go, let's occupy
        // the cells from earlier.
        for (int c = 0; c < size; c++) {
          if (o.equals(Orientation.Vertical)) {
            Cell cell = cell_grid[x + c][y];
            cell.isOccupied = true;
            result[c] = cell;
          } else {
            Cell cell = cell_grid[x][y + c];
            cell.isOccupied = true;
            result[c] = cell;
          }
        }

        // Our job here is done.
        return result;
      }
    }

    return result;
  }
  
  //Class for Ship Objects
  public static class Ship {
    public int times_hit;
    public Cell[] cells;
  }

  //Class for Cell Objects
  public static class Cell extends JPanel {
	
	//Colors for Cells
    public static final Color BG_NORMAL = Color.GRAY;
    public static final Color BG_HOVER = Color.LIGHT_GRAY;
    public static final Color BG_HIT = Color.WHITE;
    public static final Color BG_KILLED = Color.GREEN;
    public static final Color BG_MISS = Color.RED;

    //Variables for Occupations
    public boolean isOccupied = false;
    public boolean isHit = false;
    public boolean isKilled = false;

    public Cell() {
      setOpaque(true);
      setBackground(BG_NORMAL);
      setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }                           

  
  }

  // Mouse Movements and Calculations
  public class Listener implements MouseListener {
	
	 
    private Cell cell;

    public Listener(int row, int col) { 
    	cell = cell_grid[row][col]; 
    }

    public void mouseClicked(MouseEvent e) {
      
      //Don't Fill Cell if Already Occupied
      if (cell.isHit || cell.isKilled) {
        return;
      }
      
      //For Kill Method
      attempt_num++;
      attempt_lbl.setText("Attempts: " + attempt_num);

      cell.isHit = true;
      cell.setBackground(cell.isOccupied ? Cell.BG_HIT : Cell.BG_MISS);
      
      //For Each Array Looking for Ship One Cells 
      for (Cell c : ship_one.cells) {
        if (c == cell) {
          ship_one.times_hit++;
          break;
        }
      }

      if (ship_one.times_hit == 1)
        for (Cell c : ship_one.cells)
          c.setBackground(Cell.BG_KILLED);
      
      //For Each Array Looking for Ship Two Cells
      for (Cell c : ship_two.cells) {
        if (c == cell) {
          ship_two.times_hit++;
          break;
        }
      }

      if (ship_two.times_hit == 2)
        for (Cell c : ship_two.cells)
          c.setBackground(Cell.BG_KILLED);
      
      //For Each Loop - Cycling through array looking for Ship Three Cells 
      for (Cell c : ship_three.cells) {
        if (c == cell) {
          ship_three.times_hit++;
          break;
        }
      }

      if (ship_three.times_hit == 3)
        for (Cell c : ship_three.cells)
          c.setBackground(Cell.BG_KILLED);
     
      //For winning the game
      if(ship_one.times_hit == 1 && ship_two.times_hit == 2 && ship_three.times_hit == 3){
    	  attempt_lbl.setText("You win! Your total attempts is: " + attempt_num);
    	  return;
      }
      
      
    }

    public void mouseEntered(MouseEvent e) {

      if (cell.isHit) {
        return;
      }

      cell.setBackground(Cell.BG_HOVER);
    }

    public void mouseExited(MouseEvent e) {

      if (cell.isHit) {
        return;
      }

      cell.setBackground(Cell.BG_NORMAL);
    }

    public void mousePressed(MouseEvent e) {
    	
    }
    public void mouseReleased(MouseEvent e) {
    
    }
  
  }

  public static void main(String[] args) { 
	  
	  new BattleshipFrame(); 
  
  }

}

