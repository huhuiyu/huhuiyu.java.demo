package ${nameInfo.entityPackage};

public class ${nameInfo.entityName} implements java.io.Serializable {
	private static final long serialVersionUID=${serialVersionUID?c}L;
	<#list columnList[0] as column>
	private ${column.typeInfo.mapClassName} ${column.javaFieldString}; 
	</#list>
	<#list columnList[1] as column>
	private ${column.typeInfo.mapClassName} ${column.javaFieldString}; 
	</#list>
	
	public ${nameInfo.entityName}() {
	}

	public ${nameInfo.entityName}(<#list columns as column>${column.typeInfo.mapClassName} ${column.javaFieldString}<#if column_has_next>,</#if></#list>) {
	<#list columns as column>
		this.${column.javaFieldString} = ${column.javaFieldString};
	</#list>
	}
	
	<#list columns as column>
    public void ${column.javaSetter} (${column.typeInfo.mapClassName} ${column.javaFieldString}) {
    	this.${column.javaFieldString} = ${column.javaFieldString};
    }
    
    public ${column.typeInfo.mapClassName} ${column.javaGetter}() {
    	return ${column.javaFieldString};
    }
    
	</#list>
	@Override
	public String toString() {
		return String.format("<#list columns as column><#if column_has_next>${column.javaFieldString}:%s,</#if><#if !column_has_next>${column.javaFieldString}:%s</#if></#list>"<#list columns as column>,${column.javaFieldString}</#list>);
	}
}
