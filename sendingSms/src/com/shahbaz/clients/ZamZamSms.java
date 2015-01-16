package com.shahbaz.clients;

import com.shahbaz.api.AbstractSendSms;
import com.shahbaz.sendsms.SMS;
import com.shahbaz.utils.ApplicationProperties;

/**
 *  Uses SMS-LAN SMS api .So just loading the profile and calling the abstract
 * @author Shahbaz.Khan
 *
 */
public class ZamZamSms extends AbstractSendSms {

	@Override
	public void sendSms(SMS sms) {
		loadProfile();
		super.sendSms(sms);
	}

	@Override
	public void loadProfile() {
		smsApiUsername = ApplicationProperties.getProperty("zamzam.username");
		smsApiPassword = ApplicationProperties.getProperty("zamzam.password");
		receiverMobileNumber = ApplicationProperties
				.getProperty("zamzam.reciver.number");
	}

}
