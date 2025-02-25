package com.basic.customer_streams;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Tester {
	public static void main(String[] args) {
		int k = 3, m = 19;
		Optional<Integer> findFirst = getResult(k, m);
		findFirst.ifPresentOrElse(System.out::println, () -> System.out.println("No Customer Found"));
	}

	private static Optional<Integer> getResult(int k, int m) {
		// TODO Auto-generated method stub
		List<Customer> customerOrderData = CustomerData.getCustomerOrderData();
		return customerOrderData.stream()
				.collect(
						Collectors.groupingBy(
								Customer::getCustomerId, 
								Collectors.collectingAndThen(
										Collectors.toList(), 
										list -> Map.of(
												"count", list.size(),
												"sum", list.stream()
													.mapToInt(Customer::getOrderAmount)
													.sum()
												)
										)
								)
						).entrySet()
				.stream()
				.filter(entry -> entry.getValue().get("count") >= k && entry.getValue().get("sum") >= m)
				.map(Map.Entry::getKey)
				.findFirst();
	}
}
