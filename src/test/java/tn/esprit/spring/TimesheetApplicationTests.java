package tn.esprit.spring;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.apache.log4j.Logger;
class TimesheetApplicationTests {
private static final Logger l = Logger.getLogger(TimesheetApplicationTests.class);
	@Test
	void contextLoads() {
			l.info("starting contextLoads : ");
			l.debug("Je vais lancer la divsion.");
		try {

		
			int i = 1/0;
			l.debug("Je viens de lancer la divsion. " + i);
			l.debug("Je viens de finir l'opération X.");
			l.info("Out getAllPrducts() without errors.");
}
catch (Exception e) { 
	l.error("Erreur dans contextLoads : " + e);
 }
		int a=33;
		int b=33;
		assertEquals(a,b,"yeaah its the same");
	}

}
