import java.util.ArrayList;
import java.util.Iterator;
public class Board{
   private ArrayList<Shape> shapes = new ArrayList<Shape>();
   
   public Board()
   {
   } 
   
   public void draw(double n1, double n2, double v1, double v2, Shape s)
   {
      shapes.add(s.addShape(n1, n2, v1, v2));
   }
   
   public void deleteShape(double n1, double n2, double v1, double v2)
   {
	   Iterator<Shape> itr = shapes.iterator();
	      while (itr.hasNext()) {
	          Shape nextItem = itr.next();
	          if(nextItem.getX1() == n1 && nextItem.getY1() == n2 &&nextItem.getX2() == v1 && nextItem.getY2() == v2)
	          {
	        	  itr.remove();
	          }
	      }
   }
   
   public void modify(Shape s,double n1, double n2, double v1, double v2)
   {
	   Iterator<Shape> itr = shapes.iterator();
	      while (itr.hasNext()) {
	          Shape nextItem = itr.next();
	          if (nextItem.getClass() == s.getClass()) {
	             int pos = shapes.indexOf(nextItem);
	             shapes.set(pos, nextItem.modifyShape(n1, n2, v1, v2));
	          }
	      }
   }
   
   public Shape searchShape(double n1, double n2, double v1, double v2)
   {
	   Iterator<Shape> itr = shapes.iterator();
	      while (itr.hasNext()) {
	          Shape nextItem = itr.next();
	          if(nextItem.getX1() == n1 && nextItem.getY1() == n2 &&nextItem.getX2() == v1 && nextItem.getY2() == v2)
	          {
	        	  return nextItem;
	          }
	      }
	      return null;
   }
   
   public ArrayList<Shape> returnShapes()
   {  
 	   return shapes;
   }
}
