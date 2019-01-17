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
        Cycle[] cycles=new Cycle[3];
        cycles[0]=uni;
        cycles[1]=bi;
        cycles[2]=tri;
        for(Cycle c:cycles){
            c.balance();
        }
        uni.balance();
        bi.balance();
        tri.balance();

    }
}
