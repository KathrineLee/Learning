import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
public class xml {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
			DocumentBuilder builder=factory.newDocumentBuilder();
			Document document=builder.parse(new File("xml.xml"));
			String version=document.getXmlVersion();
			System.out.println(version);
			String encoding=document.getXmlEncoding();
			System.out.println(encoding);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
