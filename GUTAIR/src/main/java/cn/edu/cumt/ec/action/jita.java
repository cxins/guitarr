package cn.edu.cumt.ec.action;

import java.util.LinkedList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;
import cn.edu.cumt.ec.entity.GuitarSpec;
import cn.edu.cumt.ec.entity.guitar1;
import cn.edu.cumt.ec.service.guitarservice;

@SuppressWarnings("serial")
public class jita extends ActionSupport {
	  
	private String  builder, model, type, backWood, topWood,numStrings;
	  
	public String getBuilder() {
		return builder;
	}
	public void setBuilder(String builder) {
		this.builder = builder;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBackWood() {
		return backWood;
	}
	public void setBackWood(String backWood) {
		this.backWood = backWood;
	}
	public String getTopWood() {
		return topWood;
	}
	public void setTopWood(String topWood) {
		this.topWood = topWood;
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	List<guitar1> list=new LinkedList();
	public String find() throws Exception{
		
		 guitarservice guitarService=new  guitarservice();	
		 GuitarSpec spec =new GuitarSpec();
		 spec.setBuilder(builder);
		 spec.setTopWood(topWood);
		 spec.setBackWood(backWood);
		 spec.setModel(model);
		 spec.setType(type);
		 spec.setNumStrings(numStrings);
		 list=guitarService.CHAXUN(spec);
		 HttpServletRequest request=ServletActionContext.getRequest();
			request.setAttribute("GuitarList", list);
		 return SUCCESS;
      }
	public String getNumStrings() {
		return numStrings;
	}
	public void setNumStrings(String numStrings) {
		this.numStrings = numStrings;
	}
		
	}