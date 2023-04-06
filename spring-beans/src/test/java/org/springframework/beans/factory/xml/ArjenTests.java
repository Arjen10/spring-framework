package org.springframework.beans.factory.xml;


import org.junit.jupiter.api.Test;
import org.springframework.beans.testfixture.beans.ArjenCat;
import org.springframework.beans.testfixture.beans.ArjenTest;
import org.springframework.core.io.ClassPathResource;

/**
 * @author Arjen10
 * @date 2022/10/13 0:18
 */
public class ArjenTests {

	private static final String PATH = "org/springframework/beans/factory/xml/ArjenTest.xml";

	@Test
	public void testXmlBeanFactory() {
		XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource(PATH));
		ArjenCat sonBean = beanFactory.getBean("constructorBean", ArjenCat.class);
		System.out.println(sonBean);
	}

}
