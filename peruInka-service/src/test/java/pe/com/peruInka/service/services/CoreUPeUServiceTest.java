package pe.com.peruInka.service.services;

import org.springframework.beans.factory.annotation.Autowired;

public class CoreUPeUServiceTest extends AbstractUnitTest{

	
	@Autowired
	protected PeruInkaService peruInkaService;
	
	public void test() {
		System.out.println(peruInkaService);
	}

}
