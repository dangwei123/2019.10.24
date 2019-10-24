/**
 * ClassName:Main
 * Package:PACKAGE_NAME
 * Description:
 *
 * @Date:2019/10/24 18:55
 * @Author:DangWei
 */
class Calculator{
    public int num1;
    public int num2;
    public int mySum(){
        return num1+num2;
    }
    public  int myMinus(){
        return num1-num2;
    }
    public int myMultiply(){
        return num1*num2;
    }
    public double myDivide(){
        return (double)num1/num2;
    }
}
class Person{
    private String name;
    private int age;
    private int high;
    private  String place;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public Person(String name,int age,int high){
        this.name=name;
        this.age=age;
        this.high=high;
    }
    public Person(String name,int age,int high,String place){
        this.name=name;
        this.age=age;
        this.high=high;
        this.place=place;
    }
    public void show(){
        System.out.println("name: "+name);
        System.out.println("age: "+age);
        System.out.println("high: "+high);
        System.out.println("place: "+place);
    }

}
class Swap{
    private int num1;
    private int num2;
    public Swap(int num1,int num2){
        int tmp=num1;
        this.num1=num2;
        this.num2=tmp;
    }
    public void show(){
        System.out.println("num1="+num1+"  num2="+num2);
    }

}
public class Main {
    public static void main(String[] args) {
        Swap swap=new Swap(10,200);
        swap.show();
        Person person1=new Person("liye",20);
        person1.show();
        System.out.println("========================");
        Person person2=new Person("liye",30,180);
        person2.show();
        System.out.println("========================");
        Person person3=new Person("liye",40,190,"宝鸡");
        person3.show();
        Calculator calculator=new Calculator();
        calculator.num1=79;
        calculator.num2=23;
        System.out.println(calculator.mySum());
        System.out.println(calculator.myMinus());
        System.out.println(calculator.myMultiply());
        System.out.println(calculator.myDivide());
    }
}
