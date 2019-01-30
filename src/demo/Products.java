package demo;
import java.io.*;
import javax.xml.transform.*;
import javax.xml.transform.stream.*;

public class Products {

	public static void main(String[] args) {
		try
		{
			TransformerFactory tff=TransformerFactory.newInstance();
			Transformer tf=tff.newTransformer(new StreamSource(new File("src\\data\\products.xslt")));
			StreamSource ss=new StreamSource(new File("src\\data\\products.xml"));
			StreamResult sr=new StreamResult(new File("src\\data\\products.html"));
			tf.transform(ss, sr);
			System.out.println("done");
			
		}
		catch(Exception e)
		{
			
			System.out.println(e.getMessage());
	  //   e.printStackTrace();
			
		}
		

	}

}
