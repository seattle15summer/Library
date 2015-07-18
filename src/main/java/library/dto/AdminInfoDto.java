/**
 * 
 */
package library.dto;

import library.entity.Admin;

/**
 * @author andoharuka
 *
 */
public class AdminInfoDto {

	public String mail;
	public String password;
	
	public AdminInfoDto() {}
	
	public AdminInfoDto(Admin admin){
		
		this.mail = admin.mail;
		this.password = admin.password;

	}
	
}
