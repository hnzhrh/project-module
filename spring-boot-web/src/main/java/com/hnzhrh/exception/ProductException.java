package com.hnzhrh.exception;

import com.hnzhrh.util.result.CodeMsg;
import lombok.Data;

@Data
public class ProductException extends RuntimeException{
    private CodeMsg codeMsg;
    public ProductException(CodeMsg codeMsg) {
        super(codeMsg.toString());
        this.codeMsg = codeMsg;
    }
}
