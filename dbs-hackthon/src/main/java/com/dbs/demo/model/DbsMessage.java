/**
 * 
 */
package com.dbs.demo.model;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * @author Dinesh
 *
 */
@Table(name="MESSAGE")
public class DbsMessage {

	@Column(name="MESSAGE")
	public String message;
	
	@Column(name="QUEUE_ID")
	public int qId;

	
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getqId() {
		return qId;
	}

	public void setqId(int qId) {
		this.qId = qId;
	}
	
	
	
	
	
}
