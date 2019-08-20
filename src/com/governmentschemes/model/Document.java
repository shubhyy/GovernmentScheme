package com.governmentschemes.model;

public class Document {
	private int documentId;
	private String documentName;

	public int getDocumentId() {
		return documentId;
	}

	public void setDocumentId(int documentId) {
		this.documentId = documentId;
	}

	public String getDocumentName() {
		return documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	public Document(int documentId, String documentName) {
		super();
		this.documentId = documentId;
		this.documentName = documentName;
	}

}
