package com.masai.bean;

public class Batch {

	private int batchId;
	private int courseId;
	private int facultyId;
	private int numberOfStudents;
	private String batchStartDate;
	private String duration;
	
	public Batch(int batchId, int courseId, int facultyId, int numberOfStudents, String batchStartDate,
			String duration) {
		
		this.batchId = batchId;
		this.courseId = courseId;
		this.facultyId = facultyId;
		this.numberOfStudents = numberOfStudents;
		this.batchStartDate = batchStartDate;
		this.duration = duration;
	}
	

	public Batch() {


	}


	public int getBatchId() {
		return batchId;
	}
	
	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}
	
	public int getCourseId() {
		return courseId;
	}
	
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	
	public int getFacultyId() {
		return facultyId;
	}
	
	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}
	
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}
	
	public String getBatchStartDate() {
		return batchStartDate;
	}
	
	public void setBatchStartDate(String batchStartDate) {
		this.batchStartDate = batchStartDate;
	}
	
	public String getDuration() {
		return duration;
	}
	
	public void setDuration(String duration) {
		this.duration = duration;
	}


	@Override
	public String toString() {
		return "Batch [batchId=" + batchId + ", courseId=" + courseId + ", facultyId=" + facultyId
				+ ", numberOfStudents=" + numberOfStudents + ", batchStartDate=" + batchStartDate + ", duration="
				+ duration + "]";
	}
	
	
	
}
