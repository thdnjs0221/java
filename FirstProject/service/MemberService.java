package service;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import dao.MemberDAO;

public class MemberService {
   private static MemberService instance;

   private MemberService() {
   }

   public static MemberService getInstance() {
      if (instance == null)
         instance = new MemberService();
      return instance;
   }
   
   Scanner sc=new Scanner(System.in);
   MemberDAO dao=MemberDAO.getInstance();
   
   public List<Map<String, Object>> searchAll(){
	   return dao.searchAll();
   }
   
   public Map<String, Object> searchOne(){
	  System.out.println("ȸ�� ���̵�:");
	  String mid=sc.next();
	  return dao.searchOne(mid);
   }
   
   public int update() {
      int res=0;
      String mid ="";
      String flag ="";
      String pw="";
      String jumin="";
      int mileage =0;
      String updateSql="UPDATE tbl_member ";
      updateSql+=" SET ";
      while (true) {
         System.out.print("ȸ�� ���̵� : ");
         mid = sc.next();
         LoginService loginService = LoginService.getInstance();
         Map<String, Object>map = loginService.isDuplicate(mid);
         if (map == null) {
            System.out.println("ȸ�������� �����ϴ�");
         }else {
            break;
         }
      }

      System.out.print("��й�ȣ�� �����ϰڽ��ϱ�?(Y/N) : ");
      flag = sc.next();
      if(flag.equalsIgnoreCase("y")) {
         System.out.print("��й�ȣ : ");
         pw = sc.next();
         updateSql+=" MEM_PASS = '"+pw+"' ,";
      }

      System.out.print("�ֹι�ȣ�� �����ϰڽ��ϱ�?(Y/N) : ");
      flag = sc.next();
      if(flag.equalsIgnoreCase("y")) {
         System.out.print("�ֹε�Ϲ�ȣ : ");
         jumin = sc.next();
         updateSql+=" MEM_JUMIN = '"+jumin+"' ,";
      }
      
      System.out.print("���ϸ����� �����ϰڽ��ϱ�?(Y/N) : ");
      flag = sc.next();
      if(flag.equalsIgnoreCase("y")) {
         System.out.print("���ϸ��� : ");
         mileage = sc.nextInt();
         updateSql+="  MEM_MILEAGE = "+mileage+" ,";
      }      
      int len=updateSql.length();
      updateSql=updateSql.substring(0,len-2);
      updateSql=updateSql+" WHERE MEM_ID = '"+mid+"'";
      return dao.update(updateSql);
   }
}