package com.sun.bus.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danga.MemCached.MemCachedClient;
import com.danga.MemCached.SockIOPool;
import com.sun.bus.dao.UserAccountDao;
import com.sun.bus.service.UserAccountSevice;

@Service("userService")
public class UserAccountServiceImpl implements UserAccountSevice {
	@Autowired
	private final UserAccountDao userAccountDao = null;

	MemCachedClient cache = new MemCachedClient();

	static {
		String[] addr = { "127.0.0.1:11211" };
		Integer[] weights = { 3 };
		SockIOPool pool = SockIOPool.getInstance();
		pool.setServers(addr);
		pool.setWeights(weights);
		pool.setInitConn(5);
		pool.setMinConn(5);
		pool.setMaxConn(200);
		pool.setMaxIdle(1000 * 30 * 30);
		pool.setMaintSleep(30);
		pool.setNagle(false);
		pool.setSocketTO(30);
		pool.setSocketConnectTO(0);
		pool.initialize();
	}

	@Override
	public void cacheUserAccount() {
		// int total = userAccountDao.queryUserAccountTotal();
		// int pageNum = 1000;
		// int pageSize = total % pageNum == 0 ? total / pageNum : total / pageNum +
		// 1;
		// int beginNum;
		// int endNum;
		// Map<String, Integer> params = new HashMap<String, Integer>();
		// List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		// for (int i = 0; i < pageSize; i++) {
		// beginNum = pageNum * i;
		// endNum = pageNum * (i + 1);
		// params.put("beginNum", beginNum);
		// params.put("endNum", endNum);
		// list = userAccountDao.queryUserAccountList(params);
		// for (Map<String, String> vo : list) {
		// cache.add(vo.get("BUS_NO"), vo.get("FEE"));
		// }
		// }

	};

	@Override
	public Map queryUserAccount(Map params) {
		Map result = new HashMap();
		return result;
	};

}
