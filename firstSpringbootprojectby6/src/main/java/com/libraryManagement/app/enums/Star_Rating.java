package com.libraryManagement.app.enums;

public enum Star_Rating {

	 zero("0"),
     first("1"),
     second("2"),
     third("3"),
     fourth("4"),
     fifth("5");
     
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
