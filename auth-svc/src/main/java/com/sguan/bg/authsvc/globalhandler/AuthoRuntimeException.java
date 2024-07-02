package com.sguan.bg.authsvc.globalhandler;

import lombok.Getter;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class AuthoRuntimeException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    @Getter
    private AuthRespCode error;

    @Getter
    private Object resp;

    public AuthoRuntimeException() {
        this(AuthRespCode.SEVER_ERROR);

    }

    public AuthoRuntimeException(AuthRespCode error) {
        super();
        this.error = error;
    }


    public AuthoRuntimeException(AuthRespCode error, Throwable e) {
        super(e);
        this.error = error;
    }

    public AuthoRuntimeException(AuthRespCode error, String msg) {
        super(msg);
        this.error = error;
    }


    public AuthoRuntimeException(AuthRespCode error, Object resp, Throwable e) {
        super(e);
        this.error = error;
        this.resp = resp;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("error", error)
                .append("msg", this.getMessage())
                .append("resp", resp).toString();
    }

}