package org.iflab.wc.model;

public class ExploreItem {
	private String name;
	private String question;
	private String type;
	private String avatar_file;
	private String question_id;
	private String uid;
	private int inttag;

	public ExploreItem() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAvatar_file() {
		return avatar_file;
	}

	public void setAvatar_file(String avatar_file) {
		this.avatar_file = avatar_file;
	}
	public String getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(String question_id) {
		this.question_id = question_id;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public int getInttag() {
		return inttag;
	}
	public void setInttag(int inttag) {
		this.inttag = inttag;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
