package com.xxx.ssh.web.util;
import org.apache.commons.codec.digest.DigestUtils;
public class MD5Utils {
	public static String md5(String source) {
		return DigestUtils.md5Hex(source);
	}
}
