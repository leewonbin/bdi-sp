package com.bdi.sp.vo;

public class Board {
	private Integer binum;
	private String bititle;
	private String bitext;
	private String bifile;
	private String bimoddat;
	private String bicredat;
	private Integer bicnt;
	private int uinum;
	private int bictive;
	@Override
	public String toString() {
		return "Board [binum=" + binum + ", bititle=" + bititle + ", bitext=" + bitext + ", bifile=" + bifile
				+ ", bimoddat=" + bimoddat + ", bicredat=" + bicredat + ", bicnt=" + bicnt + ", uinum=" + uinum
				+ ", bictive=" + bictive + "]";
	}
	public Integer getBinum() {
		return binum;
	}
	public void setBinum(Integer binum) {
		this.binum = binum;
	}
	public String getBititle() {
		return bititle;
	}
	public void setBititle(String bititle) {
		this.bititle = bititle;
	}
	public String getBitext() {
		return bitext;
	}
	public void setBitext(String bitext) {
		this.bitext = bitext;
	}
	public String getBifile() {
		return bifile;
	}
	public void setBifile(String bifile) {
		this.bifile = bifile;
	}
	public String getBimoddat() {
		return bimoddat;
	}
	public void setBimoddat(String bimoddat) {
		this.bimoddat = bimoddat;
	}
	public String getBicredat() {
		return bicredat;
	}
	public void setBicredat(String bicredat) {
		this.bicredat = bicredat;
	}
	public Integer getBicnt() {
		return bicnt;
	}
	public void setBicnt(Integer bicnt) {
		this.bicnt = bicnt;
	}
	public int getUinum() {
		return uinum;
	}
	public void setUinum(int uinum) {
		this.uinum = uinum;
	}
	public int getBictive() {
		return bictive;
	}
	public void setBictive(int bictive) {
		this.bictive = bictive;
	}

}
