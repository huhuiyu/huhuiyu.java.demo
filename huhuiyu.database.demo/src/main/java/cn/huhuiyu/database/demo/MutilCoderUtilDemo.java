package cn.huhuiyu.database.demo;

import java.io.File;
import java.util.List;

import cn.huhuiyu.database.codebuilder.CoderInfo;
import cn.huhuiyu.database.codebuilder.MutilCoderUtil;
import cn.huhuiyu.database.datasource.DataSourceBuilder;
import cn.huhuiyu.database.datasource.builder.BasicBuilderUtils;

public class MutilCoderUtilDemo {

	public static void main(String[] args) throws Exception {
		long start = System.currentTimeMillis();
		DataSourceBuilder builder = BasicBuilderUtils.getMySQLBuilder();
		builder.setInfo("JavaGradleDemo", "127.0.0.1", "", "huhuiyu", "paul", null);
		// DataSourceBuilder builder = BasicBuilderUtils.getMSSQLBuilder();
		// builder.setInfo("hibernate_demo", "192.168.56.101", "", "sa", "sa-123",
		// null);
		// DataSourceBuilder builder = BasicBuilderUtils.getOracleBuilder();
		// builder.setInfo("oracle11", "192.168.56.101", "", "huhuiyu", "paul",
		// "huhuiyu");
		MutilCoderUtil util = new MutilCoderUtil("coder/test", "org.huhuiyu.test", new CoderInfo(builder));
		List<File> list = util.bulidFiles();
		System.out.println("++++++++++++++++++++++++++++++++++++");
		for (File file : list) {
			System.out.println(file);
		}
		System.out.println("++++++++++++++++++++++++++++++++++++");
		long len = System.currentTimeMillis() - start;
		System.out.println("生成代码消耗时间：" + (len / 1000) + "秒" + (len % 1000) + "毫秒");

	}
}
