import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String args[]){
        File file  = new File("src/data.txt");
        Person[] personList = new Person[20];
        int i = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                try {
                    String[] personAttributeList = line.split("\\W+");
                } catch (NullPointerException e) {
                    continue;
                }
                String[] personAttributeList = line.split("\\W+");
                try {
                    int checker = Integer.valueOf(personAttributeList[0]);
                } catch (NumberFormatException numE) {
                    continue;
                }

                    Person person = new Person();
                    person.setPosition(personAttributeList[0]);
                    person.setFirstName(personAttributeList[1]);
                    person.setLastName(personAttributeList[2]);
                    person.setEmail(personAttributeList[3]);
                    person.setGender(personAttributeList[4]);
                    personList[i] = person;
                    i++;
                }

            }
        catch(IOException e){
            e.printStackTrace();
        }
        System.out.println(Arrays.toString(personList));
    }

}
