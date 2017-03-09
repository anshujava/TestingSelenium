package practice;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
public class xml_string {

	public static void main(String[] args) {
		StringToXMLExample();
//		XMlToStringExample();
		

	}
public static void XMlToStringExample(){
	DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
	InputStream inputStream;
	StringWriter string_write = null;
	try
	{
	inputStream = new FileInputStream(new File(".\\src\\practice\\newCreatedFile.xml"));
	org.w3c.dom.Document document = documentBuilderFactory.newDocumentBuilder().parse(inputStream);
	string_write = new StringWriter();
	Transformer serializer = TransformerFactory.newInstance().newTransformer();
	serializer.transform(new DOMSource(document), new StreamResult(string_write));
	
	}
	catch (FileNotFoundException e)
	{
	e.printStackTrace();
	}
	catch (TransformerException e)
	{
	e.printStackTrace();
	}
	catch (SAXException e)
	{
	e.printStackTrace();
	}
	catch (IOException e)
	{
	e.printStackTrace();
	}
	catch (ParserConfigurationException e)
	{
	e.printStackTrace();
	}
	System.out.println("XML content as a String : "+ string_write.toString().replaceAll("\n|\r", ""));
}
public static void StringToXMLExample(){
	String xmlToString = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n"+
            "<company><Emp id=\"1\"><name>Pankaj</name><age>25</age>\n"+
            "<role>Dot Net Developer</role><gen>Male</gen></Emp>\n"
            + "<Emp id=\"2\"><name>Malini</name><age>26</age>\n"+
            "<role>Java Developer</role><gen>Fe-Male</gen></Emp></company>";;
           
	DocumentBuilderFactory docfactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder docbuilder;
	try
	{
	docbuilder = docfactory.newDocumentBuilder();
	Document stringDocument = docbuilder.parse( new InputSource(new StringReader(xmlToString)));
	TransformerFactory tranFactory = TransformerFactory.newInstance();
	Transformer transformer = tranFactory.newTransformer();
	 
	//Uncomment this if you need to remove the line -
	//&lt; ?xml version="1.0" encoding="UTF-8" standalone="no"?&gt;
	 
	//transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
	 
	//Uncomment this is you want to remove - standalone="no"
	//stringDocument.setXmlStandalone(true);
	 
	Source source = new DOMSource(stringDocument);
	Result destination = new StreamResult( new File(".\\src\\practice\\newCreatedFile.xml"));
	transformer.transform( source, destination );
	 
	}
	catch (Exception e)
	{
	e.printStackTrace();
	}
	}
	

}
