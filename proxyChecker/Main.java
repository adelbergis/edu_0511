import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Data ip = new Data();

        for (String ipString: ip.getIp()) {
          //TODO:Тут продолжить....
            System.out.println(ipString);
        }
    }
}
class Data{
    private final String path  = "/Users/andrejberg/Desktop/IT/Java/ip.txt";
    private ArrayList<String> ip;

    public Data() {
        readFromFileIp();
    }

    public ArrayList<String> getIp() {
        return ip;
    }

    private void readFromFileIp() {
        ArrayList<String> ipArrayList = new ArrayList<>();
        try ( FileReader fileReader = new FileReader(this.path) ){
            int data;
            String proxy = "";
            while ((data=fileReader.read()) != -1){
                if (data == 13) continue;
                else if (data == 10){
                    ipArrayList.add(proxy);
                    proxy = "";
                } else if (data != 9) proxy += (char) data;
                else proxy += ":";
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            this.ip = ipArrayList;
        }
    }
}
