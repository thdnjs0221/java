package dbtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DbExample01 {

	String url = "jdbc:oracle:thin:@localhost:1521:xe"; // �ܿ�� @������ ip
	String user = "pc14";
	String passwd = "java";

	Connection conn = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public static void main(String[] args) {
	//	new DbExample01().dbConnection(); // �ڱ� �����ϰ� ���� static���̵� ��������
		int res = new DbExample01().dbInsert();
		if (res > 0) {
			System.out.println("�ڷ��Է� ����");
		}
	}

	public void dbConnection() {
		try {
			conn = DriverManager.getConnection(url, user, passwd); // DriverManager Ŭ���� �̸� getConnection�޼ҵ� �̸�
			System.out.println("DB ���� ����");
			stmt = conn.createStatement();
			String sql = "select EMPNO,ENAME,JOB FROM TEMP "; // ����Ŭ �ڵ���.�÷��� ��ҹ��� �������
			rs = stmt.executeQuery(sql); // executeQuery- ����Ʈ������ , executeupdate -INSERT / DELETE / UPDATE ���� ���������� �ݿ���
											// ���ڵ��� �Ǽ��� ��ȯ�մ�

			while (rs.next()) {// next()- ��� ���տ��� �����Ͱ� ������ false, �����Ͱ� �����ϸ� ��ù��° ������ �������� true
				String eid = rs.getString("EMPNO"); // ����Ŭ �÷��� ���ڿ��� �����Ͷ�(db������ Ÿ�� �� �˾Ƶα�)
				String eName = rs.getNString("ENAME");// ����Ŭ �÷���
				String job = rs.getString(3);// ����Ŭ �ε��� 1���ͽ���

				System.out.printf("%5s %7s %10s\n", eid, eName, job);
				// �ٽ� while������ ���� 2��° ������ ������ ��������

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {if(rs!=null)
			try {
				rs.close();
			} catch (Exception e) {
			}
			if (stmt != null)
				try {
					stmt.close();
				} catch (Exception e) {
				}
			if (conn != null)
				try {
					conn.close();
				} catch (Exception e) {
				}
		}
	}

	public int dbInsert() {
		Scanner sc = new Scanner(System.in);
		int res = 0;
		System.out.println("[������� �Է�]");
		System.out.println("�����ȣ: ");
		String eid = sc.nextLine();

		System.out.println("����̸�: ");
		String name = sc.nextLine();

		System.out.println("�����ڵ�: ");
		String jid = sc.nextLine();

		System.out.println("�μ���ȣ: ");
		String deptid = sc.nextLine();
		// int res=0;

		try {
			conn = DriverManager.getConnection(url, user, passwd); // DriverManager Ŭ���� �̸� getConnection�޼ҵ� �̸�
			String sql = "insert into TEMP values(?,?,?,?) "; // ����Ŭ �ڵ���.�÷��� ��ҹ��� ������� /values��簪 �� ����

			pstmt = conn.prepareStatement(sql); // sql��ü�� ������
			pstmt.setNString(1, eid);
			pstmt.setNString(2, name);
			pstmt.setNString(3, jid);
			pstmt.setNString(4, deptid);

			res = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (Exception e) {
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (Exception e) {
				}
			if (conn != null)
				try {
					conn.close();
				} catch (Exception e) {
				}
		}
		return res;
	}
}