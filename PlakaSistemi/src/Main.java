import java.util.*;

class VehiclePlate implements Comparable<VehiclePlate> {
    private int cityCode; // 1-81
    private String letters; // 1-3 letters
    private int number; // 0-999

    public VehiclePlate(int cityCode, String letters, int number) {
        if (cityCode < 1 || cityCode > 81) {
            throw new IllegalArgumentException("Invalid city code. Must be between 1 and 81.");
        }
        if (!letters.matches("[A-Z]{1,3}")) {
            throw new IllegalArgumentException("Invalid letters. Must contain 1 to 3 uppercase letters.");
        }
        if (number < 0 || number > 999) {
            throw new IllegalArgumentException("Invalid number. Must be between 0 and 999.");
        }
        this.cityCode = cityCode;
        this.letters = letters;
        this.number = number;
    }

    public int getCityCode() {
        return cityCode;
    }

    public String getLetters() {
        return letters;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public int compareTo(VehiclePlate other) {
        return Integer.compare(this.cityCode, other.cityCode);
    }

    @Override
    public String toString() {
        return cityCode + " " + letters + " " + number;
    }
}

class VehiclePlateComparator implements Comparator<VehiclePlate> {
    @Override
    public int compare(VehiclePlate v1, VehiclePlate v2) {
        int cityComparison = Integer.compare(v1.getCityCode(), v2.getCityCode());
        if (cityComparison != 0) {
            return cityComparison;
        }

        String letters1 = v1.getLetters();
        String letters2 = v2.getLetters();
        char secondLetter1 = letters1.length() > 1 ? letters1.charAt(1) : letters1.charAt(0);
        char secondLetter2 = letters2.length() > 1 ? letters2.charAt(1) : letters2.charAt(0);
        int letterComparison = Character.compare(secondLetter1, secondLetter2);
        if (letterComparison != 0) {
            return letterComparison;
        }

        return Integer.compare(v1.getNumber(), v2.getNumber());
    }
}

public class Main {
    public static void main(String[] args) {
        List<VehiclePlate> plates = new ArrayList<>();

        try {
            plates.add(new VehiclePlate(34, "ABC", 123));
            plates.add(new VehiclePlate(6, "AB", 45));
            plates.add(new VehiclePlate(34, "AA", 999));
            plates.add(new VehiclePlate(6, "B", 12));
            plates.add(new VehiclePlate(34, "AC", 100));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Sort using Comparator (city code -> second letter -> number)
        plates.sort(new VehiclePlateComparator());

        // Print sorted plates
        for (VehiclePlate plate : plates) {
            System.out.println(plate);
        }
    }
}
