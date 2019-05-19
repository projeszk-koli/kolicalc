package hu.elte.koliCalc;

import hu.elte.koliCalc.controllers.FamilyInformationControllerTest;
import hu.elte.koliCalc.controllers.PersonalInformationControllerTest;
import hu.elte.koliCalc.controllers.RelativeControllerTest;
import hu.elte.koliCalc.controllers.SportInformationControllerTest;
import hu.elte.koliCalc.controllers.StudyInformationControllerTest;
import hu.elte.koliCalc.controllers.UserControllerTest;
import junit.framework.TestSuite;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KoliCalcApplicationTests {
    
//Nem tudom kell-e ez még ide
// Tesztelem a travis email kuldest

	@Test
	public void contextLoads() {
	}

    public static void main(String[] args){
        junit.textui.TestRunner.run(KoliCalcApplicationTests.suite());
    }
    
    public static TestSuite suite(){
        TestSuite suite = new TestSuite();
        
        suite.addTestSuite(FamilyInformationControllerTest.class);
        suite.addTestSuite(PersonalInformationControllerTest.class);
        suite.addTestSuite(RelativeControllerTest.class);
        suite.addTestSuite(SportInformationControllerTest.class);
        suite.addTestSuite(StudyInformationControllerTest.class);
        suite.addTestSuite(UserControllerTest.class);
        
        return suite;
    }
}
