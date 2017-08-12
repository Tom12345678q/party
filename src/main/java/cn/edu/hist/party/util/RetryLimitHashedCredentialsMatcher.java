package cn.edu.hist.party.util;

import java.util.concurrent.atomic.AtomicInteger;

import org.apache.log4j.Logger;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheManager;

/**
 * 假如用户在一段时间内输入太多次密码
 * 便不让输入
 * @author 丁赵雷
 *
 */
public class RetryLimitHashedCredentialsMatcher extends HashedCredentialsMatcher{
	
	/**
	 * 先声明一个 密码重试缓存 这个起什麽名字都可以重要的是要与下面的程序相照应
	 * AtomicInteger是可以用原子方式更新的 int 值的一个工具类具体说明请参考javaAPI
	 */
	private Cache<String, AtomicInteger> passwordRetryCache;
	
	
	/**
	 * 我们先通过构造器注入一个实例 也可以通过其他方法，但要与spring-shiro-web.xml
	 * 的配置相对应
	 * @param cacheManager
	 */
	public RetryLimitHashedCredentialsMatcher(CacheManager cacheManager){
		//得到一个缓存实例
		passwordRetryCache = cacheManager.getCache("passwordRetryCache");
	}
	
	
	/**
	 * 重写<code>HashedCredentialsMatcher</code>的核心方法以便我们进行扩展
	 */
    @Override
    public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
		
    	Logger log = Logger.getLogger(this.getClass());
    	log.info("token.toString() == "+token.toString());
    	log.info("info.toString() == "+info.toString());
    	
    	String username = String.valueOf(token.getPrincipal());
    	
    	AtomicInteger retryCount = passwordRetryCache.get("username");
    	
    	if(retryCount == null){
    		retryCount = new AtomicInteger(0);
    		passwordRetryCache.put(username, retryCount);
    	}else {
			if(retryCount.incrementAndGet() > 5) {
				throw new ExcessiveAttemptsException();
			}
		}
    	
    	//调用父类的方法进行信息的认证
    	Boolean match = super.doCredentialsMatch(token, info);
    	
        if(match) {
            passwordRetryCache.remove(username);
        }
        return match;
    }
	
	

}
