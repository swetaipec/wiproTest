package utility;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadElememtFromObjectRepo

{
	Properties p=new Properties();
	public Properties getobjectrepository() throws IOException
	{
		
		File src=new File("C:\\Users\\SK\\wipro\\MavenEclipseProject\\src\\test\\java\\elementLocator\\object.properties");
		FileInputStream fs=new FileInputStream(src);
		p.load(fs);
		p.setProperty("signIn", "Sign in");
		p.setProperty("email_field","email_create");
		String s =p.getProperty("signIn");
		System.out.println(s);
		return p;
		}
	

}
