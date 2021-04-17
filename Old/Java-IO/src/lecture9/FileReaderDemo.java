package lecture9;

import java.io.*;

class FileReaderDemo {
  public static void main(String args[]) throws Exception
  {
  	File f=new File("TestFile.java");
    FileReader fr = new FileReader(f);
    char data[]=new char[(int)f.length()];
    fr.read(data);
    System.out.println(new String(data));
    fr.close();
  }
}