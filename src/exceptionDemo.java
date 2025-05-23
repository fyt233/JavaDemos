import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.Socket;

public class exceptionDemo {
    public static void main(String[] args) {
        //1.打开一个文件
        try {
            FileReader fr = new FileReader("D:\\abc.txt");
        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
            System.out.println("文件不存在");
        }

        //2.连接一个端口
        try {
            Socket sk = new Socket("192.168.122.231",8080);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        //运行异常
        int a = 5/4;
        int b[]={1,2,34};
        System.out.println(b[b.length-1]);
    }

}
