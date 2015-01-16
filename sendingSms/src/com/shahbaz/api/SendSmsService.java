package com.shahbaz.api;

import com.shahbaz.sendsms.SMS;

/**
 * 
 * @author Shahbaz.Khan
 * Interface to Send SMS
 */
public interface SendSmsService {

	public void loadProfile();

	public void sendSms(SMS sms);
}
