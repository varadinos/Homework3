public class ComputerDemo {
    public static void main(String[] args) {
        Computer desktopPc = new Computer();
        Computer laptop = new Computer();

        //Defining desktopPc configuration:
        desktopPc.year = 2022;
        desktopPc.price = 2500;
        desktopPc.isNotebook = false;
        desktopPc.hardDiskMemory = 1024;
        desktopPc.freeMemory = 32000;
        desktopPc.operationSystem = "Windows 11";

        //Defining laptop configuration:
        laptop.year = 2020;
        laptop.price = 3500.50;
        laptop.isNotebook = true;
        laptop.hardDiskMemory = 512;
        laptop.freeMemory = 8000;
        laptop.operationSystem = "MacOS X";

        //Changing the OS of the PCs:
        desktopPc.changeOperationSystem("Windows 10");
        laptop.changeOperationSystem("MacOS X Bla Bla");

        //Changing free memory of the PCs:
        desktopPc.useMemory(16000);
        laptop.useMemory(8000.50);

        System.out.println("Desktop PC Configuration: ");
        System.out.println("Desktop PC price: " + desktopPc.price);
        System.out.println("Desktop PC year: " + desktopPc.year);
        System.out.println("isNotebook: " + desktopPc.isNotebook);
        System.out.println("Desktop PC HDD Memory: " + desktopPc.hardDiskMemory);
        System.out.println("Desktop PC Free Memory: " + desktopPc.freeMemory);
        System.out.println("Desktop PC OS Version: " + desktopPc.operationSystem);

        System.out.println("Laptop Configuration: ");
        System.out.println("Laptop price: " + laptop.price);
        System.out.println("Laptop year: " + laptop.year);
        System.out.println("isNotebook: " + laptop.isNotebook);
        System.out.println("Laptop HDD Memory: " + laptop.hardDiskMemory);
        System.out.println("Laptop Free Memory: " + laptop.freeMemory);
        System.out.println("Laptop OS Version: " + laptop.operationSystem);

        Computer newComputer = new Computer(2004, 2000,false,
                512,100, "Windows 7");

        Computer newLaptop = new Computer(2004, 2500, true, 1000, 512, "MacOSX");

        int comparePrice1 = newComputer.comparePrice(newLaptop);
        System.out.println(comparePrice1);

        int comparePrice2 = laptop.comparePrice(newLaptop);
        System.out.println(comparePrice2);

        int comparePrice3 = desktopPc.comparePrice(newComputer);
        System.out.println(comparePrice3);

    }
}
