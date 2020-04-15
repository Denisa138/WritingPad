//import com.sun.javafx.scene.paint.GradientUtils.Point;

public class Circle implements Shape{
//implements Strategy{
      double radius;
      Point p;
      
      Circle()
      { 	
    	  
      }
      
      Circle(double n1, double n2)
      {
    	  this.p = new Point(n1,n2);
    	  this.radius = p.getR();
      }
      
      public void setPoints(double v1, double v2)
      {
    	  p.setX(v1);
    	  p.setY(v2);
    	  radius = p.getR();
      }
      
      public double getX1()
      { 
   	   return p.getX(); 
      }
      
         public double getY1() 
      {
   	   return p.getY(); 
      }
     
         public double getR() 
      { 
   	   return p.getR(); 
      }
         
      @Override
      public Shape addShape(double n1, double n2, double v1, double v2)
      {
    	  Circle c = new Circle(n1,n2);
    	  return c;
      }
      
      @Override
      public Shape modifyShape(double n1, double n2, double v1, double v2)
      {
    	  //Circle c = new Circle(0,0);
          this.setPoints(n1, n2);
    	  return this;
      }
      
      @Override
      public String toString() {
	        return "Circle: p(" + p.getX() + ", " + p.getY() + ") " + "R(" + p.getR() +  ")";
}
      public double getX2()
      { 
   	   return 0; 
      }
      
         public double getY2() 
      {
   	   return 0; 
      }
   
}
