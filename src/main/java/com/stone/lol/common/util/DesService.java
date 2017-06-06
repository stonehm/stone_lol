package com.stone.lol.common.util;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.security.Key;
import java.security.SecureRandom;

/**
 * des加解密
 */
public final class DesService {

    private static final String KEY_ALGORITHM = "DES";

    private String key;

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * 生成密钥key对象
     */
    private SecretKey keyGeneratorByStr(String keyStr) throws Exception {
        byte input[] = keyStr.getBytes();
        DESKeySpec desKey = new DESKeySpec(input);
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(KEY_ALGORITHM);
        return keyFactory.generateSecret(desKey);
    }

    /**
     * 加密数据
     *
     * @param data 待加密数据
     * @return 加密后的数据
     */
    public String encrypt(String data) throws Exception {
        Key desKey = keyGeneratorByStr(key);
        Cipher cipher = Cipher.getInstance(KEY_ALGORITHM);
        SecureRandom random = new SecureRandom();
        cipher.init(Cipher.ENCRYPT_MODE, desKey, random);
        byte[] results = cipher.doFinal(data.getBytes("UTF-8"));
        return Base64.encode(results);
    }

    /**
     * 解密数据
     *
     * @param data 待解密数据
     * @return 解密后的数据
     */
    public String decrypt(String data) throws Exception {
        Key desKey = keyGeneratorByStr(key);
        Cipher cipher = Cipher.getInstance(KEY_ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, desKey);
        return new String(cipher.doFinal(Base64.decode(data)));
    }
}