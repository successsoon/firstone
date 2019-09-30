package com.pom.test;

import java.io.IOException;

public class SampleTest extends OrderNumberClass {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		SampleTest st = new SampleTest();
		
		st.initDriver();
		st.loadDriver();
		st.loadUrl("https://adactin.com/HotelApp/index.php");
		PomClassRepositary pr = new PomClassRepositary();
		st.typeData(pr.getName(),pr.getExcelData(0, 1));
		st.typeData(pr.getPassword(),pr.getExcelData(1, 1));
		st.functionClick(pr.getLogin());
		st.funSelect(pr.getSearchLocation(), pr.getExcelData(2, 1));
		//System.out.println(pr.getExcelData(2, 1));
		
		st.funSelect(pr.getSearchHotel(), pr.getExcelData(3, 1));
		st.funSelect(pr.getRoomType(), pr.getExcelData(4, 1));
		st.funSelect(pr.getNoOfRooms(), pr.getExcelData(5, 1));
		st.typeData(pr.getDatePickIn(),pr.getExcelData(6, 1));
		st.typeData(pr.getDatePickOut(), pr.getExcelData(7, 1));
		st.funSelect(pr.getNoOfAdults(), pr.getExcelData(8, 1));
		st.funSelect(pr.getNoOfChild(),pr.getExcelData(9, 1));
		st.functionClick(pr.getSearch());
		st.functionClick(pr.getRadButton());
		st.functionClick(pr.getContinuebut());
		st.typeData(pr.getFirstName(), pr.getExcelData(10, 1));
		st.typeData(pr.getLastName(), pr.getExcelData(11, 1));
		st.typeData(pr.getAddressField(), pr.getExcelData(12, 1));
		st.typeData(pr.getCreditCard(), pr.getExcelData(13, 1));
		st.funSelect(pr.getCCType(),pr.getExcelData(14, 1));
		st.funSelect(pr.getExpDate(), pr.getExcelData(15, 1));
		st.funSelect(pr.getExpYear(), pr.getExcelData(16, 1));
		st.typeData(pr.getCvvNumber(), pr.getExcelData(17, 1));
		st.functionClick(pr.getBookNow());
		//st.sleepTime();
		st.waitFunction();
		
		st.readData(pr.getOrdernumber());
		st.functionClick(pr.getLogout());
		


		
	}

}

