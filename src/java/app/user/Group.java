
package app.user;


public class Group
{
    private int id;
    private String name;
//    private String password;
//    private String email;
//    private int userId;
//    private int groupId;

    public Group(int id, String name)
    {
        this.id = id;
        this.name = name;
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
   
    
}
