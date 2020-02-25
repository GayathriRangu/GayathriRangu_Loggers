import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.gayathri.houseConstructionCost.*;


public class FactoryMain {
	private static final Logger LOG=LogManager.getLogger(FactoryMain.class);
	
	public static void main(String[] args) {
		  LOG.debug("debug stmnt");
		  LOG.fatal("fatal error");
    HouseFactory houseFactoryObject=new HouseFactory();
    HouseConstructionCost object=houseFactoryObject.getInstance("standard");
	object.calculatingTotalCost(100, "standard");
    System.out.println(object.totalCostOfHouse+"INR");


	}

}
