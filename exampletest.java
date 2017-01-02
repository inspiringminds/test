package advancelearning;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Testfifteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Resource r=new ClassPathResource("advancelearning/Appicationcontextfourteen.xml");  
		    BeanFactory factory=new XmlBeanFactory(r);  
		      
		    Questioneight q=(Questioneight)factory.getBean("q");  
		    q.displayInfo();  
		      
		}

	}


