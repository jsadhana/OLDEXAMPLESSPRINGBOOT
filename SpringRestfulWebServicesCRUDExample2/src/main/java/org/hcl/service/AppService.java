package org.hcl.service;


import java.util.List;

import org.hcl.bean.App;


public class AppService {
	static List<String> lsnames = getlsNames();
	
	public App postName(App app) {
		System.out.println("APp,,,"+app.getName());
		 //lsnames.add(app.getName());
		 System.out.println("app bean"+ app.getName());
		 return app;
	}

	private static List<String> getlsNames() {
		 System.out.println("lsnames if any"+lsnames);
		return lsnames;
	}

}
