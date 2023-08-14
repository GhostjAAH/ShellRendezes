package hu.shell;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Futtatas {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		Feltoltes feltolt = (Feltoltes)factory.getBean("feltoltBean");
		Tombtoltes tombtolt = (Tombtoltes)factory.getBean("tombtoltBean");
		Rendezes rendez = (Rendezes)factory.getBean("shellrendBean");
		Kiiras kiir = (Kiiras)factory.getBean("kiirasBean");
		
		feltolt.filebaToltes();
		System.out.println("A fajlba toltes megtortent...");
		tombtolt.tombbeToltes();
		System.out.println("A tombbe attoltes vegrehajtva...");
		rendez.shellRendezes();
		System.out.println("Rendezes...");
		System.out.println("A szamok balrol jobbra novekvoben, 10x10-es formatumban:");
		kiir.rendezettKiiras();
	}
}
