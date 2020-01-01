package project;
import java.util.*;


public class Booking {
	private int orderId;
	private ArrayList<Integer> prodId = new ArrayList<Integer>();
	private ArrayList<Integer> quantity = new ArrayList<Integer>();
	private String billingAddr;
	private int userId;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public ArrayList<Integer> getProdId() {
		return prodId;
	}
	public void setProdId(ArrayList<Integer> prodId) {
		this.prodId = prodId;
	}
	public ArrayList<Integer> getQuantity() {
		return quantity;
	}
	public void setQuantity(ArrayList<Integer> quantity) {
		this.quantity = quantity;
	}
	public String getBillingAddr() {
		return billingAddr;
	}
	public void setBillingAddr(String billingAddr) {
		this.billingAddr = billingAddr;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}

}
