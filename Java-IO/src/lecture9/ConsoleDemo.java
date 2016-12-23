package lecture9;

import java.io.*;

class ConsoleDemo
{
  public static void main(String args[]) throws Exception
  {
  	String userName,password;
  	Console con;
  	con=System.console();
  	System.out.println (con);
  	if(con==null) return;
  	userName=con.readLine("Enter UserName:");
  	char p[]=con.readPassword("Enter Password:");
  	password=new String(p);
  	con.printf("UserName:%s\n",userName);
  	con.printf("Password:%s\n",password);  
  }
}