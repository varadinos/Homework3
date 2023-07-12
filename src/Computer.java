public class Computer {
    int year;
    double price;
    boolean isNotebook;
    double hardDiskMemory;
    double freeMemory;
    String operationSystem;

    Computer (){
        this.isNotebook = false;
        this.operationSystem = "Win XP";
    }

    Computer (int year, double price, double hardDiskMemory, double freeMemory) {
        this();
        this.year = year;
        this.price = price;
        this.hardDiskMemory = hardDiskMemory;
        this.freeMemory = freeMemory;
    }

    Computer(int year, double price, boolean isNotebook, double hardDiskMemory,
             double freeMemory, String operationSystem) {
        this.year = year;
        this.price = price;
        this.isNotebook = isNotebook;
        this.hardDiskMemory = hardDiskMemory;
        this.freeMemory = freeMemory;
        this.operationSystem = operationSystem;
    }


    void changeOperationSystem(String newOperationSystem){
        operationSystem = newOperationSystem;
        System.out.println("Operation system changed to " + newOperationSystem);
    }

    void useMemory(double memory) {
        if (freeMemory < memory){
            System.out.println("Not enough free memory");
        } else {
            freeMemory = freeMemory - memory;
            System.out.println("You have " + freeMemory + " free memory!");
        }
    }

    int comparePrice (Computer otherComputer) {
        if (price == otherComputer.price) {
            System.out.println("Both computers have the same price.");
            return 0;
        } else if (price > otherComputer.price) {
            System.out.println("The current computer is priced lower than otherComputer.");
            return -1;
        } else {
            System.out.println("The current computer is priced higher than otherComputer.");
            return 1;
        }
    }


}
