/** 
   * @������ : myApp
   * @�ļ��� : IRepository.java
   * @���߰�����com.sise.deng.Repository
   * @��������: TODO
   * @������ ���˼Һ�
   * @����ʱ�䣺2018��11��1�� ����9:36:05
   * @�汾��Ϣ��V1.0 
   */
package com.sise.deng.IRepository;

import java.io.Serializable;
import java.util.List;

/**
   * @�� ���� IRepository
   * @���������� TODO
   * @������Ϣ�� �˼Һ�
   * @����ʱ�䣺 2018��11��1������9:36:05
   * @�޸ı�ע��
   */
public interface IRepository <T>{
    T load(Class<T> c,String id);

    T get(Class<T> c,String id);

    List<T> findAll();

    void persist(T entity);

    Serializable save(T entity);

    void saveOrUpdate(T entity);

    void delete(String id);

    void flush();
}
