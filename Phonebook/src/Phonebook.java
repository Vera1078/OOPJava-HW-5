//Создать телефонный справочник с возможностью импорта и
//экспорта данных в нескольких форматах.
//под форматами понимаем структуру файлов, например:
//- в файле на одной строке хранится одна часть записи, пустая
//строка - разделитель

import java.util.logging.Level;

public class Phonebook {
    String Name;
    String Phone;
    String City;

    public  Phonebook (String name, String phone, String city){
        this.Name = name;
        this.City = city;
        this.Phone = phone;

        LoggerClass.logger.log(Level.INFO, "Был создан новый контакт");
    }

    public String getName() {
        return Name;
    }

    public String getCity() {
        return City;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public void setCity(String city) {
        City = city;
    }

    public void setName(String name) {
        Name = name;
    }

}
