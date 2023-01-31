import java.util.ArrayList;
import java.io.*;
import java.util.logging.Level;

public class Filemanager {

//    указываем путь к файлу для хранения данных
    String FILE_PATH = "./src/";
    String FILE_NAME_EXPORT = "export.csv";
    String FILE_PATH_FULL = FILE_PATH + FILE_NAME_EXPORT;
    public void ExportFile (ArrayList<Phonebook> pb){

        LoggerClass.logger.log(Level.INFO, "Запись данных в файл");

    // для записи фанных в файл
        try(FileWriter writer = new FileWriter(FILE_PATH + FILE_NAME_EXPORT, false))    // false - файл будет каждый раз перезаписываться, true - в файл будет добавляться ирнформация
        {
// запись всей строки
            //String text = "Hello Gold!";
            for (Phonebook i : pb) {
                String text = i.getName() + ";" + i.getPhone() + ";" + i.getCity();
                writer.write(text);
                // запись по символам
                writer.append('\n');
//                writer.append('E');  //формирует отступ
            }
            writer.flush();   // закроит файл и начнет заново
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }

    public void ImportFile(ArrayList<Phonebook> pb) {

        LoggerClass.logger.log(Level.INFO, "Выгрузка данных из файла");
        try {
            File file = new File(FILE_PATH_FULL);
//создаем объект для считывания FileReader для объекта File
            FileReader fr = new FileReader(file);
//создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
// считаем сначала первую строку
            String line = reader.readLine();
            while (line != null) {
//                System.out.println(line);

                String[] tmp = line.split(";");    //с помощью разделителя split в стоке выискиваем строки, разделенные ";"
                pb.add(new Phonebook(tmp[0], tmp[1], tmp[2]));

// считываем остальные строки в цикле
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


