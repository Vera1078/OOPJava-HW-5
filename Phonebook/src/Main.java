import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.logging.Level;

public class Main {
    public static void main(String[] args) {
        LoggerClass.logger.log (Level.INFO, "Start program");
//    Filemanager run = new Filemanager();
//    Addresbook phones = new Addresbook();
//    phones.Addresbook();
//    run.ExportFile(phones.pb);
//        System.out.println(phones.pb);
//        run.ImportFile(phones.pb);
//        System.out.println("***********************");
//        phones.showAddresBook();

      Menu.mainMenu();

        LoggerClass.logger.log (Level.INFO, "Stop program");
    }
}