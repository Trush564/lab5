public class Clients implements Runnable{
    int suma;
    ATM atm;

    public Clients(int suma, ATM atm) {
        this.suma = suma;
        this.atm = atm;
    }

    @Override
    public void run() {
        atm.withdraw(suma);
    }
}

