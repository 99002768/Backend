package com.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="dristeem")
public class Dristeem {
	@Id
	int whatsNewID;
	String dcNUM;
	String whatsNewDescription;
	int visibleToRep;
	int visibleToOEM;
	int visibleToDriSalesAndEmp;
	int others;
	String moreInformation;
	Date createdDate;
	int createdByID;
	Date modifiedDate;
	int modifiedByID;
	
	public Dristeem(int whatsNewID, String dcNUM, String whatsNewDescription, int visibleToRep, int visibleToOEM,
			int visibleToDriSalesAndEmp, int others, String moreInformation, Date createdDate, int createdByID,
			Date modifiedDate, int modifiedByID) {
		super();
		this.whatsNewID = whatsNewID;
		this.dcNUM = dcNUM;
		this.whatsNewDescription = whatsNewDescription;
		this.visibleToRep = visibleToRep;
		this.visibleToOEM = visibleToOEM;
		this.visibleToDriSalesAndEmp = visibleToDriSalesAndEmp;
		this.others = others;
		this.moreInformation = moreInformation;
		this.createdDate = createdDate;
		this.createdByID = createdByID;
		this.modifiedDate = modifiedDate;
		this.modifiedByID = modifiedByID;
	}
	
	public Dristeem() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public int getWhatsNewID() {
		return whatsNewID;
	}
	public void setWhatsNewID(int whatsNewID) {
		this.whatsNewID = whatsNewID;
	}
	public String getDcNUM() {
		return dcNUM;
	}
	public void setDcNUM(String dcNUM) {
		this.dcNUM = dcNUM;
	}
	public String getWhatsNewDescription() {
		return whatsNewDescription;
	}
	public void setWhatsNewDescription(String whatsNewDescription) {
		this.whatsNewDescription = whatsNewDescription;
	}
	public int getVisibleToRep() {
		return visibleToRep;
	}
	public void setVisibleToRep(int visibleToRep) {
		this.visibleToRep = visibleToRep;
	}
	public int getVisibleToOEM() {
		return visibleToOEM;
	}
	public void setVisibleToOEM(int visibleToOEM) {
		this.visibleToOEM = visibleToOEM;
	}
	public int getVisibleToDriSalesAndEmp() {
		return visibleToDriSalesAndEmp;
	}
	public void setVisibleToDriSalesAndEmp(int visibleToDriSalesAndEmp) {
		this.visibleToDriSalesAndEmp = visibleToDriSalesAndEmp;
	}
	public int getOthers() {
		return others;
	}
	public void setOthers(int others) {
		this.others = others;
	}
	public String getMoreInformation() {
		return moreInformation;
	}
	public void setMoreInformation(String moreInformation) {
		this.moreInformation = moreInformation;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public int getCreatedByID() {
		return createdByID;
	}
	public void setCreatedByID(int createdByID) {
		this.createdByID = createdByID;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public int getModifiedByID() {
		return modifiedByID;
	}
	public void setModifiedByID(int modifiedByID) {
		this.modifiedByID = modifiedByID;
	}
	
	

}
