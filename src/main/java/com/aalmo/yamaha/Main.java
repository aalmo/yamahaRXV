package com.aalmo.yamaha;

import com.aalmo.yamaha.model.YAMAHAAV;

public class Main {


	public static void main(String[] args) {
		ObjectFactory factory = new ObjectFactory();
		YAMAHAAV yamahaav = factory.getRecieverStatus();
		yamahaav.getMainZone().getSurround().set3DCinemaDSP("Auto");
		yamahaav.getMainZone().getVolume().setMute("On");
		System.out.println(yamahaav.toString());
		factory.updateReciever(yamahaav);
	}

}
