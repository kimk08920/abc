package db;

import java.sql.Connection;
import java.util.List;

public class MemberDao {

	Connection conn;

	public MemberDao(DBConnect db) {
		this.conn = db.getConn();
		if (conn != null) {
			System.out.println("DB ���� �ſ� ������");
		}
	}

	public void insert(MemberVo vo) {

	}

	public void update(MemberVo vo) {

	}
	
	public void delete(MemberVo vo) {

	}
	
	public MemberVo view(MemberVo vo) {
		MemberVo v = null;
		return v;
	}
	
	public List<MemberVo> select(MemberVo vo) {
		List<MemberVo> list = null;
		
		return list;
	}

}
