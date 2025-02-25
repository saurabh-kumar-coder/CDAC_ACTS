package com.streams.txn;

import java.util.List;

public class TransactionData {
	public static List<Transaction> getTxnData() {
		return List.of(
			    new Transaction(1, 201, 200),
			    new Transaction(2, 202, 150),
			    new Transaction(3, 201, 100),
			    new Transaction(4, 203, 50),
			    new Transaction(5, 202, 300),
			    new Transaction(6, 201, 150),
			    new Transaction(7, 201, 100),
			    new Transaction(8, 203, 200)
			);
	}
}
