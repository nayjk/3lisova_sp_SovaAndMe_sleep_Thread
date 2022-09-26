public class Main{
    public static void main(String[] args) {
        Owl test1 = new Owl();
        test1.start();
        Liza test2 = new Liza();
        test2.start();
    }
}
class Owl extends Thread{
    public void run(){
        for (int i = 1; i < 9; i++){
            System.out.println("Сова спит " + i + " часов");
        }
    }
}class Liza extends Thread{
    public void run(){
        for (int i = 1; i < 6; i++){
            System.out.println("Лиза спит " + i + " часов");
        }
    }
}
