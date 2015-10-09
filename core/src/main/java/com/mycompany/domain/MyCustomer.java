/**
 * 
 */
package com.mycompany.domain;

import java.util.Date;

import org.broadleafcommerce.profile.core.domain.Customer;

public interface MyCustomer extends Customer{
	
	public Date getBirthDay();
	
	public void setBirthDay(Date birthDay);
}
