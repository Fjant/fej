package com.citicpru.euis.autopay.service;

import java.util.List;

import com.citicpru.euis.exception.ServiceException;
import com.citicpru.euis.process.dao.vo.EUIS048VO;

/**
 * <p>
 * Title:IPaymentDataService 类
 * </p>
 * <p>
 * Description:自动付款-付款资料查询
 * </p>
 * <p>
 * Copyright: Copyright (c) 2010
 * </p>
 * <p>
 * Company: 广州软通动力信息技术有限公司
 * </p>
 * 
 * @author mingl
 * @version v1.0
 * @date 2010-4-26
 */
public interface IPaymentDataService {
    
    
    /**
     * 根据客户号码获取付款资料记录
     * @param euis048VO
     * @return List
     * @throws ServiceException
     */
    public List getPaymentList(EUIS048VO euis048VO) throws ServiceException;
    
    /**
     * 根据客户号码查询受款人姓名
     * @param id
     * @return String
     * @throws ServiceException
     */
    public String querySurname(String id) throws ServiceException;

}
