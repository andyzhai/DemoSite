package com.mycompany.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.broadleafcommerce.common.presentation.AdminPresentation;
import org.broadleafcommerce.profile.core.domain.CustomerImpl;

@Entity
@Table(name = "MY_CUSTOMER")
public class MyCustomerImpl extends CustomerImpl implements MyCustomer {

	private static final long serialVersionUID = -5325318980226162518L;

	@Column(name = "BIRTH_DAY")
	@AdminPresentation(friendlyName = "Birth Day", order = 8000, group = "CustomerImpl_Customer", 
    prominent = true, gridOrder = 8000)	
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
