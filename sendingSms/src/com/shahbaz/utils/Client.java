package com.shahbaz.utils;

import com.shahbaz.clients.ArsalanSms;
import com.shahbaz.clients.SirajSms;
import com.shahbaz.clients.VeryPoorResturant;
import com.shahbaz.clients.ZamZamSms;
import com.shahbaz.sendsms.SMS;

public class Client {

	public enum ListOfClients {
		ZAMZAM {

			@Override
			public void requestToSendSms(SMS sms) {
				new ZamZamSms().sendSms(sms);
			}

		},
		ARSALAN {

			@Override
			public void requestToSendSms(SMS sms) {
				new ArsalanSms().sendSms(sms);
			}

		},
		SIRAJ {

			@Override
			public void requestToSendSms(SMS sms) {
				new SirajSms().sendSms(sms);
			}

		},VERYPOOR {

			@Override
			public void requestToSendSms(SMS sms) {
				new VeryPoorResturant().sendSms(sms);
			}

		};

		public abstract void requestToSendSms(SMS sms);
	}
}
