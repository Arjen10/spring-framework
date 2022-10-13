package org.springframework.beans.factory.xml;


import org.springframework.beans.testfixture.beans.ArjenTest;
import org.springframework.core.io.ClassPathResource;

/**
 * @author Arjen10
 * @date 2022/10/13 0:18
 */
public class ArjenTests {

	private static final String PATH = "org/springframework/beans/factory/xml/ArjenTest.xml";

	public static void main(String[] args) {
		XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource(PATH));
		ArjenTest arjen = beanFactory.getBean("arjen", ArjenTest.class);
		System.out.println(arjen);
	}

}
