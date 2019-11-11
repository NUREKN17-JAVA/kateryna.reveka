package ua.nure.cs.reveka.first.domain;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 75429740885978122L;
	private Long id;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	public String getFullName() {
		return getLastName() + ","+ getFirstName();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public int getAge() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		int currentYear= calendar.get(Calendar.YEAR);
		calendar.setTime(getDateOfBirth());
		int currentMonth= calendar.get(Calendar.MONTH);
		calendar.setTime(getDateOfBirth());
		int currentDay= calendar.get(Calendar.DAY_OF_MONTH);
		calendar.setTime(getDateOfBirth());
		int birthYear = calendar.get(Calendar.YEAR);
		int birthMonth = calendar.get(Calendar.MONTH);
		int birthDay = calendar.get(Calendar.DAY_OF_MONTH);
		int Age=0;
		Age=currentYear-birthYear;
	    if(birthMonth<currentMonth||(birthMonth==currentMonth&&birthDay<currentDay)){
	    	return Age;
	    }
	    else{
	    	return Age-1;

	    }
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}
    


}
