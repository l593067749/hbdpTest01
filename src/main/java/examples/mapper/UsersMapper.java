package examples.mapper;

import java.util.List;

public interface UsersMapper<T> {

  public void add(T t);

  public void update(T t);

  public void updateBySelective(T t);

  public void delete(Object id);

  public T queryById(Object id);
  
  public List<T> queryBySelective(T t);
  
  public int queryByCount(T t);

  public List<T> queryByList(T t);
  
}