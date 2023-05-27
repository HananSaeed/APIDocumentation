package application;


import java.util.ArrayList;
import java.util.List;




public class API {
	private String name;
 	private String Http;
 	private String URL ;
 	private	ArrayList<objects> object;
 	  public API() {
 	    	object = new ArrayList<objects>(); 
 	 	}
 	 	
 	 public ArrayList<objects> getobject(){
  		return object;
  	}
  	public void setobject(ArrayList<objects> extractedAPIData) {
  		this.object = extractedAPIData;
  	}
  	public void setname(String name) {
  		this.name=name;
  	}
  	public String getname() {
  		return name;
  	}
  	public void setHttp(String Http) {
  		this.Http=Http;
  	}
  	public String getHttp() {
  		return Http;
  	}
  	public void setURL(String URL) {
  		this.URL=URL;
  	}
  	public String getURL() {
  		return URL;
  	}
  	public void Addobject(objects o) {
  		this.object.add(o);
  	}
	}
