package aufgaben._070_._OJE_.Roboter;

public class Roboter {
	
    private String name;
    
    protected Roboter(String name) { 
    	this.name = name;
    	
    	if (name == "Bernd") {
    		
    		this.name = "Herbert";
    	}
    }
    
    public String getName() { 
    	return name;
    }
    
    public void setName(String name) { 
    	this.name = name; 
    }
}
