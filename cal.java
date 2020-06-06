
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class cal {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		String line = "";
		String[] tokens = new String[2];
		try {
			FileReader file = new FileReader("/home/ubuntu/tomcat/webapps/project5/time.txt");
			BufferedReader br = new BufferedReader(file);
			long sum_tj = (long)0.0;
			long sum_ts = (long)0.0;
			int count = 0;
			while((line = br.readLine()) != null) {
				tokens = line.split(",");
//				System.out.print(tokens[0] +"\t"+ tokens[1] + "\n");
				
				sum_tj += Long.parseLong(tokens[0]);
				sum_ts += Long.parseLong(tokens[1]);
				count++;
			}
			long arg_tj = sum_tj/count;
			long arg_ts = sum_ts/count;
			System.out.println("avg_tj: " + arg_tj);
			System.out.println("avg_ts: " + arg_ts);
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
