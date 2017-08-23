package com.huigod.network;

import java.net.URL;

public class Url1 {

  public static void main(String[] args) throws Exception {

    URL url = new URL("http://write.blog.csdn.net/postlist?ticket=ST-393007-wuhDQp9csaKf1Lic5KGw-passport.csdn.net");

    String protocol = url.getProtocol();
    String host = url.getHost();
    int port = url.getPort();
    String ref = url.getRef();

    System.out.println(protocol + "," + host + "," + port + "," + ref);

  }
}
