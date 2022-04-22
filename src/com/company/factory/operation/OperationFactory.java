package com.company.factory.operation;

public class OperationFactory {

  // object will be created in run time
  public Operation getInstance(String operation){
    Operation operation1 = null;
    if(operation.equals("add")){
      operation1 = new AddOperation();
    }else if (operation.equals("sub")){
      operation1 = new SubOperation();
    }else if (operation.equals("mul")){
      operation1 = new MulOperation();
    }else if (operation.equals("div")){
      operation1 = new DivOperation();
    }

    return operation1;
  }
}
