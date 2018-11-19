class Employee {

  private double payRate = 0;
  private double hoursWorked = 0;
  private double grossPay = 0;
    
  public Employee() {
    payRate = 0.0;
    hoursWorked = 0.0;
    grossPay = 0.0;
  }

  public double getPayRate() {
    return payRate;
  }
 
  public double getHoursWorked() {
    return hoursWorked;
  }
 
  public double getGrossPay () {
    return grossPay;
  }
 
  public void setPayRate(double newPayRate) {
    if (newPayRate > 0) {
      payRate = newPayRate;
    }
    else {
      System.out.println(newPayRate + " is not a valid pay rate.");
      payRate = 0;
    }
  }

  public void setHoursWorked(double newHoursWorked) {
    if (newHoursWorked > 0) {
      hoursWorked = newHoursWorked;
    }
    else {
      System.out.println(newHoursWorked + " is not a valid value for hours worked.");
      hoursWorked = 0;
    }
  }
 
  public void computeGrossPay() {
    grossPay = payRate * hoursWorked;
    System.out.println("Gross pay is " + grossPay);
  }
}