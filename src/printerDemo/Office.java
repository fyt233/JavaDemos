package printerDemo;

public class Office {
    private PrinterInterface printer;
    public void setPrinter(PrinterInterface p)
    {
        this.printer = p;
    }

    public void print(String detail){
        printer.print(detail);
    }
}
