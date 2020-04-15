import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.ace.encoder.impl.TextStreamEncoder;
import com.ace.firstsampleproject.*;

public class BoardApp {
	
private static Scanner input;

public static void main(String[] args) {
        
	 System.out.println(" === BoardApplication ====");
     Menu mainMenu = initializeMainMenu();           
     mainMenu.execute();
    }

private static Menu initializeMainMenu()
{
	Shape s1 = new Circle();
	Shape s2 = new Square();
    Board board = new Board();
    ArrayList<IMenuItem> mainMenuItems = new ArrayList();
    ArrayList<IMenuItem> drawMenuItems = new ArrayList();
   
    drawMenuItems.add(new MenuItem("Circle", 
                                        1, 
                                        (parameters)->{
                                        	 drawCircle(s1,board);      
                                        }));
            
    drawMenuItems.add(new MenuItem("Square", 
                                        2, 
                                        (parameters)->{
                                        	  drawSquare(s2,board);
                                        }));
   

    mainMenuItems.add(new Menu("Add", 1, drawMenuItems));
    mainMenuItems.add(new MenuItem("Delete", 2,  (parameters)->{
        deleteShape(board);}));        
    mainMenuItems.add(new MenuItem("Modify", 3, (parameters)->{
    	modifyShape(board);
    }));
    mainMenuItems.add(new MenuItem("View board", 4,(parameters)->{
    	System.out.println(board.returnShapes().toString());
    })); 
    
    return new Menu("Main Menu", 0, mainMenuItems); 
}

private static void drawCircle(Shape s1,Board board)
{
	System.out.println("Enter parameters to draw a circle:");
	double x = readParameters();
	double y = readParameters();
	 board.draw(x, y, 0, 0, s1);
}
private static void drawSquare(Shape s2,Board board)
{
	System.out.println("Enter parameters to draw a square:");
	double x1 = readParameters();
	double y1 = readParameters();
	double x2 = readParameters();
	double y2 = readParameters();
	 board.draw(x1, y1, x2, y2, s2);
}

private static void deleteShape(Board board)
{
	System.out.println("Enter parameters of the shape that you want to delete:");
	double x1 = readParameters();
	double y1 = readParameters();
	double x2 = readParameters();
	double y2 = readParameters();
	board.deleteShape(x1, y1, x2, y2);
}

private static void modifyShape(Board board)
{   
	System.out.println("Enter parameters for searching a certain shape:");
	double x1 = readParameters();
	double y1 = readParameters();
	double x2 = readParameters();
	double y2 = readParameters();
	System.out.println("Enter parameters for the modified shape:");
	Shape s = board.searchShape(x1, y1, x2, y2);
	board.modify(s, readParameters(), readParameters(), readParameters(), readParameters());
}
private static double readParameters()
{
	input = new Scanner(System.in);
	double option = input.nextDouble();
	return option;
}
}


