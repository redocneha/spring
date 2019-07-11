package com.pack.SpringDemo;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Resource re=new ClassPathResource("Beans.xml");
    	Human obj;
      BeanFactory bf=new XmlBeanFactory(re);
      Scanner sc=new Scanner(System.in);
      System.out.println("1.Man\n 2.Woman\n");
      System.out.println("Enter choice");
      int ch=sc.nextInt();
      if(ch==1)
    	  
      obj=(Human) bf.getBean("man");
      else
    	 obj=(Human) bf.getBean("woman");
      System.out.println(obj);
       
    }
}
