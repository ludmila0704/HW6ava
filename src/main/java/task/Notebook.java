package task;

public class Notebook {
    private String noteboookName;
    private double weight;

    private double price;
    private double screenDiagonal;
    private String screenResolution;//разрешение экрана
    private int capacityRAM;
    private int capacitySSD;
    private String color;
    private String processorCPU;
    private boolean wifi; //false

    public Notebook(String noteboookName, double price, double screenDiagonal, String screenResolution, int capacityRAM,
                    int capacitySSD,String color,String processorCPU,double weight) {
        this.noteboookName = noteboookName;
        this.price = price;
        this.screenDiagonal = screenDiagonal;
        this.screenResolution=screenResolution;
        this.capacityRAM=capacityRAM;
        this.capacitySSD=capacitySSD;
        this.color = color;
        this.processorCPU = processorCPU;
        this.weight=weight;

    }
    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }
    public String getNoteboookName() {
        return noteboookName;
    }

    public void setNoteboookName(String noteboookName) {
        this.noteboookName = noteboookName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getScreenDiagonal() {
        return screenDiagonal;
    }

    public void setScreenDiagonal(double screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    public String getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public int getCapacityRAM() {
        return capacityRAM;
    }

    public void setCapacityRAM(int capacityRAM) {
        this.capacityRAM = capacityRAM;
    }

    public int getCapacitySSD() {
        return capacitySSD;
    }

    public void setCapacitySSD(int capacitySSD) {
        this.capacitySSD = capacitySSD;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProcessorCPU() {
        return processorCPU;
    }

    public void setProcessorCPU(String processorCPU) {
        this.processorCPU = processorCPU;
    }

    public void wifi() {
        if (wifi) {
            System.out.println("\nwi-fi: да");
        } else {
            System.out.println("\nwi-fi: нет");
        }
    }
    public void printInfo() {
        System.out.printf("Ноутбук %s . Характеристики:\nдиагональ: %s,\nразрешение экрана: %s ," +
                "\nОбъем оперативной памяти: %s Гб,\nОбъем SSD %s ГБ,\nцвет: %s," +
                "\nЦена:  %s руб.", noteboookName, screenDiagonal, screenResolution, capacityRAM, capacitySSD,color,price);
    }

    @Override
    public String toString() {
        return String.format("Ноутбук %s .Характеристики:\nдиагональ: %s,\nразрешение экрана: %s ," +
                "\nОбъем оперативной памяти: %s Гб,\nОбъем SSD %s ГБ,\ncolor: %s," +
                "\nЦена:  %s руб.", noteboookName, screenDiagonal, screenResolution, capacityRAM, capacitySSD,color,price);
    }




}
