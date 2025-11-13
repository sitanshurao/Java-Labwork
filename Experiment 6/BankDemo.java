abstract class Bank {
    abstract int getBalance();
}

class BankA extends Bank {
    int getBalance() {
        return 100; 
    }
}

class BankB extends Bank {
    int getBalance() {
        return 150;
    }
}

class BankC extends Bank {
    int getBalance() {
        return 200; 
    }
}

public class BankDemo {
    public static void main(String[] args) {
        System.out.println("Sitanshu, 24csu323");
        BankA a = new BankA();
        BankB b = new BankB();
        BankC c = new BankC();
        
        System.out.println("Balance in Bank A: $" + a.getBalance());
        System.out.println("Balance in Bank B: $" + b.getBalance());
        System.out.println("Balance in Bank C: $" + c.getBalance());
    }
}
