
package app.user;


public class Group
{
    private int id;
    private String name;
    private String password;
    private String email;
    private int userId;
    private int groupId;

    public Group(int id, String name, String password, String email, int userId, int groupId)
    {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.userId = userId;
        this.groupId = groupId;
    }
    
    
    public int getId()
    {
        return id;
    }

    public void setId(int id)
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

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public int getUserId()
    {
        return userId;
    }

    public void setUserId(int userId)
    {
        this.userId = userId;
    }

    public int getGroupId()
    {
        return groupId;
    }

    public void setGroupId(int groupId)
    {
        this.groupId = groupId;
    }

    @Override
    public String toString()
    {
        return "Group{" + "id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + ", userId=" + userId + ", groupId=" + groupId + '}';
    }
    
    
    
}
