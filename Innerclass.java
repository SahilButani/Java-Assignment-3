class Outerclass1{
    class Innerclass1{
        Innerclass1(int num){
        System.out.println("Outerclass1");
        }
    }
}
class Outerclass2 extends Outerclass1{
    class Innerclass2 extends Innerclass1{
        Innerclass2(){
        super(3);}

    }
}
public class Innerclass{
    public static void main(String a[]){
        Outerclass2 o2=new Outerclass2();
        Outerclass2.Innerclass2 i2= o2.new Innerclass2();
    }
}