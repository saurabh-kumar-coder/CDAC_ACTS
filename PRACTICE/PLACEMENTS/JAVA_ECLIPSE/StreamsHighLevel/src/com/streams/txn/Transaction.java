package com.streams.txn;

public class Transaction {
	int txnId;
	int custId;
	int amt;
	public int getTxnId() {
		return txnId;
	}
	public void setTxnId(int txnId) {
		this.txnId = txnId;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public int getAmt() {
		return amt;
	}
	public void setAmt(int amt) {
		this.amt = amt;
	}
	public Transaction(int txnId, int custId, int amt) {
		super();
		this.txnId = txnId;
		this.custId = custId;
		this.amt = amt;
	}
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
