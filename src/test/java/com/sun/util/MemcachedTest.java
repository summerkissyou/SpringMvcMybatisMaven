/**
 * 
 */
package com.sun.util;

import java.util.UUID;

import com.danga.MemCached.MemCachedClient;
import com.danga.MemCached.SockIOPool;

/**
 * 
 * @Author summerkissyou
 * @Date Apr 27, 2016 9:46:10 PM
 * @Version
 */
public class MemcachedTest {
	public static void main(String[] args) {
		MemCachedClient cache = new MemCachedClient();
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
		UUID uuid = null;
		long startTime = System.currentTimeMillis();
		for (int i = 0; i <= 2000000; i++) {
			uuid = UUID.randomUUID();
			System.out.println(i + ":" + uuid.toString());
			cache.add(uuid.toString(), uuid);
		}
		long endTime = System.currentTimeMillis();
		System.out.println(cache.get(uuid.toString()) + " 耗时:" + (endTime - startTime) + "ms");
		// // String [] s =pool.getServers();
		// client.setCompressEnable(true);
		// client.setCompressThreshold(1000 * 1024);

	}
}
