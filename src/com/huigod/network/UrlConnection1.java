package com.huigod.network;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnection1 {

  public static void main(String[] args) throws Exception {
    URL url = new URL("https://www.infoq.com");

    URLConnection conn = url.openConnection();

    InputStream is = conn.getInputStream();

    OutputStream os = new FileOutputStream(
        "/Users/huigod/IdeaProjects/javase-lecture/src/com/huigod/network/infq.txt");

    byte[] buffer = new byte[2048];

    int length = 0;

    while (-1 != (length = is.read(buffer, 0, buffer.length))) {
      System.out.println(length);
      os.write(buffer, 0, length);
    }
  }
}
