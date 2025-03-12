package com.xworkz.assign.runner;

import com.xworkz.assign.things.GoogleAppsDetails;
import com.xworkz.assign.things.GoogleAppsOperation;

public class GoogleAppsRunner {

	public static void main(String[] args) {
		System.out.println("Main method");
		
		GoogleAppsDetails details = new GoogleAppsDetails();
		details.setAppName("Play Store");
		details.setAppVersion("1.15.89");
		details.setTotalUsers(490000000);
		details.setUsedFor("To download and install apps");
		
		GoogleAppsDetails details2 = new GoogleAppsDetails();
		details2.setAppName("Youtube");
		details2.setAppVersion("1.2.3");
		details2.setTotalUsers(590000000);
		details2.setUsedFor("To watch videos");
		
		GoogleAppsDetails details3 = new GoogleAppsDetails();
		details3.setAppName("Gmail");
		details3.setAppVersion("2.3.4");
		details3.setTotalUsers(990000000);
		details3.setUsedFor("To send mails");
		
		GoogleAppsDetails details4 = new GoogleAppsDetails();
		details4.setAppName("Google Docs");
		details4.setAppVersion("1.21");
		details4.setTotalUsers(190000000);
		details4.setUsedFor("To create and store important documents ");
		
		GoogleAppsDetails details5 = new GoogleAppsDetails();
		details5.setAppName("Google Meet");
		details5.setAppVersion("1.14.80");
		details5.setTotalUsers(390000000);
		details5.setUsedFor("Virtual Meeting");
		
		GoogleAppsOperation appsOperation = new GoogleAppsOperation();
		appsOperation.saveGoogleApps(details);
		appsOperation.saveGoogleApps(details2);
		appsOperation.saveGoogleApps(details3);
		appsOperation.saveGoogleApps(details4);
		appsOperation.saveGoogleApps(details5);
		
		System.out.println("\n----Read----\n");
		appsOperation.readGoogleApps();
	}
}
