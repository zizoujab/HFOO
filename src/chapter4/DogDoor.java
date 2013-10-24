package chapter4;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {
	
	private List<Bark> allowedBarks ;
	
	private Bark allowedBark ;
	private boolean open ;
	
	public DogDoor() {
		this.open = false ;
		allowedBarks = new ArrayList<Bark>();
	}
	
	public void open () {
		System.out.println("The dog door opens .");
		open = true ;
		final Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				close();
				timer.cancel();
			}
		},500);
	}
	
	public void close () {
		System.out.println("The dog door closes. ");
		open = false ;
	}

	public boolean isOpen() {
		return open ;
	}

	public Bark getAllowedBark() {
		return allowedBark;
	}

	public void setAllowedBark(Bark allowedBark) {
		this.allowedBark = allowedBark;
	}
	
	public void addAllowedBark(Bark bark) {
		allowedBarks.add(bark);
	}

	public List<Bark> getAllowedBarks() {
		return allowedBarks;
	}
	
	
	
	
	
	

}
