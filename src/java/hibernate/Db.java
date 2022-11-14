package hibernate;
public class Guestbook implements java.io.Serializable {
private Integer no;
private String name;
private String msg;
private String dt;
public Guestbook() {
}
public Guestbook(String name, String msg, String dt) {
this.name = name;
this.msg = msg;
this.dt = dt;
}
public Integer getNo() {
return this.no;
}
public void setNo(Integer no) {
this.no = no;
}
public String getName() {
return this.name;
}
public void setName(String name) {
    this.name = name;
}
public String getMsg() {
return this.msg;
}
public void setMsg(String msg) {
this.msg = msg;
}
public String getDt() {
return this.dt;
}
public void setDt(String dt) {
this.dt = dt;
}
}
/**
 * Select Services -> right click on database -> connect -> password -> ok ->again right
click on database -> create database -> db -> ok.
Expand db -> Select and right click table -> click on Execute command ->
Create table guestbook (no int primary key auto_increment, name varchar(20), msg
varchar(100), dt varchar(40));
 */