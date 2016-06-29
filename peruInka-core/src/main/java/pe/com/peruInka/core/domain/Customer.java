package pe.com.peruInka.core.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author omari
 *
 */

public class Customer extends BaseEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;	
	
	private String enterpriceId   ;
	private String personId  ;
	private StatusCustomer statusCuscomer  ;
	private String createdBy  ;
	private Date dateCreated   ;
	private Date dateLastUpdated  ;
	private String lastUpdatedBy    ;
	private Integer version   ;
	
	
	public String getEnterpriceId() {
		return enterpriceId;
	}
	public void setEnterpriceId(String enterpriceId) {
		this.enterpriceId = enterpriceId;
	}
	public String getPersonId() {
		return personId;
	}
	public void setPersonId(String personId) {
		this.personId = personId;
	}
	public StatusCustomer getStatusCuscomer() {
		return statusCuscomer;
	}
	public void setStatusCuscomer(StatusCustomer statusCuscomer) {
		this.statusCuscomer = statusCuscomer;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public Date getDateLastUpdated() {
		return dateLastUpdated;
	}
	public void setDateLastUpdated(Date dateLastUpdated) {
		this.dateLastUpdated = dateLastUpdated;
	}
	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}
	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	
	

	



}
