package cn.huhuiyu.database.demo;

import java.io.File;
import java.util.List;

import cn.huhuiyu.database.codebuilder.CoderInfo;
import cn.huhuiyu.database.codebuilder.CoderUtil;
import cn.huhuiyu.database.datasource.DataSourceBuilder;
import cn.huhuiyu.database.datasource.builder.BasicBuilderUtils;

public class CoderUtilDemo {

	public static void main(String[] args) throws Exception {
		DataSourceBuilder builder = BasicBuilderUtils.getMySQLBuilder();
		builder.setInfo("SpringAngualrjsDemo", "127.0.0.1", "", "huhuiyu", "paul", null);
		// DataSourceBuilder builder = BasicBuilderUtils.getMSSQLBuilder();
		// builder.setInfo("hibernate_demo", "192.168.56.101", "", "sa", "sa-123",
		// null);
		// DataSourceBuilder builder = BasicBuilderUtils.getOracleBuilder();
		// builder.setInfo("oracle11", "192.168.56.101", "", "huhuiyu", "paul",
		// "huhuiyu");
		CoderUtil util = new CoderUtil("coder/test/entity", "org.huhuiyu.test", new CoderInfo(builder));
		List<File> list = util.bulidFiles();
		System.out.println("++++++++++++++++++++++++++++++++++++");
		for (File file : list) {
			System.out.println(file);
		}
		// System.out.println("++++++++++++++++++++++++++++++++++++");
		// util.setDir("coder/test/spring");
		//
		//
		// list = util.bulidFiles();
		// System.out.println("++++++++++++++++++++++++++++++++++++");
		// for (File file : list) {
		// System.out.println(file);
		// }
		// System.out.println("++++++++++++++++++++++++++++++++++++");

	}
}
