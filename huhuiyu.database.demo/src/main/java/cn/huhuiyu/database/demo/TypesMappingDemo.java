package cn.huhuiyu.database.demo;

import java.util.Map;
import cn.huhuiyu.database.meta.TypeInfo;
import cn.huhuiyu.database.meta.Types;

public class TypesMappingDemo {
	public static void main(String[] args) {
		Types types = new Types();
		Map<String, TypeInfo> map = types.getTypes();
		for (String key : map.keySet()) {
			System.out.println(map.get(key));
		}
	}
}
