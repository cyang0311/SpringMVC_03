package pojo;

import java.io.PrintWriter;
import java.util.List;

public class Menu {
    private int id;
    private String name;
    private int pid;
    private List<Menu> children;

    public Menu(){

    }
    public Menu(int id,String name) {
        this.id = id;
        this.name = name;
    }

    public Menu(int id) {
        this.id = id;
    }

    public Menu(int id, String name, int pid, List<Menu> children) {
        this.id = id;
        this.name = name;
        this.pid = pid;
        this.children = children;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public List<Menu> getChildren() {
        return children;
    }

    public void setChildren(List<Menu> children) {
        this.children = children;
    }

}
