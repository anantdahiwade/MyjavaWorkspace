package com.example2;

import java.util.Scanner;

public class Insurance {
		int id;
		String personName;
		String insuranceCompany;
		private Scanner scanner;
		public int getId() {
			return id;

	}
		public void setId(int id) {
			this.id = id;
			
		}
		public String getPersonName() {
			return personName;
			
		}
		public void setPersonName(String personName) {
			this.personName = personName;
		}
		public String getInsuranceCompany() {
			return insuranceCompany;
			
		}
		public void setInsuranceCompany(String insuranceCompany) {
			this.insuranceCompany = insuranceCompany;
			
		}
		public void getInsuranceDetails() {
			System.out.println("Enter the Insurance details>>");
			Scanner scanner = new Scanner(System.in);
			id = scanner.nextInt();
			System.out.println("Enter insurance person name>> ");
			personName =scanner.next();
			System.out.println("Enter Insurance company>> ");
			insuranceCompany =scanner.next();
			Insurance insurance = new Insurance();
			insurance.setId(id);
			insurance.setPersonName(insuranceCompany);
			insurance.setInsuranceCompany(insuranceCompany);
			getInsuranceInformation(insurance);
			
		}
		private void getInsuranceInformation(Insurance insurance) {
			System.out.println("Insurance Id>>" +insurance.getId());
			System.out.println("Insurance person Name>>" + insurance.getPersonName());
			System.out.println("Insurance Company Name>>" + insurance.getInsuranceCompany());
			
			
		}

}
