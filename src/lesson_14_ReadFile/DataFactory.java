package lesson_14_ReadFile;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataFactory {

    public static void readFile(String filePath) {
        try (
               // System.out.println("Reading file from".concat(filePath));
                // chỉ ra file input stream ở đâu, chỉ ra dòng suối ở đâu
                FileInputStream fileInputStream = new FileInputStream(filePath);
                // đưa vào ổng dẫn nước
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                // đổ vô bình nước
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        ) {
            String dataLine =bufferedReader.readLine();
            while (dataLine !=null) {
                System.out.println(dataLine);
                dataLine= bufferedReader.readLine();
            }

        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    // đậy bình lại
    // inputStreamReader.close();
    // fileInputStream.close();

    public static List<Person> convertDataIntoPersonList(String filePath){
        List<Person> personList = new ArrayList<>();

        try (
                // System.out.println("Reading file from".concat(filePath));
                // chỉ ra file input stream ở đâu, chỉ ra dòng suối ở đâu
                FileInputStream fileInputStream = new FileInputStream(filePath);
                // đưa vào ổng dẫn nước
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                // đổ vô bình nước
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        ) {
            String dataLine =bufferedReader.readLine();
            while (dataLine !=null) {
                String[] personData= dataLine.split(";");
                String personName = personData[0];
                int personAge = Integer.parseInt(personData[1]);
                int personSalary= Integer.parseInt(personData[2]);
                Person person = new Person(personName,personAge,personSalary);
                personList.add(person);
                dataLine= bufferedReader.readLine();
            }

        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }catch (Exception e) {
            e.printStackTrace();
        }
        return personList;
    }

    public static void savePersonList(List<Person> personList, String filePath){
        if(personList==null || filePath==null){
            throw new IllegalArgumentException("Person list and filepath can't be null");
        }
        if(personList.isEmpty())return;

        try (
            FileOutputStream fileOutputStream = new FileOutputStream(filePath);
            OutputStreamWriter outputStreamWriter= new OutputStreamWriter(fileOutputStream);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        ) {
            for (Person person : personList) {
                String personName =person.getName();
                int personAge =person.getAge();
                int personSalary =person.getSalary();

                String dataLine = personName.concat(";").concat(String.valueOf(personAge)).concat(";").concat(String.valueOf(personSalary));
                bufferedWriter.write(dataLine);
                bufferedWriter.newLine();


            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
         String dataFileRelativePath ="\\src\\lesson_14_ReadFile\\data.txt";
         String dataFileAbsolutePath = System.getProperty("user.dir").concat(dataFileRelativePath);
       // List<Person> personList = DataFactory.convertDataIntoPersonList(dataFileAbsolutePath);
       // System.out.println(personList);


      //  String dataFileRelativePath ="/src/lesson_14_ReadFile";
       // String dataFileAbsolutePath = System.getProperty("user.dir").concat(dataFileRelativePath);

        Person teo = new Person("teo",20, 100000);
        Person ti = new Person("ti",22, 1100000);


        List<Person> employees = Arrays.asList(teo,ti);
        DataFactory.savePersonList(employees, dataFileAbsolutePath);
    }

}

