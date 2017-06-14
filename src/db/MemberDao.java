package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MemberDao {
	Connection conn;
	String sql = "";
	
	public MemberDao(DBConnect db){
		this.conn = db.getConn();
		if(conn != null){
			System.out.println("DB가 정상적으로 연결됨");
		}
	}
	
	public void insert(MemberVo vo){
		this.sql = "insert into member values()";
		System.out.println("insert");
		
	}
	public void update(MemberVo vo){
		this.sql = "update member set";
		System.out.println("update");
	}
	public void delete(MemberVo vo){
		this.sql = "delete member where";
		System.out.println("delete");
	}
	public MemberVo view(MemberVo vo){
		MemberVo v = null;
		this.sql = "select from member where serial = ?";
		System.out.println("view");
		return v;
	}
	
	@SuppressWarnings("finally")
	public List<MemberVo> select(MemberVo vo){
		List<MemberVo> list = null;
		
		MemberVo v = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "";
		list = new ArrayList<MemberVo>();
		try{
			sql = "select * from member";
			this.sql = sql;
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				v = new MemberVo();
				v.setName(rs.getString("name"));
				list.add(v);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			return list;
		}
	}
	public String getSql(){
		return this.sql;
	}
}