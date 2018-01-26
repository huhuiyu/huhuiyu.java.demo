package cn.huhuiyu.database.demo;

import java.sql.Connection;

import javax.sql.DataSource;

import cn.huhuiyu.database.datasource.DataSourceBuilder;
import cn.huhuiyu.database.datasource.builder.BasicBuilderUtils;

public class DataSourceBuilderDemo {
	public static void main(String[] args) throws Exception {
		DataSourceBuilder builder = BasicBuilderUtils.getMySQLBuilder();
		builder.setInfo("JavaGradleDemo", "127.0.0.1", "", "huhuiyu", "paul", null);
		DataSource ds = builder.getDataSource();
		Connection conn = ds.getConnection();
		System.out.println(conn.getCatalog());
		conn.close();
	}
}
