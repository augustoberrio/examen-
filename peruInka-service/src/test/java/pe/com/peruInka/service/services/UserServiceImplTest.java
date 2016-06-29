package pe.com.peruInka.service.services;

import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImplTest extends AbstractUnitTest {

	
	@Autowired
	protected PeruInkaService peruInkaService;
	
	public void test() {
		System.out.println(peruInkaService);
	}

}
