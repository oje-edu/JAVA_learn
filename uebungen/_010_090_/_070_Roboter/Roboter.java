package uebungen._010_090_._070_Roboter;

public class Roboter {
	
    private String name;
    
    protected Roboter(String name) {
    	setName(name);
    }
    
    public String getName() { 
    	return name;
    }
    
    public void setName(String name) {
    	if (name.equals("Bernd")) {
    		setName("Herbert");
    	} else {
    		this.name = name; 
    	}
    }
}
