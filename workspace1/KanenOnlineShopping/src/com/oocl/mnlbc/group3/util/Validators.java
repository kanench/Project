/**
 * 
 */
package com.oocl.mnlbc.group3.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author KANENCH
 *
 */
public class Validators {

	public boolean checkEmail(String email) {

		Pattern p = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
				+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		Matcher matcher = p.matcher(email);
		if (matcher.matches()) {
			return true;
		} else {
			System.out.println("Invalid Email Format. (e.g. kanenpogi@gmail.com)");
			return false;
		}

	}

	public boolean checkPhone(String mobileNumber) {
		Pattern p = Pattern.compile("^[0-9]{11}");
		Matcher matcher = p.matcher(mobileNumber);
		if (matcher.matches()) {
			return true;
		} else {
			System.out.println("Please provide an 11 digit number. (e.g. 09064887044)");
			return false;
		}
	}

}