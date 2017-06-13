package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BoardDao {
	
	Connection conn;
	

	public BoardDao(DBConnect db) {
		this.conn = db.getConn();
	}
	
	public BoardVo view(BoardVo vo) {
		BoardVo v = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			String sql = "select * from board where serial = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, vo.getSerial());
			rs = ps.executeQuery();
			
			if (rs.next()) {
				v = new BoardVo();
				v.setSerial(rs.getInt("serial"));
				v.setSubject(rs.getString("subject"));
				v.setWorker(rs.getString("worker"));
				
			}
		} catch (Exception ex) {
			v = null;
		} finally {
			return v;
		}
	}

}
