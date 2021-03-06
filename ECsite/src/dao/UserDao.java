package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import model.UserBean;

public class UserDao extends Dao{

	public UserBean selectLogin(String loginCd,String loginPw){

		UserBean ub = null;

		try {
			connection();
			String query = "select * from user where login_cd= ? and login_pw= ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1,loginCd);
			pstmt.setString(2,loginPw);
			rs = pstmt.executeQuery();

			rs.next();
			ub = new UserBean(
				rs.getInt("user_id"),rs.getString("login_cd"),rs.getString("login_pw"));

		} catch(ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch(SQLException ex) {
			ex.printStackTrace();
		} finally {
			close();
		}

		return ub;
	}

	public ArrayList<String> selectAllAcount(String loginCd) {
		ArrayList<String> loginCdList = new ArrayList<>();

		try {
			connection();
			String query = "select * from user where login_cd = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1,loginCd);
			rs = pstmt.executeQuery();

			while(rs.next()) {
				loginCdList.add(rs.getString("login_cd"));
			}

		} catch(ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch(SQLException ex) {
			ex.printStackTrace();
		} finally {
			close();
		}

		return loginCdList;
	}

	public void insertAccount (String loginCd,String loginPw){

		try {
			connection();
			String query = "insert into user (login_cd,login_pw) values (?,?)";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1,loginCd);
			pstmt.setString(2,loginPw);
			pstmt.executeUpdate();

		} catch(ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch(SQLException ex) {
			ex.printStackTrace();
		} finally {
			close();
		}
	}

}
