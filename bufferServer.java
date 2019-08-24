package File_Server;

import java.net.*;
import java.util.*;
import java.io.*;

public class bufferServer {

	public static void main(String[] args) {

		try {

			ServerSocket ss = new ServerSocket(2222);
			Socket s = ss.accept();
			DataInputStream dis = new DataInputStream(s.getInputStream());
			BufferedInputStream bis = new BufferedInputStream(dis);
			FileOutputStream fos = new FileOutputStream("G:\\E05.mkv");
			BufferedOutputStream bos = new BufferedOutputStream(fos);

			int fSize = Integer.parseInt(dis.readUTF());

			int k = 0;
			while (k < fSize) {
				bos.write(bis.read());
				k++;
			}

		} catch (Exception e) {

		}

	}

}
