class YetersizBakiyeHatasi extends Exception {
    public YetersizBakiyeHatasi(String mesaj) {
        super(mesaj);
    }
}

public class BankAccount {
    private static int bankAccount = 0; // Sınıfa özgü sayıcı
    private String name;
    private double budget;

    // Constructor
    public BankAccount(String name, double budget) {
        this.budget = budget;
        this.name = name;
        bankAccount++;
    }

    // Getter
    public double getBudget() {
        return budget;
    }

    // Para ekleme metodu
    public void addMoney(double money) {
        budget += money;
    }

    // Para çekme metodu
    public void withdraw(double amount) throws YetersizBakiyeHatasi {
        if (amount > budget) {
            throw new YetersizBakiyeHatasi("Yetersiz bakiye.");
        } else {
            budget -= amount;
        }
    }

    // Banka hesabı sayısını alma
    public static int getBankAccount() {
        return bankAccount;
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            BankAccount account1 = new BankAccount("Taha", 500);
            System.out.println("Başlangıç bakiyesi: " + account1.getBudget());

            account1.addMoney(200);
            System.out.println("Güncel bakiye: " + account1.getBudget());

            account1.withdraw(800); // Bu işlem YetersizBakiyeHatasi hatasını tetikleyecek

        } catch (YetersizBakiyeHatasi e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("İşlem tamamlandı.");
        }

        System.out.println("Toplam Banka Hesabı Sayısı: " + BankAccount.getBankAccount());
    }
}
