package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class packageinfo {

	@Test
	void testconstructor() {
		//given
		var number = 21318;
		var name = "La cabane dans l'arbre";
		//when
		var boite = new BoiteLego(21318, "La cabane dans l'arbre");
		//then
		assertAll(
				() -> assertEquals(number, boite.getNumber(),"number"),
				() -> assertEquals(name, boite.getName(), "name")
		);
	}

}
