package com.mycompany.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.broadleafcommerce.profile.core.domain.CustomerImpl;

@Entity
@Table(name = "MY_CUSTOMER")
public class MyCustomerImpl extends CustomerImpl implements MyCustomer {

	private static final long serialVersionUID = -5325318980226162518L;

	@Column(name = "BIRTH_DAY")
	private Date birthDay;
	
	@Override
	public Date getBirthDay() {
		return birthDay;
	}

	@Override
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

}
