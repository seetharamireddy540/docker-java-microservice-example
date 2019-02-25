package com.ram.classloaders;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class CustomeClassLoader {

  public static void main(final String[] arg) {
    System.out.println("Starting URL class loader ...");


    final URL url;
    try {
      //url = new URL("file:///Users/mittalas/libs/com.ram-1.0-SNAPSHOT.jar");
      //url = new URL("file:///Volumes/Unix/workplace/RamUnitTesting-ws/src/RamUnitTestClient/src/test/resources/test.jar");

      url = new URL("https://code.amazon.com/packages/RamUnitTestClient/blobs/mainline/--/src/test/resources/test.jar");

      System.out.println(url.getHost() + " " + url.getPath() + " " + url.getProtocol());
      final URLClassLoader ucl = new URLClassLoader(new URL[]{url});

      final Class clazz = ucl.loadClass("com.ram.MathUtil");
      final Object o = clazz.newInstance();
      System.out.println(o);


    } catch (final MalformedURLException mfe) {
      mfe.printStackTrace();

    } catch (final ClassNotFoundException e) {
      e.printStackTrace();
    } catch (final IllegalAccessException e) {
      e.printStackTrace();
    } catch (final InstantiationException e) {
      e.printStackTrace();
    }


  }
}
