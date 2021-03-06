package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import model.CategoryBean;

public class CategoryDao extends Dao{

	public ArrayList<CategoryBean> selectCategory(){

		ArrayList<CategoryBean> CategoryList = new ArrayList<>();

		try {
			connection();
			stmt = conn.createStatement();
			String query = "select * from category;";
			rs = stmt.executeQuery(query);

			while(rs.next()){
				CategoryBean CategoryBean = new CategoryBean(
						rs.getInt("cat_id"),rs.getString("cat_name"));

				CategoryList.add(CategoryBean);
			}

		} catch(ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch(SQLException ex) {
			ex.printStackTrace();
		} finally {
			close();
		}

		return CategoryList;
	}

}
