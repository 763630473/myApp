/** 
   * @工程名 : myApp
   * @文件名 : IRepository.java
   * @工具包名：com.sise.deng.Repository
   * @功能描述: TODO
   * @创建人 ：邓家海
   * @创建时间：2018年11月1日 上午9:36:05
   * @版本信息：V1.0 
   */
package com.sise.deng.IRepository;

import java.io.Serializable;
import java.util.List;

/**
   * @类 名： IRepository
   * @功能描述： TODO
   * @作者信息： 邓家海
   * @创建时间： 2018年11月1日上午9:36:05
   * @修改备注：
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
