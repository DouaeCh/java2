package packCircle;
public class Circle
{ 
 private double radius;
  String color;
 
//public Circle() 
{ radius = 1.0;color = "red"; } 
/*public Circle() 
{ radius = 1.0;color = "red"; }*/

public Circle() 
{ this(1.2); }

/*public Circle(double r)
{ this.radius = r; color = "red"; }*/

/*public Circle(double r)
{ this.radius = radius; color = "red"; }*/


public Circle(double radius) {
	this(radius,"red");
}

public Circle(double radius, String color) {
	
	this.radius = radius;
	this.color = color;
} 

public double getRadius() 
{ return radius; }

public double getArea() 
{ return radius*radius*Math.PI; }

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

@Override
public String toString() {
	return "Circle [radius=" + radius + ", color=" + color +" "+  "Area=" +getArea()+"]";
}
