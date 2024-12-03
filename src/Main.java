//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ATM atm= new ATM(1000);
        Thread client1=new Thread(new Clients(300, atm));
        Thread client2=new Thread(new Clients(500, atm));
        Thread client3=new Thread(new Clients(500, atm));
        client1.start();
        client2.start();
        client3.start();

    }
}