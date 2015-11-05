import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class javaProject {

    public static void main(String[] args) {

        javaProject obj = new javaProject();
        obj.run();

    }

    public void run() {

        String csvFile = "/ctct_revenue_oct2015.csv";
        BufferedReader br = null;
        String line = "";
        String csvSplitBy = "|";

        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                String[] value = line.split(csvSplitBy);

                System.out.println(value);

            }


        }

        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (br != null) {
                try {
                    br.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}