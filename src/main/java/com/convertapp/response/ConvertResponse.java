package com.convertapp.response;

import javax.xml.bind.annotation.XmlRootElement;

import com.convertapp.common.ResponseModel;

@XmlRootElement(name = "ConvertResponse")
public class ConvertResponse extends ResponseModel {

	private static final long serialVersionUID = -6198741841685510435L;
	private String value;
	private int pageNumber;
	private int pageSize;
	private long totalSize;
	private long totalPages;
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public long getTotalSize() {
		return totalSize;
	}
	public void setTotalSize(long totalSize) {
		this.totalSize = totalSize;
	}
	public long getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(long totalPages) {
		this.totalPages = totalPages;
	}
}
