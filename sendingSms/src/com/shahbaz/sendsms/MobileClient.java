package com.shahbaz.sendsms;

/**
 * Mimics the Mobile client
 * @author Shahbaz.Khan
 *
 */
public class MobileClient {

	public static void main(String[] args) {

		RestLayer.sendSms("ZAMZAM", "send this message");
		RestLayer.sendSms("ARSALAN", "send this message");
		RestLayer.sendSms("SIRAJ", "send this message");
		RestLayer.sendSms("VERYPOOR", "send this message");

	}
}
