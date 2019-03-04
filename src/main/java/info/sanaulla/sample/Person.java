package info.sanaulla.sample;

import java.util.Date;

import lombok.Data;
import lombok.Generated;

@Data
public class Person {

	@Generated
	private Integer id;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private String placeOfBirth;
}
