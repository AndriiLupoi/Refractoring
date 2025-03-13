public class Main {
    public static void main(String[] args) {
        HumanImb humanImb = new HumanImb(80, 1.52);
        System.out.println(humanImb.getBmiCategory());
    }
}

class HumanImb {
    private double weight;  // Вага людини
    private double height;  // Зріст людини

    public HumanImb(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateBmi() {
        return weight / (height * height);
    }

    public String getBmiCategory() {
        double bmi = calculateBmi();
        if (bmi < 18.5) {
            return "Deficit";
        } else if (bmi < 25) {
            return "Norm";
        } else if (bmi < 30) {
            return "Warning!";
        } else {
            return "Fat";
        }
    }
}