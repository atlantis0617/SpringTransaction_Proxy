package org.spring.service.impl;

import org.spring.dao.AccountDao;
import org.spring.service.AccountService;

/**   
 * @ClassName:  AccountServiceImpl   
 * @Description:转账操作业务层实现类
 * @author: 华洋科技 
 * @date:   2018年5月20日 上午8:22:30   
 *     
 * @Copyright: 2018 www.yhy.com Inc. All rights reserved. 
 * 
 */
public class AccountServiceImpl implements AccountService{
	
	private AccountDao accountDao;
	
	public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }
	
	/**   
	 * <p>Title: transfer</p>   
	 * <p>Description:转账 </p>   
	 * @param out
	 * @param in
	 * @param money   
	 * @see org.spring.service.AccountService#transfer(java.lang.String, java.lang.String, double)   
	 */
	@Override
	public void transfer(String out, String in, double money) {
		 accountDao.outMoney(out, money);
		 accountDao.inMoney(in, money);
	}

}
