package pe.com.peruInka.core.dao;

import java.util.List;

import pe.com.peruInka.core.domain.StatusTicketDescription;

public class TicketDescriptionDAOImpl extends BaseDAOHibernate implements DescriptionTicketDAO{

	

	public List<TicketDescription>findAllDescriptionTicket(){
		return find(TicketDescription.class,"from DescriptionTicket");
	}
	
	public List<StatusTicketDescription> findStatusTicketDescription() {
		return find(StatusTicketDescription.class, "from StatusTicketDescription");
	}

	
	
	
	
	

	public TicketDescription TicketDescriptionById(Long id) {
		return findById(TicketDescription.class, id);
	}

	public void deleteTicketDescription(TicketDescription ticketDescription) {
		delete(ticketDescription);
	}

	public List<TicketDescription> findAllTicketDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	public void saveTicketDescription(TicketDescription ticketDescription) {
		// TODO Auto-generated method stub
		
	}

	public TicketDescription findTicketDescriptionById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
