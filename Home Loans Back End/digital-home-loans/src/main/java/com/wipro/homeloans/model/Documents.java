package com.wipro.homeloans.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="documents")
public class Documents {
	
	@Id
	private Long docId;
	
	private String  docName;
	
	public Long getDocId() {
		return docId;
	}
	public void setDocId(Long docId) {
		this.docId = docId;
	}
	public String getDocName() {
		return docName;
	}
	public void setDocName(String docName) {
		this.docName = docName;
	}
	
	@Override
	public String toString() {
		return "Document [docId=" + docId + ", docName=" + docName + "]";
	}
	
	public Documents(Long docId, String docName) {
		this.docId = docId;
		this.docName = docName;
	}
	
	public Documents() {
		
	}
}
