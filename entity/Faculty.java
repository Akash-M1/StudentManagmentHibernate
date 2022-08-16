package co.akash.hibernate.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Faculty {
	@Id
	@Column
	private int facultyId;
	@Column
	private String facultyName;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="facultyId")
	private List<Batch> facultyBatches;
	
	

	public Faculty() {
		
	}

	public Faculty(int facultyId, String facultyName) {
		super();
		this.facultyId = facultyId;
		this.facultyName = facultyName;
	}

	public int getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public List<Batch> getFacultyBatches() {
		return facultyBatches;
	}

	public void setFacultyBatches(List<Batch> facultyBatches) {
		this.facultyBatches = facultyBatches;
	}

	@Override
	public String toString() {
		return "Faculty [FacultyId=" + facultyId + ", FacultyName=" + facultyName + ", FacultyBatches=" + facultyBatches
				+ "]";
	}
	
	
	
}
