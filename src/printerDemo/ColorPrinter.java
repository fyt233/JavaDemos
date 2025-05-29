package printerDemo;

public class ColorPrinter implements PrinterInterface{
    public void print(String content)
    {
        System.out.println("彩色打印:" );
        System.out.println(content);
    }
}
