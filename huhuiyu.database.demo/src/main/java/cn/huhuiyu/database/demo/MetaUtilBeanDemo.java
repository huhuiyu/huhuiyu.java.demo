package cn.huhuiyu.database.demo;

import java.sql.Connection;
import java.util.List;

import javax.sql.DataSource;

import cn.huhuiyu.database.datasource.DataSourceBuilder;
import cn.huhuiyu.database.datasource.builder.BasicBuilderUtils;
import cn.huhuiyu.database.meta.MetaUtilBean;
import cn.huhuiyu.database.meta.Table;
import cn.huhuiyu.database.meta.TableColumn;

public class MetaUtilBeanDemo {
	public static void main(String[] args) throws Exception {
		DataSourceBuilder builder = BasicBuilderUtils.getMySQLBuilder();
		builder.setInfo("JavaGradleDemo", "127.0.0.1", "", "huhuiyu", "paul", null);
		// DataSourceBuilder builder = BasicBuilderUtils.getMSSQLBuilder();
		// builder.setInfo("hibernate_demo", "192.168.56.101", "", "sa",
		// "sa-123",
		// null);
		// DataSourceBuilder builder = BasicBuilderUtils.getOracleBuilder();
		// builder.setInfo("oracle11", "192.168.56.101", "", "huhuiyu", "paul",
		// "huhuiyu");
		DataSource ds = builder.getDataSource();
		Connection conn = ds.getConnection();
		MetaUtilBean mub = new MetaUtilBean(conn, builder.getSchema());
		conn.close();
		List<Table> list = mub.getTables();
		for (Table table : list) {
			System.out.println();
			System.out.println(table);
			List<TableColumn> tclist = mub.getTableColumns(table);
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
			List<List<TableColumn>> tclists = MetaUtilBean.splitColumn(tclist);
			System.out.println("主键信息：");
			for (TableColumn tableColumn : tclists.get(0)) {
				System.out.println(tableColumn);
			}
			System.out.println("外键信息：");
			for (TableColumn tableColumn : tclists.get(1)) {
				System.out.println(tableColumn);
			}
			System.out.println("其它键信息：");
			for (TableColumn tableColumn : tclists.get(2)) {
				System.out.println(tableColumn);
			}
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println();
		}
		Table t = list.get(0);
		System.out.println(mub.containsTable(t));
		t = new Table();
		t.setTableName("哈哈哈");
		System.out.println(mub.containsTable(t));

	}
}
