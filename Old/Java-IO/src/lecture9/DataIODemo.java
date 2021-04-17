package lecture9;

import java.io.*;

class DataIODemo 
{
  public static void main(String args[]) throws Exception 
  {
    FileOutputStream fos =new FileOutputStream("Test.dat");
    DataOutputStream dos=new DataOutputStream(fos);
    dos.writeDouble(98.6);
    dos.writeInt(1000);
    dos.writeBoolean(true);
    dos.close();
    fos.close();
    
    FileInputStream fis =new FileInputStream("Test.dat");
    DataInputStream dis=new DataInputStream(fis);
    double d=dis.readDouble();
    int i=dis.readInt();
    boolean b=dis.readBoolean();
    
    System.out.println (d);
     System.out.println (i);
     System.out.println (b);
     
     dis.close();
     fis.close();
    
    
  }
}
