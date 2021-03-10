package com.app.client;


import java.util.List;

import com.app.model.Person;
import com.jk.util.JK;
import com.jk.util.config.JKConfig;
import com.jk.web.services.client.JKServiceClient;

public class ServiceClientTest {
	public static void main(String[] args) {
		String url=JKConfig.getDefaultInstance().getProperty("app.services.person.url");
		JKServiceClient<Person> client=new JKServiceClient<Person>(url, Person.class);

		// Retrieve all persons
		List<Person> list = client.callJsonAsListOfObjects();

		for (Person person : list) {
			JK.print(person);
		}
		// Retrieve single person
		Person p = client.callSingleJson("/1");

		JK.printBlock(p);
	}
}
