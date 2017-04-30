package se.kth.assigment.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import se.kth.assigment.dto.AnimalSwimmerDTO;

/**
 * 
 * @author Hichem Memmi
 *@version 30/04/2017
 */
@RestController
public class AnimalController {

	/**
	 * This method triggered when we access this url http://localhost:8080/FinalAssigment/swimmers/{order}
	 * @param order
	 * @param swimmers
	 */
	@RequestMapping(value="/swimmers/{order}" , method=RequestMethod.PUT)
	public void getAnimals(@PathVariable(value="order") String order,
			@RequestBody List<AnimalSwimmerDTO> swimmers){
		System.out.println("List of Swimmers Sorted by date order "+order+" \n"+swimmers);
	}
}
