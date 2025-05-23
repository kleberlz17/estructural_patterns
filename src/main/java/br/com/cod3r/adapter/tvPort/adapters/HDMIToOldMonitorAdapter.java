package br.com.cod3r.adapter.tvPort.adapters;

import br.com.cod3r.adapter.tvPort.devices.OldMonitor;
import br.com.cod3r.adapter.tvPort.intefaces.HDMI;

public class HDMIToOldMonitorAdapter extends OldMonitor implements HDMI {
	
	
	public HDMIToOldMonitorAdapter(OldMonitor oldMonitor) {
		super();
		System.out.println("Connecting the HDMI/OldMonitor adapter...");
	}
	
	@Override
	public void setImage(String image) {
		System.out.println("Converting the image from HDMI to Old Monitor...");
		super.setImage(image);
	}
	
	@Override
	public void setSound(String sound) {
		System.out.println("Sorry, we don't work with sound");
		
	}

}
