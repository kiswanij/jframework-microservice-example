package com.app.model;

import javax.persistence.*;

import com.jk.util.jpa.BaseEntity;

@Entity
@Table(name="account")
public class Account extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String number;

	private String name;

	private Double avg;

	private String phone;

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return this.id;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getNumber() {
		return this.number;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setAvg(Double avg) {
		this.avg = avg;
	}

	public Double getAvg() {
		return this.avg;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhone() {
		return this.phone;
	}

	@Override
	public String toString() {
		StringBuffer buf = new StringBuffer();
		buf.append(this.number).append(" ");
		buf.append(",");
		buf.append(this.name).append(" ");
		buf.append(",");
		buf.append(this.avg).append(" ");
		buf.append(",");
		buf.append(this.phone).append(" ");
		return buf.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		return this.getId() == ((Account) obj).getId();
	}
}