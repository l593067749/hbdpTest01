package examples.bean;

import java.util.Date;

import oracle.sql.CLOB;

public class Users
{
    private Integer id;
    private String name;
    private String sex;
    private Date birs;
    private String Message;
    public Integer getId()
    {
        return id;
    }
    public void setId(Integer id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getSex()
    {
        return sex;
    }
    public void setSex(String sex)
    {
        this.sex = sex;
    }
    public Date getBirs()
    {
        return birs;
    }
    public void setBirs(Date birs)
    {
        this.birs = birs;
    }
    public String getMessage()
    {
        return Message;
    }
    public void setMessage(String message)
    {
        Message = message;
    }
    
}
