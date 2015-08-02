package dao;

import java.lang.reflect.Field;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

import model.admin;

public class wddbDao {
	private static String db_driver = "com.mysql.jdbc.Driver";//数据库驱动
	private static String db_url = "jdbc:mysql://localhost:3306/wandafilm?userUnicode=true&characterEncoding=utf-8";//连接字符串
	private static String db_userName = "root";//用户名
	private static String db_userPass = "123456";//用户密码
	private static String db_state = "";//状态
	private static String db_dataBaseName = "";//数据库名
	
	private static Connection conn = null;//连接对象
	private static PreparedStatement pst = null;//预编译对象
	private static CallableStatement cs= null;
	public static ResultSet res = null;//结果集对象
	private static Statement st = null;	
	
	/**
	 * 创建数据库连接
	 * @return
	 */
	public static Connection getConn(){		
		try {
			Class.forName(db_driver);
			conn = java.sql.DriverManager.getConnection(db_url, db_userName, db_userPass);
			//conn.setAutoCommit(false);		//关闭自动提交功能，改为人工提交事务
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
	/**
	 * 关闭数据库参数
	 */
	public static void close(){
		try {
			if(res != null){
				res.close();
			}
			if(pst != null){
				pst.close();
			}
			if(st != null){
				st.close();
			}
			if(cs != null){
				cs.close();
			}
			if(conn != null){
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/*数据的增删改
	 * 
	 */
  public int executeUpdate(String sql,Object...objects)throws SQLException{
      //受影响行数
	  int lines=0;
	  conn=getConn();
	  
	  pst=conn.prepareStatement(sql);
	  
	  for(int i=0;i<objects.length;i++){
		  
		  pst.setObject(i+1, objects[i]);
	  }
	  lines=pst.executeUpdate();
	 //lines=pst.executeUpdate();
	  return lines;
  }
  /*
   *增删改（带回滚操作） 
   * */
  public int executeUpdateRB(String sql,Object...objects){
	  int rbLines=0;
	  conn=getConn();
	  try {
		conn.setAutoCommit(false);
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}//connection的默认提交方式是true
	try{  pst=conn.prepareStatement(sql);
	  for(int i=0;i<objects.length;i++){
		  pst.setObject(i+1, objects[i]);
		  rbLines++;
		  pst.executeUpdate();
	  }
	  
	  conn.commit();//提交JDBC事务，如果没问题，这时才真正的删除了;
	}
	catch(Exception ex){
		try {
			conn.rollback();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	  return rbLines;	 
}
  
 /**
  * 查询操作
 * @param <E>
  * 
  */
  public  ResultSet querrySQL(String sql){
	  int lines=0;//查询结果数
	  ArrayList<admin> E=new ArrayList<admin>();//放置查询结果
	  try {
		  conn=getConn();
		  pst=conn.prepareStatement(sql);
	} catch (SQLException e1) {
		System.out.println("生成初始化sql语句出错");
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}	   
	try {
		res= pst.executeQuery();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return res; 
  } 
  /*
   * 查找某表符合某参数结果
   * 返回ResultSet
   */
 public static ResultSet querrySQL(String sql,Object...objects){
	  
	  conn=getConn();
	  
	try{  pst=conn.prepareStatement(sql);
	  for(int i=0;i<objects.length;i++)
		  pst.setObject(i+1, objects[i]);
	  res=pst.executeQuery();
	
	}catch(Exception ex){
		ex.printStackTrace();
	}
     return res;
 }
  
  /**
	 * 反射实现的新增操作 
	 * @param  clssname——完整的类名信息
	 * @param param
	 * @return
	 */
	public void insert(Object obj) throws Exception {  
	      
	    try {  
	        conn = getConn();  
	        Class  tableClass = obj.getClass();
	        Field[] fields = tableClass.getFields();  
	        
	        // 下面一段代码准备SQL语句的两部分。  
	        StringBuilder sb1 = new StringBuilder();  
	        StringBuilder sb2 = new StringBuilder();  
	  
	        for (int i = 0; i < fields.length; i++) {  
	            if(i>0) {  
	                sb1.append(",");  
	                sb2.append(",");  
	            }  
	            sb1.append(fields[i].getName());  
	            sb2.append("?");  
	        }  
	  
	        String commaSeparatedFieldNames = sb1.toString();  
	        String commaSeparatedQuestionMarks = sb2.toString();  
	        
	        
	        // 安全起见，我们需要用prepareStatement处理用户输入。  
	        // 但是因为类的名称是可以由程序员控制的，我们用String.format生成语句  
	        pst = conn.prepareStatement(String.format(  
	                    "INSERT INTO %s(%s) values(%s)",  
	                    tableClass.getSimpleName(), commaSeparatedFieldNames,  
	                    commaSeparatedQuestionMarks));  
	  
	        // 然后，填充这个PreparedStatement  
	        for (int i = 0; i < fields.length; i++) {  
	            pst.setObject(i + 1, fields[i].get(obj));  
	        }  
	        pst.executeUpdate();  
	    } finally {  
	        close();
	    }  
	}   
}
