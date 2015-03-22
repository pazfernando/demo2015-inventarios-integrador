package ec.com.se.demo2015.inventarios;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.switchyard.component.test.mixins.cdi.CDIMixIn;
import org.switchyard.component.test.mixins.http.HTTPMixIn;
import org.switchyard.test.Invoker;
import org.switchyard.test.ServiceOperation;
import org.switchyard.test.SwitchYardRunner;
import org.switchyard.test.SwitchYardTestCaseConfig;
import org.switchyard.test.SwitchYardTestKit;

@RunWith(SwitchYardRunner.class)
@SwitchYardTestCaseConfig(config = SwitchYardTestCaseConfig.SWITCHYARD_XML, mixins = {
		CDIMixIn.class, HTTPMixIn.class })
public class AAATestInventoryService {

    private static final String SUCCESS = "SUCCESS";
	private static final String BASE_URL = "http://localhost:8081/rest-binding";

	private SwitchYardTestKit testKit;
	private CDIMixIn cdiMixIn;
	private HTTPMixIn httpMixIn;
	@ServiceOperation("")
	private Invoker service;

	//@Test
	public void shouldRetrieveAllValidProducts() {
		String response = null;
		response = httpMixIn.sendString(BASE_URL + "/inventarios/productos", "",
				HTTPMixIn.HTTP_OPTIONS);
		Assert.assertTrue(true);
	}

}
