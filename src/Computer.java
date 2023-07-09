public class Computer {
    int year;
    double price;
    boolean isNotebook;
    double hardDiskMemory;
    double freeMemory;
    String operationSystem;


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

}
