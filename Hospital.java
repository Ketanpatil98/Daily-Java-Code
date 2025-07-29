package com.GetSet;

public class Hospital {
	
	private int RoomNo;
	private String DoctorName;
	private float Bill;
	
	
	public int getRoomNo() {
		return RoomNo;
	}
	public void setRoomNo(int RoomNo) {
		this.RoomNo=RoomNo;
	}
	public String getDoctorName() {
		return DoctorName;
	}
	public void setDoctorName(String DoctorName ) {
		this.DoctorName=DoctorName;
	}
	
	public float getBill() {
		return Bill;
	}
	public void setBill(float Bill ) {
		this.Bill=Bill;
	}

}
