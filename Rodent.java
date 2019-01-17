public abstract class Rodent {
    public Rodent(){
        System.out.println("Parent class-Rodent");
    }
    public abstract void eats();
    public abstract void colour();
}
class Mouse extends Rodent{
    Mouse(){
        System.out.println("Child class-Mouse");
    }
    public void eats(){
        System.out.println("Mouse eats Grass");
    }
    public void colour(){
        System.out.println("Colour of Mouse is Black");
    }

}
class Gerbil extends Rodent{
    Gerbil(){
        System.out.println("Child class-Gerbil");
    }
    public void eats(){
        System.out.println("Gerbil eats Bark and Cones");
    }
    public void colour(){
        System.out.println("colour of Gerbil is Grey and White");
    }

}
class Hamster extends Rodent{
    Hamster(){
        System.out.println("Child class-Hamster");
    }
    public void eats(){
        System.out.println("Hamster eats Grains");
    }
    public void colour(){
        System.out.println("colour of Hamster is Brown");
    }
}
class Main{
    public static void main(String a[]){
        Rodent rodents_array[]=new Rodent[4];
        rodents_array[0]=new Mouse();
        rodents_array[1]=new Gerbil();
        rodents_array[2]=new Mouse();
        rodents_array[3]=new Hamster();
        rodents_array[0].eats();
        rodents_array[1].colour();
        rodents_array[2].eats();
        rodents_array[3].colour();
    }
}
