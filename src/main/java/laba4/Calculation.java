package laba4;

public abstract class Calculation {
private double side1;
private double side2;
public double getside1() {
return side1;
}
public void setside1(double side1) {
this.side1 = side1;
}
public double getside2() {
return side2;
}
public void setside2(double side2) {
this.side2 = side2;
}

public abstract double calculate(double a, double b);
}