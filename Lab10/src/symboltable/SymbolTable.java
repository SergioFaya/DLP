package symboltable;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import ast.program.Definition;

public class SymbolTable {
	
	private int scope=0;
	private List<Map<String,Definition>> table;
	
	//TEST
	public SymbolTable()  {
		table = new LinkedList<Map<String, Definition>>();
		this.table.add(new HashMap<String,Definition>());
	}
	
	//only 2 scopes in our language
	// NO NESTED VAR DEFINITIONS ALLOWED
	// 0 for field definitions outside
	// 1 for field definitions inside a method or structs
	public void set() {
		this.table.add(new HashMap<String,Definition>());
		this.scope++;
	}
	
	public void reset() {
		this.scope--;
		this.table.remove(table.size()-1);
	}
	
	public boolean insert(Definition definition) {
		if(definition == null) {
			return false;
		}
		definition.setScope(scope);
		return this.table.get(scope).put(definition.getName(), definition) == null;
	}
	
	public Definition find(String id) {
		Definition def = null;
		Map<String,Definition> map = null;
		for (int i = table.size() -1; i >= 0; i-- ) {
			map = table.get(i);
			if((def = map.get(id)) != null) {
				return def;
			}
		}
		return def;
	}

	public Definition findInCurrentScope(String id) {
		return this.table.get(scope).get(id);
	}
}
