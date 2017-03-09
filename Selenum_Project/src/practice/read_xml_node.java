package practice;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
public class read_xml_node {

	public static void main(String argv[]) {

	    try {

		File fXmlFile = new File(".\\src\\practice\\newCreatedFile.xml");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);

		//optional, but recommended
		//read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
		doc.getDocumentElement().normalize();

		System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

		NodeList nList = doc.getElementsByTagName("Emp");

		System.out.println("----------------------------");

		for (int temp = 0; temp < nList.getLength(); temp++) {

			Node nNode = nList.item(temp);

			System.out.println("\nCurrent Element :" + nNode.getNodeName());

			if (nNode.getNodeType() == Node.ELEMENT_NODE) {

				Element eElement = (Element) nNode;

				System.out.println("emp id : " + eElement.getAttribute("id"));
				System.out.println("Name : " + eElement.getElementsByTagName("name").item(0).getTextContent());
				System.out.println("Age : " + eElement.getElementsByTagName("age").item(0).getTextContent());
				System.out.println("Role : " + eElement.getElementsByTagName("role").item(0).getTextContent());
				System.out.println("Gender : " + eElement.getElementsByTagName("gen").item(0).getTextContent());

			}
		}
	    } catch (Exception e) {
		e.printStackTrace();
	    }
	  }

}
