/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copyingobjects1;

/**
 *
 * @author hp
 */
public class wabi {
private String university;    
private String id;
private int year;
public wabi(String university,String id,int year){
 this.university=university;
 this.id=id;
 this.year=year;}
wabi(wabi x){
 this.copy(x); } 

public String getuniversity(){
 return university;   
}
public String getid(){
return id;    
}
public int getyear(){
 return year;   
}  

 public void setuniversity(String university){
    this.university=university; 
 }
 public void setid(String id){
 this.id=id;
 
 
}

 public void setyear(int year){

this.year=year;}

public void copy(wabi x){
this.setuniversity(x.getuniversity());
this.setid(x.getid());
this.setyear(x.getyear());
}

}
