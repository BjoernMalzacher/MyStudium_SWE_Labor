package application.domain;

import application.domain.impl.DomainImpl;
import application.domain.port.Domain;

public class DomainFacade implements DomainFactory, Domain{

	
	private DomainImpl domain = new DomainImpl();
	
	
	@Override
	public synchronized Domain domain() {
		if (this.domain == null)
				this.domain = new DomainImpl();
			return this;
		}

	
	@Override
	public synchronized Object mkObject() {
		return this.domain.mkObject();
	}




}
