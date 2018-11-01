/** 
   * @������ : myApp
   * @�ļ��� : RepositoryImpl.java
   * @���߰�����com.sise.deng.Repository
   * @��������: TODO
   * @������ ���˼Һ�
   * @����ʱ�䣺2018��11��1�� ����9:37:28
   * @�汾��Ϣ��V1.0 
   */
package com.sise.deng.Repository;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.StatelessSession;
import org.hibernate.TransactionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sise.deng.IRepository.IRepository;

/**
   * @�� ���� RepositoryImpl
   * @���������� TODO
   * @������Ϣ�� �˼Һ�
   * @����ʱ�䣺 2018��11��1������9:37:28
   * @�޸ı�ע��
   */
@Repository(value="Repository")
public class RepositoryImpl<T> implements IRepository<T> {
	@Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return this.sessionFactory.openSession();
    }
    private StatelessSession getCurrentStatelessSession() {
        return this.sessionFactory.openStatelessSession();
    }
	/** ( �� Javadoc) 
	   * <p>Title: load</p> 
	   * <p>Description: </p> 
	   * @param id
	   * @return 
	   * @see com.sise.deng.Repository.IRepository#load(java.io.Serializable) 
	   */
	public T load(Class<T> c,String id) {
		return (T)getCurrentSession().load(c,id);
	}

	/** ( �� Javadoc) 
	   * <p>Title: get</p> 
	   * <p>Description: </p> 
	   * @param id
	   * @return 
	   * @see com.sise.deng.Repository.IRepository#get(java.io.Serializable) 
	   */
	public T get(Class<T> c,String id) {		
		return (T)getCurrentSession().get(c,id);
	}

	/** ( �� Javadoc) 
	   * <p>Title: findAll</p> 
	   * <p>Description: </p> 
	   * @return 
	   * @see com.sise.deng.Repository.IRepository#findAll() 
	   */
	public List<T> findAll() {
		return null;
	}

	/** ( �� Javadoc) 
	   * <p>Title: persist</p> 
	   * <p>Description: </p> 
	   * @param entity 
	   * @see com.sise.deng.Repository.IRepository#persist(java.lang.Object) 
	   */
	public void persist(Object entity) {
		// TODO Auto-generated method stub
		
	}

	/** ( �� Javadoc) 
	   * <p>Title: save</p> 
	   * <p>Description: </p> 
	   * @param entity
	   * @return 
	   * @see com.sise.deng.Repository.IRepository#save(java.lang.Object) 
	   */
	public Serializable save(T entity) throws TransactionException {		
		System.out.println(entity.toString());
		Session session=getCurrentSession();
		Serializable s=null;
		 session.beginTransaction();
		 try{
			  s=session.save(entity);
		      session.getTransaction().commit();
		 }catch(TransactionException ex){
			 session.getTransaction().rollback();
			 throw ex;			
		 }		 		
		return s;
	}

	/** ( �� Javadoc) 
	   * <p>Title: saveOrUpdate</p> 
	   * <p>Description: </p> 
	   * @param entity 
	   * @see com.sise.deng.Repository.IRepository#saveOrUpdate(java.lang.Object) 
	   */
	public void saveOrUpdate(Object entity) {
		// TODO Auto-generated method stub
		
	}

	/** ( �� Javadoc) 
	   * <p>Title: delete</p> 
	   * <p>Description: </p> 
	   * @param id 
	   * @see com.sise.deng.Repository.IRepository#delete(java.io.Serializable) 
	   */
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	/** ( �� Javadoc) 
	   * <p>Title: flush</p> 
	   * <p>Description: </p>  
	   * @see com.sise.deng.Repository.IRepository#flush() 
	   */
	public void flush() {
		getCurrentSession().flush();	
	}

}
