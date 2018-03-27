package symboltable;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import ast.program.Definition;

public class SymbolTable {
	
	private int scope=0;
	private List<Map<String,Definition>> table;
	
	public SymbolTable()  {
		table = new LinkedList<Map<String, Definition>>();
	}

	//only 2 scopes in our language
	// NO NESTED VAR DEFINITIONS ALLOWED
	// 0 for field defitions outside
	// 1 for field defitions inside a method or struct
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
		return this.table.get(scope).put(definition.getName(), definition) == null;
	}
	
	public Definition find(String id) {
		Definition def = null;
		for (Map<String, Definition> map : table) {
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
