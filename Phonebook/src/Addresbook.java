import java.util.ArrayList;
import java.util.logging.Level;

public class Addresbook {

    public ArrayList <Phonebook> pb = new ArrayList<>();

    public void Addresbook (){
        pb.add(new Phonebook("Иванов А.А.", "12345677", "Москва"));
        pb.add(new Phonebook("Петров П.П.", "9876543221", "Подольск"));
        pb.add(new Phonebook("Сидоров С.С.", "192837465", "Чехов"));

        LoggerClass.logger.log(Level.INFO, "В список контактов добавлены новые люди");
    }

    public void showAddresBook (){
        for (Phonebook i : pb) {
            System.out.println(i.getName() + " " + i.getPhone() +" " + i.getCity());

            LoggerClass.logger.log(Level.INFO, "Телефонная книга напечатана в консоли");
        }
    }
}
