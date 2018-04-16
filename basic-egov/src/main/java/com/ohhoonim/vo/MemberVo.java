package com.ohhoonim.vo;

public class MemberVo {
	private String memberId       ;
	private String memberTp       ;
	private String pwd            ;
	private String contact        ;
	private String remainPnt      ;
	private String remainPrchPnt  ;
	private String chainIdx       ;
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberTp() {
		return memberTp;
	}
	public void setMemberTp(String memberTp) {
		this.memberTp = memberTp;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getRemainPnt() {
		return remainPnt;
	}
	public void setRemainPnt(String remainPnt) {
		this.remainPnt = remainPnt;
	}
	public String getRemainPrchPnt() {
		return remainPrchPnt;
	}
	public void setRemainPrchPnt(String remainPrchPnt) {
		this.remainPrchPnt = remainPrchPnt;
	}
	public String getChainIdx() {
		return chainIdx;
	}
	public void setChainIdx(String chainIdx) {
		this.chainIdx = chainIdx;
	}
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb = sb.append("memberId:").append(this.memberId).append("|");
		sb = sb.append("memberTp:").append(this.memberTp).append("|");
		sb = sb.append("pwd:").append(this.pwd).append("|");
		sb = sb.append("contact:").append(this.contact).append("|");
		sb = sb.append("remainPnt:").append(this.remainPnt).append("|");
		sb = sb.append("remainPrchPnt:").append(this.remainPrchPnt).append("|");
		sb = sb.append("chainIdx:").append(this.chainIdx).append("|");
		
		return sb.toString();
		    
	}
}
