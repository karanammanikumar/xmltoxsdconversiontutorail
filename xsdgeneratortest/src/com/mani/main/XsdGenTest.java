package com.mani.main;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.wiztools.xsdgen.ParseException;
import org.wiztools.xsdgen.XsdGen;

public class XsdGenTest {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException, ParseException {
		Constructor<XsdGen> constructor = XsdGen.class.getDeclaredConstructor(new Class[0]);
		constructor.setAccessible(true);
		File file = new File("src/com/mani/xml/read1.xml");
		constructor.newInstance(new Object[0]).parse(file).write(System.out);
	}

}
