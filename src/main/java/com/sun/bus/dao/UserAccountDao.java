package com.sun.bus.dao;

import java.util.List;
import java.util.Map;

public interface UserAccountDao {

	public int queryUserAccountTotal();

	public List<Map<String, String>> queryUserAccountList(Map<String, Integer> params);

	public Map<String, String> queryUserAccount(Map<String, String> params);
}
