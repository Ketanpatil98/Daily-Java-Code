package com.GetSet;

public class HospitalDetails {
	
	public static void main(String[] args) {
		
		Hospital A =new Hospital();
		A.setRoomNo(44);
		A.setDoctorName("Dr.Khurana");
		A.setBill(55490.60f);
		System.out.println("The Patient Room NO. :" + A.getRoomNo());
		System.out.println("The Patient Doctor Name :" + A.getDoctorName());
		System.out.println("The Patient Hospital Bill :" + A.getBill());
	}

}
