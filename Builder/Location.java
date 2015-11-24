import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

interface Location extends Serializable{
	public String getLocation();
	public void setLocation(String newLocation);
}