package com.shahbaz.api;

import com.shahbaz.sendsms.SMS;
import com.shahbaz.utils.ApplicationProperties;

/**
 * Provides default implementations of SMS interface
 * @author Shahbaz.Khan
 *
 */
public abstract class AbstractSendSms implements SendSmsService {

	public String smsApiUsername = ApplicationProperties
			.getProperty("username");

	public String smsApiPassword = ApplicationProperties
			.getProperty("password");

	public String receiverMobileNumber = ApplicationProperties
			.getProperty("reciver.number");

	public String sid = ApplicationProperties.getProperty("sid");

	public String fl = ApplicationProperties.getProperty("fl");

	@Override
	public void sendSms(SMS sms) {

		System.out.println("****************** " + sms.getClient()
				+ " *************************");
		System.out.println(" SMS PROVIDER : SMS-LAN");
		System.out.println("USERNAME : " + smsApiUsername);
		System.out.println("PHONE NUMBER : " + receiverMobileNumber);
	}

	@Override
	public void loadProfile() {

	}

}
