package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.CartBean;
import model.CartProductBean;

@WebServlet("/CartChangeServlet")
public class CartChangeServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int proCd = Integer.parseInt(request.getParameter("proCd"));
		int number = Integer.parseInt(request.getParameter("number"));

		HttpSession session = request.getSession(false);
		CartBean CartBean = (CartBean)session.getAttribute("cart");
		String proName = null;

		ArrayList<CartProductBean> CartProList = CartBean.getCartProList();
		for(CartProductBean cpb : CartProList) {
			if(cpb.getProCd()==proCd) {
				cpb.setNumber(number);
				proName = cpb.getProName();
			}
		}

		int total = 0;

		for(CartProductBean c : CartProList) {
			total += (c.getProPrice())*(c.getNumber());
		}

		int totalAndTax = (int)(total * 1.1);

		CartBean.setCartProList(CartProList);
		CartBean.setTotal(totalAndTax);
		CartBean.setTax(totalAndTax - total);

		session.setAttribute("cart", CartBean);
		request.setAttribute("message",proName+"の購入数を変更しました");

		request.getRequestDispatcher("/view/Cart.jsp").forward(request,response);
	}
}