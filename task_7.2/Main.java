import java.io.*;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

/*
 * task_7.2 - рабочие ip адреса необходимо складывать в файл good.txt
 *  */

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("/Users/andrejberg/Desktop/IT/Java/ip.txt");
            int i;
            String proxy = "";
            while ((i=fin.read()) != -1){
                if(i==13) continue;
                else if(i==10){
                    String ip = proxy.split(":")[0];
                    String port=proxy.split(":")[1];
                    //Способ 3
//                    Thread thread = new Thread(new Runnable() {
//                        @Override
//                        public void run() {
//                            System.out.println(checkProxy(ip,Integer.parseInt(port)));
//                        }
//                    });
//                    thread.start();
                    //Способ 1
                    //MyThread myThread = new MyThread(ip,Integer.parseInt(port));
                    //myThread.start();
                    //Способ 2
                    Thread myRunnableThread = new Thread(new MyRunnableThread(ip,Integer.parseInt(port)));
                    myRunnableThread.start();
                    proxy ="";
                }else if(i != 9){
                    proxy += (char)i;
                }else{
                    proxy += ":";
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*try {
            FileOutputStream fout = new FileOutputStream("C:\\java\\test.txt");
            String text = "Hello!";
            byte[] bytes = text.getBytes(StandardCharsets.UTF_8);
            fout.write(bytes);
            fout.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }

    public static String checkProxy(String ip, int port){
        try {
            Proxy proxy = new Proxy(Proxy.Type.HTTP,new InetSocketAddress(ip, port));
            URLConnection urlConnection = new URL("https://vozhzhaev.ru/test.php").openConnection(proxy);
            InputStream is = urlConnection.getInputStream();
            InputStreamReader reader = new InputStreamReader(is);
            int rc;
            StringBuilder sb = new StringBuilder();
            while ((rc = reader.read()) != -1){
                sb.append((char)rc);
            }
            ///task_7.2 - рабочие ip адреса необходимо складывать в файл good.txt/////////////////////
            FileWriter writer = new FileWriter("/Users/andrejberg/Desktop/IT/Java/good.txt", true);//объект ддля записи в файл
            writer.write(ip+":"+port +"\n");
            writer.close();

            return "IP: "+ip+":"+port+ANSI_GREEN+" работает"+ANSI_RESET;
        } catch (Exception e) {
            return "IP: "+ip+":"+port+ANSI_RED+" не работает"+ANSI_RESET;
        }
    }

}
class MyRunnableThread implements Runnable{
    private Object checkProxy;
    private String ip;
    private int port;

    public MyRunnableThread(String ip, int port) {
        super();
        this.ip = ip;
        this.port = port;
    }
    @Override
    public void run() {
        System.out.println(Main.checkProxy(ip, port));
    }

}


class MyThread extends Thread{
    private String ip;
    private int port;

    public MyThread(String ip, int port) {
        super();

        this.ip = ip;
        this.port = port;
    }

    @Override
    public void run(){
        System.out.println(Main.checkProxy(ip, port));
    }
}
