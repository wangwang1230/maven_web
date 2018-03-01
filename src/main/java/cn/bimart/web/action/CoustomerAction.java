/**
 * 
 */
package cn.bimart.web.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author wh
 *
 */
public class CoustomerAction extends ActionSupport {
	
	//url : 
	public String save() throws Exception{
		System.out.println("汪欢正在调用CustomerAction的save方法");
		return SUCCESS;
	}
}
