package com.satishlabs.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;

import javax.annotation.Resource;
import javax.sql.DataSource;



public class TestService {
	@Resource(name = "oracleDS")
	private DataSource oracleDS;
	
	@Resource(name = "mysqlDS")
	private DataSource mysqlDS;
	
	public void showOracleInfo() {
		try {
			Connection oracon = oracleDS.getConnection();
			DatabaseMetaData oradbmd = oracon.getMetaData();
			System.out.println(oradbmd.getDefaultTransactionIsolation());
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
