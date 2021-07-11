package Capg;
class Employee
{
 int a=20000,b=3000,c=2000;
 int d=a+b,e=a+c;
 public void salary()
 {
  System.out.println("Salary :" +a);
 }
 public void incentive()
 {
  System.out.println("incentive amount :" +b );
 }
 public void overtime()
 {
  System.out.println("overtime amount :" +c);
 }
}
class Manager extends Employee
{
 public void incentive()
 {
  System.out.println("incentive amount :" +b );
 }
 public void salary()
 {
  System.out.println("Total Salary=salary+incentive :" +d);
 }
}
class Labour extends Employee
{
 public void overtime()
 { 
  System.out.println("overtime amount :" +c);
 }
 public void salary()
 {
  System.out.println("Total Salary=salary+overtime :" +e);
 }
}
