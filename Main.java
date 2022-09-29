class Animal extends Thread {

    public Animal(String name,int newPriority) {
        this.name = name;
        this.newPriority = newPriority;
    }
    int time = 8;
    int hour = 0;
    int newPriority;
    String name;
    public void run() {
        for(int i = 0; i<time;i++){
            hour++;
            Animal.currentThread().setPriority(newPriority);
            System.out.println(name + " спит: " + hour + " часов");
        }
    }
}
public class OwlOrLiza {
    public static void main(String args[]){
        Animal owl = new Animal("Сова",1);
        Animal liza = new Animal("Лиза",10);
        owl.start();
        liza.start();
    }
}
