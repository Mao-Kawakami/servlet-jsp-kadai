package forms;

import java.io.IOException;
import java.util.Objects;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConfirmServlet extends HttpServlet {
	// POST
	public void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		
		// エンコード設定
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		// 入力内容を取得
		String userName = request.getParameter("name");
		String userEmail = request.getParameter("email");
		String userAddress = request.getParameter("address");
		String userPhoneNubmer = request.getParameter("phone_number");
		
		// 文字列に置き換える
		userName = Objects.toString(userName, "");
		userEmail = Objects.toString(userEmail, "");
		userAddress = Objects.toString(userAddress, "");
		userPhoneNubmer = Objects.toString(userPhoneNubmer, "");
		
		// データを保存
		request.setAttribute("name", userName);
		request.setAttribute("email", userEmail);
		request.setAttribute("address", userAddress);
		request.setAttribute("phone_number", userPhoneNubmer);
		
		// フォワードによる画面遷移
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/pages/confirmPage.jsp");
		dispatcher.forward(request, response);
	}
}
