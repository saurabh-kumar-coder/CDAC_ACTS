package com.streams.txn;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Tester {
	public static void main(String[] args) {
		int n = 3, x = 400;

//		Optional<Integer> res = getResult(n, x);
//		res.ifPresentOrElse(System.out::println, () -> System.out.println("No Txn found"));

		getResult(n, x).ifPresentOrElse(System.out::println, () -> System.out.println("No Txn Found"));
	}

	private static Optional<Integer> getResult(int n, int x) {
		// TODO Auto-generated method stub
		List<Transaction> txnData = TransactionData.getTxnData();
		return txnData.stream()
				.collect(
						Collectors.groupingBy(
								Transaction::getCustId,
								Collectors.collectingAndThen(
										Collectors.toList(), 
										list -> Map.of(
													"count", list.size(),
													"sum", list.stream().mapToInt(Transaction::getAmt).sum()
												)
										)
						)).entrySet()
				.stream()
				.filter(entry -> entry.getValue().get("count") >= n && entry.getValue().get("sum") >= x)
				.map(Map.Entry::getKey)
				.findFirst();
	}
}
