/**
 * 
 */
package com.sun.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.UUID;

/**
 * 
 * @Author summerkissyou
 * @Date Apr 27, 2016 9:46:10 PM
 * @Version
 */
public class CreateSQLTest {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter(new File("E:/1.sql"));
		BufferedWriter bw = new BufferedWriter(fw);
		UUID uuid = null;
		long startTime = System.currentTimeMillis();
		for (int i = 0; i <= 2000000; i++) {
			uuid = UUID.randomUUID();
			bw.write("insert into t_user_account(bus_no,fee) values('" + uuid.toString() + "','" + uuid.toString() + "');\n");
			System.out.println(i + ":" + uuid.toString());
		}
		bw.close();
		fw.close();
		long endTime = System.currentTimeMillis();
		System.out.println(" 耗时:" + (endTime - startTime) + "ms");
	}
}
