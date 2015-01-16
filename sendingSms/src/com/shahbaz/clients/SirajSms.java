package com.shahbaz.clients;

import com.shahbaz.api.AbstractSendSms;
import com.shahbaz.sendsms.SMS;
import com.shahbaz.utils.ApplicationProperties;

/**
 * Uses SMS-LAN SMS api.So just loading the profile and calling the abstract
 * class method
 * 
 * @author Shahbaz.Khan
 *
 */
public class SirajSms extends AbstractSendSms {

	@Override
	public void sendSms(SMS sms) {
		loadProfile();
		super.sendSms(sms);
	}

	@Override
	public void loadProfile() {
		smsApiUsername = ApplicationProperties.getProperty("siraj.username");
		smsApiPassword = ApplicationProperties.getProperty("siraj.password");
		receiverMobileNumber = ApplicationProperties
				.getProperty("siraj.reciver.number");

	}

}
