package com.mani.main;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import de.danielbechler.diff.ObjectDifferBuilder;
import de.danielbechler.diff.node.DiffNode;
import de.danielbechler.diff.node.Node;

public class JaxbClass {

		public static void main(String[] args) {
			try {
				JAXBContext context = JAXBContext.newInstance("com.mani.read");
				Unmarshaller um = context.createUnmarshaller();
				com.mani.read.Root root  =  (com.mani.read.Root) um.unmarshal(new File("src/com/mani/xml/read.xml"));
				
				
				JAXBContext context1 = JAXBContext.newInstance("com.mani.read1");
				Unmarshaller um1 = context1.createUnmarshaller();
				com.mani.read1.Root root1  =  (com.mani.read1.Root) um1.unmarshal(new File("src/com/mani/xml/read1.xml"));
				
				List<com.mani.read.Root.Course> courseold = root.getCourse();
				List<com.mani.read1.Root.Course> coursenew = root1.getCourse();
				
				System.out.println(root.equals(root1));
				
				Node diff = ObjectDifferBuilder.buildDefault().compare(courseold, coursenew);
				
			} catch (JAXBException e) {
				e.printStackTrace();
			}
		}

}
