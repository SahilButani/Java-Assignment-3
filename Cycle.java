import sun.util.locale.UnicodeLocaleExtension;

public class Cycle {
}
class Unicycle extends Cycle{
    public void balance(){
        System.out.println("Should balance the unicycle");
    }
}
class Bicycle extends Cycle{
    public void balance(){
        System.out.println("Should balance the Bicycle");
    }
}
class Tricycle extends Cycle{

}
class Test{
    public static void main(String a[]){
        Unicycle uni= new Unicycle();
        Bicycle bi=new Bicycle();
        Tricycle tri=new Tricycle();
        Cycle[] cy=new Cycle[3];
        cy[0]=uni;
        cy[1]=bi;
        cy[2]=tri;
        for(Cycle c:cy){
            c.balance();
        }
        uni.balance();
        bi.balance();
        tri.balance();

    }
}