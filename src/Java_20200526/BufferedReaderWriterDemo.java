package Java_20200526;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BufferedReaderWriterDemo {
	 public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		PrintWriter pw = null;
		
		try {
			fr = new FileReader("C:\\dev\\FileDemo.java");
			fw = new FileWriter("C:\\dev\\FileDemo4.java");
			
			br = new BufferedReader(fr); //readLine() 
			bw = new BufferedWriter(fw);
			
			pw = new PrintWriter(bw, true); //true : autoFlush
			
			String readLine = null;
			//br.readLine() : 개행을 뺀 한 줄을 읽는다.
			while((readLine = br.readLine()) != null) {
				//bw.write(readLine);
				//bw.newLine();
				pw.println(readLine);
			}
			//bw.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(pw != null) pw.close();
			try {
				if(fr != null) fr.close();
				if(fw != null) fw.close();
				if(br != null) br.close();
				if(bw != null) bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
