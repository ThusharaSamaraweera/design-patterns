package com.company.factory;

import com.company.factory.operation.Operation;
import com.company.factory.operation.OperationFactory;

public class Main {
  public static void main(String[] args) {
    String selectOperation = "add";
    Double[] numbers = new Double[]{12.0, 2.0};

    OperationFactory operationFactory = new OperationFactory();
    Operation operation = operationFactory.getInstance(selectOperation);
    System.out.println(operation.execute(numbers));
  }
}
