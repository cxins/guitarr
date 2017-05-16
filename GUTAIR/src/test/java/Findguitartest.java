import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;

import java.util.List;

import org.junit.Test;

import cn.edu.cumt.ec.dbutil.DbUtil;
import cn.edu.cumt.ec.entity.Builder;
import cn.edu.cumt.ec.entity.GuitarSpec;
import cn.edu.cumt.ec.entity.Inventory;
import cn.edu.cumt.ec.entity.Type;
import cn.edu.cumt.ec.entity.guitar1;

public class Findguitartest {
	@Test
	public void test() {
	       DbUtil dbUtil=new DbUtil();
	        Inventory inventory=new Inventory();
	        ResultSet rs=dbUtil.executeQuery("select * from guitar",new Object[]{});
	        try {
	            while(rs.next()){
	                String serialNumber=rs.getString(1);
	                Double price=rs.getDouble(2);
	                GuitarSpec spec1=new GuitarSpec();	
	                spec1.setBuilder(rs.getString(3));
	                spec1.setModel(rs.getString(4));
	                spec1.setType( rs.getString(5));
	                spec1.setNumStrings(rs.getString(6));
	                spec1.setBackWood( rs.getString(7));
	                spec1.setTopWood( rs.getString(8));
	                inventory.addGuitar(serialNumber, price, spec1);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        @SuppressWarnings({ "rawtypes", "unchecked" })
  
    GuitarSpec whatErinLikes = 
      new GuitarSpec("","","electric","","","");
    List matchingGuitars = inventory.search(whatErinLikes);
    if (!matchingGuitars.isEmpty()) {
      System.out.println("Erin, you might like these guitars:");
      for (Iterator i = matchingGuitars.iterator(); i.hasNext(); ) {
        guitar1 guitar = (guitar1)i.next();
        GuitarSpec spec = guitar.getSpec();
        System.out.println("  We have a " +
          spec.getBuilder() + " " + spec.getModel() + " " +
          spec.getType() + " guitar:\n     " +
          spec.getBackWood() + " back and sides,\n     " +
          spec.getTopWood() + " top.\n  You can have it for only $" +
          guitar.getPrice() + "!\n  ----");
      }
    } else {
      System.out.println("Sorry, Erin, we have nothing for you.");
    }
  
  }
}
