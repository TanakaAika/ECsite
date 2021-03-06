package model;

import java.util.ArrayList;

public class CartBean {

	private int userId;
	private ArrayList<CartProductBean> cartProList;
	private int tax;
	private int total;

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public ArrayList<CartProductBean> getCartProList() {
		return cartProList;
	}
	public void setCartProList(ArrayList<CartProductBean> cartProList) {
		this.cartProList = cartProList;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
}
