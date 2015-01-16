package com.shahbaz.sendsms;

import com.shahbaz.utils.Client;

/**
 * This class mimics a rest layer which will be exposed to all the clients
 * 
 * @author Shahbaz.Khan
 *
 */
public class RestLayer {

	public static boolean sendSms(String client, String message) {

		/*
		 * Following the good old principle "Everything is an object" Though not
		 * required but it good to make the client SMS request in an object as
		 * the object going further can be converted to a JPA Entity and
		 * persisted by adding the required annotations
		 */
		SMS sms = SMS.setSMS(client, message);

		/*
		 * Client is an enum contains the list of Clients. Just trying to avoid
		 * messy if-else/switch statements.
		 */
		Client.ListOfClients.valueOf(sms.getClient()).requestToSendSms(sms);

		return false;

	}
}
