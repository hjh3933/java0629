package org.project.cardto;

public class CarDto {
	private String car_no;
	private String car_type;
	private String car_last_check_date;
	private String car_expire_date;

	public CarDto(String car_no, String car_type, String car_last_check_date, String car_expire_date) {
		super();
		this.car_no = car_no;
		this.car_type = car_type;
		this.car_last_check_date = car_last_check_date;
		this.car_expire_date = car_expire_date;
	}

	public String getCar_no() {
		return car_no;
	}

	public void setCar_no(String car_no) {
		this.car_no = car_no;
	}

	public String getCar_type() {
		return car_type;
	}

	public void setCar_type(String car_type) {
		this.car_type = car_type;
	}

	public String getCar_last_check_date() {
		return car_last_check_date;
	}

	public void setCar_last_check_date(String car_last_check_date) {
		this.car_last_check_date = car_last_check_date;
	}

	public String getCar_expire_date() {
		return car_expire_date;
	}

	public void setCar_expire_date(String car_expire_date) {
		this.car_expire_date = car_expire_date;
	}

}
