package tn.esprit.spring;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.apache.log4j.Logger;
import tn.esprit.spring.entities.*;
import tn.esprit.spring.services.*;

@SpringBootTest
class TimesheetApplicationTests {
	Employe em=new Employe("rrez", "eee", "aaze@yahoo.fr", false,Role.CHEF_DEPARTEMENT );
	EmployeServiceImpl emp=new EmployeServiceImpl();
	private static final Logger l = Logger.getLogger(TimesheetApplicationTests.class);
	@Autowired
	IEmployeService employeService;
	@Test
	void testAjoutEmployee() {
		int k=0;
		try {
			k=employeService.addOrUpdateEmploye(new Employe("hbiib", "raoudh", "saidhamouda67@yahoo.fr", "test123", false, Role.ADMINISTRATEUR));
		boolean test=(k!=0)?true:false;
		
		assertEquals(test, true,"ajout avec success de lemployee");
		
		if(test) {
			l.info("employee avec id "+k+" added successfully ");
		}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

	@Test
	void suppressionEmployee() {
		int nb_avans_suppression=employeService.getNombreEmployeJPQL();

		try {
			System.out.println(nb_avans_suppression);
			employeService.deleteEmployeById(2);
			int nb_apres_suppression=employeService.getNombreEmployeJPQL();
			System.out.println(nb_apres_suppression);
			boolean test=(nb_apres_suppression!=nb_avans_suppression)?true:false;
		
		assertEquals(test, true,"supprimee  avec success de lemployee");
		
		if(test) {
			l.info("employee avec id "+2+" deleted  successfully ");
		}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}



	
}
