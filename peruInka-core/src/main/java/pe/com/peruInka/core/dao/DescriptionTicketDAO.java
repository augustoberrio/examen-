package pe.com.peruInka.core.dao;

import java.util.List;

import pe.com.peruInka.core.domain.StatusTicketDescription;

public interface DescriptionTicketDAO {

	
	 List<TicketDescription>findAllTicketDescription();
	 List<StatusTicketDescription> findStatusTicketDescription() ;
	 void saveTicketDescription(TicketDescription ticketDescription);
	 TicketDescription findTicketDescriptionById(Long id);
	 void deleteTicketDescription(TicketDescription ticketDescription);
	 
}
