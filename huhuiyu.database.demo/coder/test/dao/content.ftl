<#assign entityName="${nameInfo.entityName?uncap_first}">
package ${nameInfo.daoPackage};

import java.util.List;
import ${nameInfo.entityPackage}.${nameInfo.entityName};

/**
 * ${nameInfo.entityName}的数据访问接口类
 */
public interface ${nameInfo.daoName} {
	
	/**
	 * 保存${nameInfo.entityName}数据
	 * 
	 * @param ${entityName}
	 *            实体数据
	 * @throws Exception
	 */
	public void save${nameInfo.entityName}(${nameInfo.entityName} ${entityName}) throws Exception;
	
	/**
	 * 修改${nameInfo.entityName}数据
	 * 
	 * @param ${entityName}
	 *            实体数据
	 * @throws Exception
	 */
	public void update${nameInfo.entityName}(${nameInfo.entityName} ${entityName}) throws Exception;
	
	/**
	 * 删除${nameInfo.entityName}数据
	 * 
	 * @param ${entityName}
	 *            实体数据
	 * @throws Exception
	 */
	public void delete${nameInfo.entityName}(${nameInfo.entityName} ${entityName}) throws Exception;
	
	/**
	 * 按照主键查询${nameInfo.entityName}数据
	 * 
	 * @param ${entityName}
	 *            带主键数据的实体数据
	 * @return 主键查询结果，没有值返回null
	 * @throws Exception
	 */
	public ${nameInfo.entityName} query${nameInfo.entityName}ByKey(${nameInfo.entityName} ${entityName}) throws Exception;
	
	/**
	 * 查询全部的${nameInfo.entityName}数据
	 * 
	 * @return 全部的${nameInfo.entityName}数据
	 * @throws Exception
	 */
	public List<${nameInfo.entityName}> queryAll${nameInfo.entityName}() throws Exception;
}
