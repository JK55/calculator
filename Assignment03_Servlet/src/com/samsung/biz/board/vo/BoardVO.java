package com.samsung.biz.board.vo;

import java.sql.Date;

import com.samsung.common.CommonVO;

public class BoardVO extends CommonVO {
	
	private int seq;
	private String title;
	private String nickname;
	private String content;
	private Date regdate;
	private int cnt;
	private String userid;
	
	public BoardVO() {
		super();
	}

	public BoardVO(int seq, String title, String nickname, String content,
			Date regdate, int cnt, String userid) {
		super();
		this.seq = seq;
		this.title = title;
		this.nickname = nickname;
		this.content = content;
		this.regdate = regdate;
		this.cnt = cnt;
		this.userid = userid;
	}
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}

	@Override
	public String toString() {
		return "BoardVO [seq=" + seq + ", title=" + title + ", nickname="
				+ nickname + ", content=" + content + ", regdate=" + regdate
				+ ", cnt=" + cnt + ", userid=" + userid
				+ ", getSearchCondition()=" + getSearchCondition()
				+ ", getSearchKeyword()=" + getSearchKeyword() + "]";
	}
	

}
