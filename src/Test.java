import java.io.*;

public class Test {
    public static void main(String [] args) throws Exception {

        String file = "temp.txt";
        
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("abc");
        
        bw.close();
        
    	
    }
}