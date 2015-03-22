package ec.com.se.demo2015.inventarios;

import org.switchyard.Exchange;
import org.switchyard.component.resteasy.composer.RESTEasyBindingData;
import org.switchyard.component.resteasy.composer.RESTEasyMessageComposer;

public class SEMessageComposer extends RESTEasyMessageComposer {

	@Override
	public RESTEasyBindingData decompose(Exchange exchange,
			RESTEasyBindingData target) throws Exception {
		System.out.println("exchange: " + exchange);
		System.out.println("operationName: " + target.getOperationName());
		return super.decompose(exchange, target);
	}

}
