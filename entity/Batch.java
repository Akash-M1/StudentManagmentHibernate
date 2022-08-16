package co.akash.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Batch {
	@Id
	@Column
	private String batchId;
	@Column
	private String batchName;
	
	@ManyToOne
	@JoinColumn(name="facultyId")
	private Faculty batchFaculty;
	
	
	public Batch() {
		
	}
	public Batch(String batchId, String batchName, Faculty batchFaculty) {
		super();
		this.batchId = batchId;
		this.batchName = batchName;
		this.batchFaculty = batchFaculty;
	}
	public String getBatchId() {
		return batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	public Faculty getBatchFaculty() {
		return batchFaculty;
	}
	public void setBatchFaculty(Faculty batchFaculty) {
		this.batchFaculty = batchFaculty;
	}
	@Override
	public String toString() {
		return "Batch [BatchId=" + batchId + ", BatchName=" + batchName + ", BatchFaculty=" + batchFaculty + "]";
	}
	
	
	
	
}
