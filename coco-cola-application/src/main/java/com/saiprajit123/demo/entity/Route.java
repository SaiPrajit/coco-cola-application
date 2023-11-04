package com.saiprajit123.demo.entity;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
@Entity
@Table(name="route")

public class Route {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long UID;
	private String Codee;
	private String Namee;
	private int FromDate;
	private int ToDate;
	private byte IsActive;
	private String WarehouseUID;
	private String UserUID;
	
	public Route() {
		super();
	}
	
	public Route(int UID,String Codee,String Namee,int FromDate,int ToDate,byte IsActive,String WarehouseUID,String UserUID) 
	{
		super();
		this.UID=UID;
		this.Codee=Codee;
		this.Namee=Namee;
		this.FromDate=FromDate;
		this.ToDate=ToDate;
		this.IsActive=IsActive;
		this.WarehouseUID=WarehouseUID;
		this.UserUID=UserUID;
		
	}
	public int getUID() {
		return UID;
	}
	public void setUID(int UID) {
		UID = UID;
	}
	
	
	public String getCodee() {
		return Codee;
	}
	public void setCodee(String codee) {
		Codee = codee;
	}
	public String getNamee() {
		return Namee;
	}
	public void setNamee(String namee) {
		Namee = namee;
	}
	public int getFromDate() {
		return FromDate;
	}
	public void setFromDate(int fromDate) {
		FromDate = fromDate;
	}
	public int getToDate() {
		return ToDate;
	}
	public void setToDate(int toDate) {
		ToDate = toDate;
	}
	public byte getIsActive() {
		return IsActive;
	}
	public void setIsActive(byte isActive) {
		IsActive = isActive;
	}
	public String getWarehouseUID() {
		return WarehouseUID;
	}
	public void setWarehouseUID(String warehouseUID) {
		WarehouseUID = warehouseUID;
	}
	public String getUserUID() {
		return UserUID;
	}
	public void setUserUID(String userUID) {
		UserUID = userUID;
	}

	@Override
	public String toString() {
		return "route [UID=" + UID + ", Codee=" + Codee + ", Namee=" + Namee + ", FromDate=" + FromDate + ", ToDate="
				+ ToDate + ", IsActive=" + IsActive + ", WarehouseUID=" + WarehouseUID + ", UserUID=" + UserUID + "]";
	}

}
