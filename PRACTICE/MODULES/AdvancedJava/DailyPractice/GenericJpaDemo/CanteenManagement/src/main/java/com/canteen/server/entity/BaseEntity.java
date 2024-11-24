package com.canteen.server.entity;

public abstract class BaseEntity<ID> {
	ID id;
	public ID getId() {
		return this.id;
	}
	public void setId(ID id) {
		this.id = id;
	}
}
