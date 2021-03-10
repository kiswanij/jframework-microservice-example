package com.app;

import com.jk.util.config.JKConfig;
import com.jk.web.embedded.JKWebApplication;

public class ServiceApp {
	public static void main(String[] args) {
		int port = JKConfig.getDefaultInstance().getPropertyAsInteger("app.services.person.port");
		JKWebApplication.run(port,false);
	}
}
