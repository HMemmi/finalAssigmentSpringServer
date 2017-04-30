package se.kth.assigment.dto;

import java.io.Serializable;

import org.springframework.stereotype.Component;

/**
 * This class is to bind the object received from FinalAssigment project to a AnimalSwimmerDTO
 * @author Hichem Memmi
 * @version 30/04/2017
 * 
 *
 */

@Component
public  class AnimalSwimmerDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2681718747150764740L;
	private String type;
	private String name;


	private String year;

	/**
	 * Default constructor
	 */
	
	public AnimalSwimmerDTO(){
		
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return this.getType() + ", " + this.getName() + ", " + this.getYear() + "\n";
	}
	

}
