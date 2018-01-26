package cn.huhuiyu.fileutil.demo;

import cn.huhuiyu.fileutil.NormalCipher;

public class Demo {

	public static void main(String[] args) throws Exception {
		String strTest = "abcd";
		String strTestEncrypt = "UHuoHLtdAbgfRQ9jOvsRmg==";
		String strEncrypt = NormalCipher.getSystemCipher().encryptString(strTest);
		System.out.println(strTestEncrypt.equals(strEncrypt));
		System.out.println(strTest.equals(NormalCipher.getSystemCipher().decryptString(strEncrypt)));
	}

}
