package printerDemo;

public class BWPrinter implements PrinterInterface {
    public void print(String content){
        System.out.println("黑白打印:");
        System.out.println(content);
    }
}
