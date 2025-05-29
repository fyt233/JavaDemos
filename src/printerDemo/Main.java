package printerDemo;

public class Main {
    public static void main(String[] args) {
        Office theOffice = new Office();

        theOffice.setPrinter(new BWPrinter());
        theOffice.print("Hello World");
        theOffice.setPrinter(new ColorPrinter());
        theOffice.print("Hello World");
    }

}
