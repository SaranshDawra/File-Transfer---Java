package File_Client;

import java.net.*;
import java.util.*;
import java.io.*;

public class bufferClient {

	public static void main(String[] args) {

		try {
			Socket s = new Socket("localhost", 2222);
			DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			BufferedOutputStream bos = new BufferedOutputStream(dos);
			File file = new File("F:\\E05.mkv");
			FileInputStream fis = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(fis);
			int flen = (int) file.length();
			dos.writeUTF(String.valueOf(flen));
			int k;

			while ((k = bis.read()) != -1) {
				bos.write(k);
			}

			System.out.println("File Transfereed");

		} catch (Exception e) {

		}

	}

}
