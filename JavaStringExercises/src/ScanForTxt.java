import java.io.File;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
public class ScanForTxt {
    public static void main(String[] args) {
        File folder = new File("D://");
        File[] listOfFiles = folder.listFiles();
        getZips(listOfFiles);
    }

    public static void getZips(File[] listOfFiles) {
        for (File name:listOfFiles){
            if(name.getName().endsWith("java")) {
                System.out.println(name);
            }
            try{getZips(name.listFiles());}
            catch (Exception e){}
        }
    }
}
