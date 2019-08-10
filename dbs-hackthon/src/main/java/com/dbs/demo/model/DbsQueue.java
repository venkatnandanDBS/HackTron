/**
 * 
 */
package com.dbs.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Dinesh
 *
 */
@Table(name="DBS_QUEUE")
public class DbsQueue {

	
	@Column(name="QUEUE_ID")
	private int queueId;
	
	@Column(name="QUEUE_NAME")
	private String queueName;
	
	@Column(name="QUEUE_MAX_LENGTH")
	private long queueSize;

	
	
	
	public long getQueueSize() {
		return queueSize;
	}

	public void setQueueSize(long queueSize) {
		this.queueSize = queueSize;
	}

	public String getQueueName() {
		return queueName;
	}

	public void setQueueName(String queueName) {
		this.queueName = queueName;
	}

	public int getQueueId() {
		return queueId;
	}

	public void setQueueId(int queueId) {
		this.queueId = queueId;
	}

	
	
	
	
	
	
}
