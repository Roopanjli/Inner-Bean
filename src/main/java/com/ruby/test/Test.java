package com.ruby.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.ruby.bean.Tv;

public class Test {

	public static void main(String[] args) {

	BeanFactory factory= new XmlBeanFactory(new FileSystemResource("src/main/java/com/ruby/cgf/ApplicationContext.xml"));
	Tv tv=factory.getBean("tv",Tv.class);
	System.out.println(tv);
		
		
	}

}
