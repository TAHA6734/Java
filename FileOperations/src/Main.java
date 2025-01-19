

public class Main {
    public static void main(String[] args) {
        // Worker nesnesi oluşturuluyor
        Worker worker1 = new Worker("Taha", 25, 5000.0);
        Worker worker2 = new Worker("Cenk", 21, 4000.0);

        // Nesneleri dosyaya kaydetme (Serileştirme)
        try (FileOutputStream fileOut = new FileOutputStream("workers.ser");
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {

            objectOut.writeObject(worker1);
            objectOut.writeObject(worker2);
            System.out.println("Nesneler dosyaya kaydedildi.");

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Nesneleri dosyadan okuma (Deserileştirme)
        try (FileInputStream fileIn = new FileInputStream("workers.ser");
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {

            Worker readWorker1 = (Worker) objectIn.readObject();
            Worker readWorker2 = (Worker) objectIn.readObject();
            System.out.println("Dosyadan okunan nesneler:");
            System.out.println(readWorker1);
            System.out.println(readWorker2);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
