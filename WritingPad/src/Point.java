
public final class Point{
	private double x;    
    private double y;    

    public Point(double x, double y)
    {
	        this.x = x;
	        this.y = y;
	}
    
     public double getX()
   { 
	   return x; 
   }
   
      public double getY() 
   {
	   return y; 
   }
  
      public double getR() 
   { 
	   return Math.sqrt(x*x + y*y); 
   }
  
    public void setY(double val)
    {
    	y = val;
    }
	 
    public void setX(double val)
    {
    	x = val;
    }
  public String toString() {
	        return "(" + x + ", " + y + ")";
  }
}
