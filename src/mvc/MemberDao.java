package mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDao {
	Connection conn;
	
	public MemberDao(DBConnect db){
		this.conn = db.getConn();
	}
	
	public MemberVo view(MemberVo vo) {
		MemberVo v = new MemberVo();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			String sql = "select * from member where userid = ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getUserid());
			rs = ps.executeQuery();
			if (rs.next()) {
				v.setUserpwd(rs.getString("userpwd"));
			} else {
				v.setUserpwd("!");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		v.setUserid(vo.getUserid());
		
		return v;
	}
}