package com.citicpru.euis.autopay.service;

import java.util.List;

import com.citicpru.euis.exception.ServiceException;
import com.citicpru.euis.process.dao.vo.EUIS048VO;

/**
 * <p>
 * Title:IPaymentDataService ��
 * </p>
 * <p>
 * Description:�Զ�����-�������ϲ�ѯ
 * </p>
 * <p>
 * Copyright: Copyright (c) 2010
 * </p>
 * <p>
 * Company: ������ͨ������Ϣ�������޹�˾
 * </p>
 * 
 * @author mingl
 * @version v1.0
 * @date 2010-4-26
 */
public interface IPaymentDataService {
    
    
    /**
     * ���ݿͻ������ȡ�������ϼ�¼
     * @param euis048VO
     * @return List
     * @throws ServiceException
     */
    public List getPaymentList(EUIS048VO euis048VO) throws ServiceException;
    
    /**
     * ���ݿͻ������ѯ�ܿ�������
     * @param id
     * @return String
     * @throws ServiceException
     */
    public String querySurname(String id) throws ServiceException;

}
