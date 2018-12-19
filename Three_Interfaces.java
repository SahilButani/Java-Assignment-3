interface  I1{
  void a1();
  void a2();
        }
interface  I2{
    void b1();
    void b2();
}

interface  I3{
    void c1();
    void c2();
}
interface I4 extends I1,I2,I3{
    void d1();
}
class Concrete{

}
public class Three_Interfaces extends Concrete implements I4{
    static void m1(I1 i1){}
    static void m2(I2 i2){}
    static void m3(I3 i3){}
    static void m4(I4 i4){}
    public void d1(){}
    public static void main(){
        Three_Interfaces ti=new Three_Interfaces();
        m1(ti);
        m2(ti);
        m3(ti);
        m4(ti);
    }
}
