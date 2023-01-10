package com.libraryManagement.app.enums;

public enum Star_Rating {

     first("first"),
     second("second"),
     third("third"),
     fourth("fourth"),
     fifth("fifth");
     
     public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	private String rating;
     private Star_Rating(String rating){
    	 this.rating=rating;	
	}
      
    
     
    
	

}
