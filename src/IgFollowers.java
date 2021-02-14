
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class IgFollowers {

	public static void main(String[] args) {
		IgFollowers obj = new IgFollowers();
    	
        obj.run();
	}

	public void run() {
        String csv = "/Users/pati/Desktop/inactive.csv";
        BufferedReader br = null;
       // CSVWriter writer = null;
        String ig = "https://www.instagram.com/";
        try {
            br = new BufferedReader(new FileReader(csv));
            FileWriter writer = new FileWriter("/Users/pati/OneDrive - Edinburgh Napier University/inactive2.csv");
            //BufferedWriter bw = new BufferedWriter(writer);

            String headerLine = br.readLine();

            int i = 1;
            while (headerLine != null) {
            	//ig.concat(headerLine).concat("/");
            	//System.out.println(ig.concat(headerLine).concat("/") + i);
            	writer.append(ig.concat(headerLine).concat("/"));
            	//System.out.println(headerLine + i);
            	//i++;
            	//headerLine = br.readLine();
            }
            
 br.close();
 writer.flush();
 writer.close();
        }
        catch (IOException io) {
            System.out.println(io);
        }
    }
}
