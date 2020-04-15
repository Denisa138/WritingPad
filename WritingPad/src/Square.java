
public 
class Square implements Shape{
//implements Strategy{
   Point pUp;
   Point pDown;
   
   Square()
   { 	
   }
   
   public Square(double n1, double n2, double v1, double v2)
   {
	   this.pUp = new Point(n1,n2);
	   this.pDown = new Point(v1,v2);
   }
   
   public void setPoints(double v1, double v2,double v3, double v4)
   {
 	  pUp.setX(v1);
 	  pUp.setY(v2);
 	  pDown.setX(v3);
	  pDown.setY(v4);
   }
   @Override
   public Shape modifyShape(double n1, double n2, double v1, double v2)
   {
	   //Square c = new Square(0,0,0,0);
	   this.setPoints(n1, n2, v1, v2);
	   return this;
   }
@Override
   public Shape addShape(double n1, double n2, double v1, double v2) {
	  Square c = new Square(n1,n2,v1,v2);
	  return c;
}
    public double getX1()
{ 
	   return pUp.getX(); 
}

    public double getY1() 
{
	   return pUp.getY(); 
}
   public double getX2()
   { 
   	   return pDown.getX(); 
   }

      public double getY2() 
   {
   	   return pDown.getY(); 
   }

@Override
public String toString() {
    return "Square: pUp(" + pUp.getX() + ", " + pUp.getY() + ") " + "pDown(" + pDown.getX() + ", " + pDown.getY() + ")";
  }
}
