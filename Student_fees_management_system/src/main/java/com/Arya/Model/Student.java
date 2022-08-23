package com.Arya.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", class_of_study=" + class_of_study + ", fees_amount="
				+ fees_amount + ", payment_amount=" + payment_amount + ", payment_status=" + payment_status + "]";
	}
	
	@Id
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="class_of_study")
	private String class_of_study;
	
	@Column(name="fees_amount")
	private String fees_amount;
	
	@Column(name="payment_amount")
	private String payment_amount;
	
	@Column(name="payment_status")
	private String payment_status;
	
	@Column(name="payment_date")
	private Date payment_date;
	
	public Date getPayment_date() {
		return payment_date;
	}
	public void setPayment_date(Date payment_date) {
		this.payment_date = payment_date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClass_of_study() {
		return class_of_study;
	}
	public void setClass_of_study(String class_of_study) {
		this.class_of_study = class_of_study;
	}
	public String getFees_amount() {
		return fees_amount;
	}
	public void setFees_amount(String fees_amount) {
		this.fees_amount = fees_amount;
	}
	public String getPayment_amount() {
		return payment_amount;
	}
	public void setPayment_amount(String payment_amount) {
		this.payment_amount = payment_amount;
	}
	public String getPayment_status() {
		return payment_status;
	}
	public void setPayment_status(String payment_status) {
		this.payment_status = payment_status;
	}
	
	
}
