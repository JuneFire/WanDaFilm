package model;

public class Seat {
	private int seat_id;
	private boolean seat_status;
	private int seat_filmroom_id;
	private String seat_name;

	public int getSeat_id() {
		return seat_id;
	}

	public void setSeat_id(int seat_id) {
		this.seat_id = seat_id;
	}

	public boolean isSeat_status() {
		return seat_status;
	}

	public void setSeat_status(boolean seat_status) {
		this.seat_status = seat_status;
	}

	public int getSeat_filmroom_id() {
		return seat_filmroom_id;
	}

	public void setSeat_filmroom_id(int seat_filmroom_id) {
		this.seat_filmroom_id = seat_filmroom_id;
	}

	public String getSeat_name() {
		return seat_name;
	}

	public void setSeat_name(String seat_name) {
		this.seat_name = seat_name;
	}

	public Seat(int seat_id, boolean seat_status, int seat_filmroom_id,
			String seat_name) {
		super();
		this.seat_id = seat_id;
		this.seat_status = seat_status;
		this.seat_filmroom_id = seat_filmroom_id;
		this.seat_name = seat_name;
	}

	public Seat() {
		super();
	}
	
	

}
