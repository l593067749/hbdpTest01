package examples.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import examples.bean.Users;
import examples.mapper.UsersMapper;

public class TestUsersService {

  @SuppressWarnings("unchecked")
  public static void main(String[] args) throws ParseException {
      ApplicationContext ac = 
      new ClassPathXmlApplicationContext("classpath:/examples/service/spring.xml");
      UsersMapper<Users> dao = (UsersMapper<Users>)ac.getBean("dao");
      
      //删除表中所有信息
      Users nullBean = new Users();
      List<Users> delList = dao.queryByList(nullBean);
      if(delList != null) {
        for(Users user : delList) {
          dao.delete(user.getId());
        }
      }
      
      //新增
      Users bean = new Users();
      bean.setName("ding");
      bean.setSex("男");
      bean.setBirs(new SimpleDateFormat("yyyy-MM-dd").parse("1985-01-01"));
      bean.setMessage("This is Clob!");
      dao.add(bean);
      
      List<Users> list = dao.queryByList(nullBean);
      if(list != null) {
        for(Users user : list) {
          System.out.println(user);
        }
      }
      
      //查询并更新
      bean = new Users();
      bean.setName("ding");
      List<Users> queList = dao.queryByList(bean);
      if(queList != null) {
        for(Users user : list) {
          user.setSex("女");
          dao.updateBySelective(user);
        }
      }
      
      list = dao.queryByList(nullBean);
      if(list != null) {
        for(Users user : list) {
          System.out.println(user);
        }
      }
      
      //查询并更新
      bean = new Users();
      bean.setName("ding");
      List<Users> queList2 = dao.queryByList(bean);
      if(queList != null) {
        for(Users user : queList2) {
          user.setSex("男");
          user.setMessage("");
          dao.update(user);
        }
      }
      
      list = dao.queryByList(nullBean);
      if(list != null) {
        for(Users user : list) {
          System.out.println(user);
        }
      }
      
      
      int num = dao.queryByCount(nullBean);
      System.out.println("num=" + num);
      
  }

}