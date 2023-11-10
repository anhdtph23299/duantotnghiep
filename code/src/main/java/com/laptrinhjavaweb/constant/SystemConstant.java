package com.laptrinhjavaweb.constant;

public class SystemConstant {

    public static final String ROLE_CUSTOMER = "CUSTOMER";

    public static final Integer STATUS_ACTICE = 1;

    public static final Integer STATUS_IN_ACTICE = 0;

    public static final long ACCESS_TOKEN_VALIDITY_SECONDS_STAFF = 43200000;

    public static final long ACCESS_TOKEN_VALIDITY_SECONDS_WEB = 3600000;//1h

    public static final String SIGNING_KEY = "laptrinhjavaweb";

    public static final String TOKEN_PREFIX = "Bearer ";

    public static final String HEADER_STRING = "Authorization";

    public static final String AUTHORITIES_KEY = "scopes";
}
