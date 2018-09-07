package cap.action;

public class HelloWordAction extends ActionSupport{
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
/*
Struts2 action的默认方法
 */
public String execute(){
    return SUCCESS;
}
}

