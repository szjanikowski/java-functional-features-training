package com.itlibrium.jfft;

// Service.java
class B1E1GenericMethods {

    public SpecificResult performOperation() {
        SpecificResult result = new SpecificResult();
        try {
            // Simulate operation
            result.setData("Operation successful");
            result.setResultCode(0);
        } catch (Exception e) {
            //FIXME: remove duplication
            if (e instanceof IllegalArgumentException) {
                result.setResultCode(2);
            } else {
                result.setResultCode(1);
            }
            return result;
        }
        return result;
    }

    public GenericResult anotherOperation() {
        GenericResult result = new GenericResult();
        try {
            // Simulate another operation
            result.setResultCode(0);
        } catch (Exception e) {
            //FIXME: remove duplication
            if (e instanceof IllegalArgumentException) {
                result.setResultCode(2);
            } else {
                result.setResultCode(1);
            }
            return result;
        }
        return result;
    }

    //TODO write new handleExceptions method parametrized by approprite type to remove duplication
    //use it in both places

}

// GenericResult.java
class GenericResult {
    private int resultCode;

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }
}

// SpecificResult.java
class SpecificResult extends GenericResult {
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}